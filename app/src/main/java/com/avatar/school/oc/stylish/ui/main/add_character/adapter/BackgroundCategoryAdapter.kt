package com.avatar.school.oc.stylish.ui.main.add_character.adapter

import androidx.core.content.ContextCompat
import com.avatar.school.oc.stylish.core.base.BaseAdapter
import com.avatar.school.oc.stylish.core.extention.onClick
import com.avatar.school.oc.stylish.data.model.addcharacter.BackgroundCategoryModel
import com.avatar.school.oc.stylish.R
import com.avatar.school.oc.stylish.databinding.ItemTittleBackgroundImageBinding

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
                frameTittle.background = ContextCompat.getDrawable(context, R.drawable.bg_8_title)
            } else {
                frameTittle.background = ContextCompat.getDrawable(context, R.drawable.bg_8_title_unselect)
            }

        }
        binding.root.onClick { onCategoryClick(item, position) }
    }
}
