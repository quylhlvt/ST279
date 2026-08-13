package com.avatar.school.oc.stylish.ui.main.customize

import android.graphics.Color
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.avatar.school.oc.stylish.R
import com.avatar.school.oc.stylish.core.base.BaseAdapter
import com.avatar.school.oc.stylish.core.extention.visible
import com.avatar.school.oc.stylish.data.model.custom.BodyPartModel
import com.avatar.school.oc.stylish.data.model.custom.ColorModel
import com.avatar.school.oc.stylish.databinding.ItemColorBinding
import com.avatar.school.oc.stylish.databinding.ItemLayerBinding
import com.avatar.school.oc.stylish.core.extention.gone
import com.avatar.school.oc.stylish.databinding.ItemBottomCustomBinding
import com.avatar.school.oc.stylish.utils.DataLocal
import com.facebook.shimmer.ShimmerDrawable

// ── NAV ADAPTER ───────────────────────────────────────────────────────────────
class NavAdapter :
    BaseAdapter<BodyPartModel, ItemBottomCustomBinding>(ItemBottomCustomBinding::inflate) {

    var posNav = 0
    var onClick: ((Int) -> Unit)? = null

    fun setPos(pos: Int) {
        val old = posNav; posNav = pos
        if (old != pos) {
            notifyItemChanged(old); notifyItemChanged(pos)
        }
    }

    override fun onBind(binding: ItemBottomCustomBinding, item: BodyPartModel, position: Int) {
        val shimmerDrawable = ShimmerDrawable().apply { setShimmer(DataLocal.shimmer) }

        binding.apply {
            val ctx = root.context

            frame1.setCardBackgroundColor(ContextCompat.getColor(
                ctx,
                if (posNav == position) R.color.app_color2 else R.color.white2
            ))

        Glide.with(imvImage)
            .load(item.nav)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .override(256)
            .dontAnimate()
            .placeholder(shimmerDrawable)
            .error(shimmerDrawable)
            .into(imvImage)

        root.setOnClickListener { onClick?.invoke(position) }
    }}
}

// ── COLOR ADAPTER ─────────────────────────────────────────────────────────────
class ColorAdapter : BaseAdapter<ColorModel, ItemColorBinding>(ItemColorBinding::inflate) {

    var posColor = 0
    var onClick: ((Int) -> Unit)? = null

    fun setPos(pos: Int) {
        val old = posColor; posColor = pos
        if (old != pos) {
            notifyItemChanged(old); notifyItemChanged(pos)
        }
    }

    override fun onBind(binding: ItemColorBinding, item: ColorModel, position: Int) {
        val isWhite = item.color.removePrefix("#").equals("FFFFFF", ignoreCase = true)
        val isSelected = posColor == position

        binding.colorSelected.isVisible = !isSelected && !isWhite
        binding.colorSelectedWhite.isVisible = !isSelected && isWhite

        val colorInt = runCatching {
            Color.parseColor("#${item.color.removePrefix("#").ifEmpty { "FFFFFF" }}")
        }.getOrDefault(Color.WHITE)

        DrawableCompat.setTint(binding.viewColor.background.mutate(), colorInt)
        binding.root.setOnClickListener { onClick?.invoke(position) }
    }
}

// ── PART ADAPTER ──────────────────────────────────────────────────────────────
class PartAdapter : BaseAdapter<String, ItemLayerBinding>(ItemLayerBinding::inflate) {

    var posPath: Int = 0
    var listThumb: List<String> = emptyList()
    var onClick: ((Int, String) -> Unit)? = null

    fun setPos(pos: Int) {
        val old = posPath; posPath = pos
        if (old != pos) {
            notifyItemChanged(old); notifyItemChanged(pos)
        }
    }

    override fun onBind(binding: ItemLayerBinding, item: String, position: Int) {
        val shimmerDrawable = ShimmerDrawable().apply { setShimmer(DataLocal.shimmer) }

        binding.apply {
            if (posPath == position) {
                forcus.visible()
            } else {
                forcus.gone()
            }
        when (item) {
            "none" -> {
                Glide.with(imvImage).clear(imvImage)
                imvImage.setImageResource(R.drawable.ic_none)
            }

            "dice" -> {
                Glide.with(imvImage).clear(imvImage)
                imvImage.setImageResource(R.drawable.ic_dice)
            }

            else -> {

                val thumbPath = listThumb.getOrElse(position) { item }
                Glide.with(imvImage)
                    .load(thumbPath)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .override(256)
                    .placeholder(shimmerDrawable)
                    .dontAnimate()
                    .into(imvImage)
            }
        }
        root.setOnClickListener { onClick?.invoke(position, item) }
    }}
}
