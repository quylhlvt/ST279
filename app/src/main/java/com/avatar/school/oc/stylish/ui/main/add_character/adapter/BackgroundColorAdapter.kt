package com.avatar.school.oc.stylish.ui.main.add_character.adapter

import com.avatar.school.oc.stylish.core.base.BaseAdapter
import com.avatar.school.oc.stylish.core.extention.gone
import com.avatar.school.oc.stylish.core.extention.onClick
import com.avatar.school.oc.stylish.core.extention.visible
import com.avatar.school.oc.stylish.data.model.addcharacter.SelectedAddModel
import com.avatar.school.oc.stylish.databinding.ItemBackgroundColorBinding


class BackgroundColorAdapter : BaseAdapter<SelectedAddModel, ItemBackgroundColorBinding>(
    ItemBackgroundColorBinding::inflate
) {
    var onChooseColorClick: (() -> Unit) = {}
    var onNoneColorClick: (() -> Unit) = {}
    var onBackgroundColorClick: ((Int, Int) -> Unit) = { _, _ -> }
    var currentSelected = -1

    override fun onBind(binding: ItemBackgroundColorBinding, item: SelectedAddModel, position: Int) {
        val context = binding.root.context

        binding.apply {
            if (currentSelected == position) {
                materiaForcus.visible()
            } else {
                materiaForcus.gone()
            }
            if (position == 0) {
                imvImageNone.visible()
                imvAddColor.gone()
                imvColor.gone()
                root.onClick { onNoneColorClick() }
            } else if (position == 1) {
                imvImageNone.gone()
                imvAddColor.visible()
                imvColor.gone()
                root.onClick { onChooseColorClick() }
            } else {
                imvImageNone.gone()
                imvAddColor.gone()
                imvColor.visible()
                imvColor.setBackgroundColor(item.color)
                root.onClick { onBackgroundColorClick(item.color, position) }
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
}
