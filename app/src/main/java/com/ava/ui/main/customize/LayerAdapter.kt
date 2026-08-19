package com.ava.ui.main.customize

import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.isVisible
import com.ava.core.base.BaseAdapter
import com.ava.core.extention.gone
import com.ava.core.extention.visible
import com.ava.data.model.custom.BodyPartModel
import com.ava.data.model.custom.ColorModel
import com.ava.utils.DataLocal
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.ava.R
import com.ava.databinding.ItemColorBinding
import com.ava.databinding.ItemLayerBinding
import com.ava.databinding.ItemBottomCustomBinding
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
            forcus.visibility = if(posNav ==position) View.VISIBLE else View.GONE
        Glide.with(imvImage)
            .load(item.nav)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .override(256)
            .dontAnimate()
            .placeholder(shimmerDrawable)
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
