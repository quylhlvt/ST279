package com.ava.ui.main.add_character.adapter

import androidx.core.content.ContextCompat
import com.ava.core.base.BaseAdapter
import com.ava.core.extention.onClick
import com.ava.data.model.addcharacter.BackgroundCategoryModel
import com.ava.R
import com.ava.databinding.ItemTittleBackgroundImageBinding

class BackgroundCategoryAdapter :
    BaseAdapter<BackgroundCategoryModel, ItemTittleBackgroundImageBinding>(
        ItemTittleBackgroundImageBinding::inflate
    ) {

    var onCategoryClick: ((BackgroundCategoryModel, Int) -> Unit) = { _, _ -> }

    override fun onBind(
        binding: ItemTittleBackgroundImageBinding,
        item: BackgroundCategoryModel,
        position: Int
    ) {
        binding.apply {
            txtTittle.text = item.category
            val context = binding.root.context
            if (item.isSelected) {
                txtTittle.setTextColor(ContextCompat.getColor(context,R.color.app_color))
                frameTittle.background = ContextCompat.getDrawable(context, R.drawable.bg_8_title)
            } else {
                txtTittle.setTextColor(ContextCompat.getColor(context,R.color.white))
                frameTittle.background = null
            }

        }
        binding.root.onClick { onCategoryClick(item, position) }
    }
}
