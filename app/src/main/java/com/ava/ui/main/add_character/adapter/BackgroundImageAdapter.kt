package com.ava.ui.main.add_character.adapter

import com.ava.core.base.BaseAdapter
import com.ava.core.extention.gone
import com.ava.core.extention.onClick
import com.ava.core.extention.visible
import com.ava.data.model.addcharacter.SelectedAddModel
import com.ava.utils.DataLocal
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.facebook.shimmer.ShimmerDrawable
import com.ava.databinding.ItemBackgroundImageBinding


class BackgroundImageAdapter : BaseAdapter<SelectedAddModel, ItemBackgroundImageBinding>(
    ItemBackgroundImageBinding::inflate
) {
    var onAddImageClick: (() -> Unit) = {}
    var onNoneImageClick: (() -> Unit) = {}
    var onBackgroundImageClick: ((String, Int) -> Unit) = { _, _ -> }
    var currentSelected = -1

    override fun onBind(binding: ItemBackgroundImageBinding, item: SelectedAddModel, position: Int) {
        val shimmerDrawable = ShimmerDrawable().apply { setShimmer(DataLocal.shimmer1) }

        binding.apply {
            tvAddImage.isSelected = true
            if (currentSelected == position) {
                materiaForcus.visible()
            } else {
                materiaForcus.gone()
            }
            if (position == ADD_BACKGROUND_POSITION) {
                lnlAddItem.visible()
                imvImage.gone()
                imvImageNone.gone()
                lnlAddItem.onClick { onAddImageClick() }
            } else if (position == NONE_BACKGROUND_POSITION) {
                imvImageNone.visible()
                imvImage.gone()
                lnlAddItem.gone()
                imvImageNone.onClick { onNoneImageClick() }
            } else {
                lnlAddItem.gone()
                imvImageNone.gone()
                imvImage.visible()
                if (imvImage.tag != item.path) {
                    imvImage.tag = item.path
                    Glide.with(imvImage)
                        .load(item.path)
                        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                        .override(256)
                        .dontAnimate()
                        .placeholder(shimmerDrawable)
                        .into(imvImage)
                }
                imvImage.onClick { onBackgroundImageClick(item.path, position) }
            }
        }
    }

    fun selectItem(position: Int) {
        if (position == currentSelected) return
        val old = currentSelected
        currentSelected = position
        if (old >= 0) notifyItemChanged(old)
        if (position >= 0) notifyItemChanged(position)
    }

    fun clearSelection() {
        if (currentSelected < 0) return
        val old = currentSelected
        currentSelected = -1
        notifyItemChanged(old)
    }

    private companion object {
        const val ADD_BACKGROUND_POSITION = 0
        const val NONE_BACKGROUND_POSITION = 1
    }
}
