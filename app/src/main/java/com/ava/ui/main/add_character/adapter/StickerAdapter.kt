package com.ava.ui.main.add_character.adapter

import com.ava.core.base.BaseAdapter
import com.ava.core.extention.onClick
import com.ava.data.model.addcharacter.SelectedAddModel
import com.ava.utils.DataLocal
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.ava.databinding.ItemStickerBinding
import com.facebook.shimmer.ShimmerDrawable

class StickerAdapter : BaseAdapter<SelectedAddModel, ItemStickerBinding>(ItemStickerBinding::inflate) {
    var onItemClick: ((String) -> Unit) = {}
    var currentSelected = -1

    override fun onBind(binding: ItemStickerBinding, item: SelectedAddModel, position: Int) {
        val shimmerDrawable = ShimmerDrawable().apply { setShimmer(DataLocal.shimmer1) }

        binding.apply {
            Glide.with(imvImage)
                .load(item.path)
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .override(256)
                .dontAnimate()
                .placeholder(shimmerDrawable)
                .into(imvImage)
            root.onClick {
                selectItem(position)          // ← was missing entirely
                onItemClick.invoke(item.path)
            }
        }
    }

    fun selectItem(position: Int) {           // ← changed private → public
        if (position == currentSelected) return
        val old = currentSelected
        currentSelected = position
        if (old >= 0) notifyItemChanged(old)
        notifyItemChanged(position)
    }
}