package com.ava.ui.main.add_character.adapter

import androidx.core.content.ContextCompat
import com.ava.R
import com.ava.core.base.BaseAdapter

import com.ava.core.extention.onClick
import com.ava.data.model.addcharacter.SpeechCategoryModel
import com.ava.databinding.ItemTittleBackgroundImageBinding

class SpeechCategoryAdapter :
    BaseAdapter<SpeechCategoryModel, ItemTittleBackgroundImageBinding>(ItemTittleBackgroundImageBinding::inflate) {
    var onCategoryClick: ((SpeechCategoryModel, Int) -> Unit) = { _, _ -> }

    override fun onBind(binding: ItemTittleBackgroundImageBinding, item: SpeechCategoryModel, position: Int) {
        val context = binding.root.context
        binding.txtTittle.text = context.getString(R.string.bubbles)+" "+item.category
        binding.frameTittle.background = if (item.isSelected) {
            ContextCompat.getDrawable(context, R.drawable.img_bg_tittle_selected)
        } else {
            null
        }
        binding.txtTittle.setTextColor(
            ContextCompat.getColor(context, if (item.isSelected) R.color.app_color else R.color.white)
        )
        binding.root.onClick { onCategoryClick(item, position) }
    }
}
