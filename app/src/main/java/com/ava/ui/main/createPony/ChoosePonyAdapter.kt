package com.ava.ui.main.createPony

import com.ava.core.base.BaseAdapter
import com.ava.data.model.custom.CustomModel
import com.ava.utils.DataLocal
import com.bumptech.glide.Glide
import com.facebook.shimmer.ShimmerDrawable
import com.ava.databinding.ItemChooseBinding

class ChoosePonyAdapter(
    private val onClick: (character: CustomModel, position: Int) -> Unit
) : BaseAdapter<CustomModel, ItemChooseBinding>(ItemChooseBinding::inflate) {

    override fun onBind(binding: ItemChooseBinding, item: CustomModel, position: Int) {
        val shimmerDrawable = ShimmerDrawable().apply { setShimmer(DataLocal.shimmer1) }

        Glide.with(binding.root.context)
            .load(item.avatar)
            .placeholder(shimmerDrawable)
            .into(binding.imvImage)

        binding.root.setOnClickListener { onClick(item, position) }
    }
}