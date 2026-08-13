package com.avatar.school.oc.stylish.ui.main.add_character.adapter

import android.annotation.SuppressLint
import androidx.core.content.ContextCompat
import com.avatar.school.oc.stylish.core.base.BaseAdapter
import com.avatar.school.oc.stylish.core.extention.gone
import com.avatar.school.oc.stylish.core.extention.onClick
import com.avatar.school.oc.stylish.core.extention.visible
import com.avatar.school.oc.stylish.data.model.addcharacter.SelectedAddModel
import com.avatar.school.oc.stylish.R
import com.avatar.school.oc.stylish.databinding.ItemTextColorBinding

class TextColorAdapter :
    BaseAdapter<SelectedAddModel, ItemTextColorBinding>(ItemTextColorBinding::inflate) {
    var onChooseColorClick: (() -> Unit) = {}
    var onTextColorClick: ((Int, Int) -> Unit) = { _, _ -> }

    private var currentSelected = 1


    override fun onBind(binding: ItemTextColorBinding, item: SelectedAddModel, position: Int) {
        val context = binding.root.context
        binding.apply {
            // ── Luôn setup đúng content trước ──────────────────
            if (position == 0) {
                imvColor.gone()
                btnAddColor.visible()
                root.onClick { onChooseColorClick.invoke() }
            } else {
                imvColor.visible()
                btnAddColor.gone()
                imvColor.setBackgroundColor(item.color)
                root.onClick { onTextColorClick.invoke(item.color, position) }
            }

            // ── Sau đó mới apply selected state ────────────────
            if (item.isSelected) {
                frame.apply {
                    strokeColor = ContextCompat.getColor(context, R.color.app_color2)
                }
            } else {
                frame.apply {
                    strokeColor = ContextCompat.getColor(context, R.color.transparent)
                }
            }
        }
    }

        fun submitItem(position: Int, list: ArrayList<SelectedAddModel>) {
            if (position != currentSelected) {
                items.clear()
                items.addAll(list)

                notifyItemChanged(currentSelected)
                notifyItemChanged(position)

                currentSelected = position
            } else {
                // Màu custom có thể được chọn lại nhiều lần tại cùng vị trí 0.
                // Vẫn cập nhật dữ liệu để adapter không giữ giá trị màu cũ.
                items.clear()
                items.addAll(list)
                notifyItemChanged(position)
            }
        }

        @SuppressLint("NotifyDataSetChanged")
        fun submitListReset(list: ArrayList<SelectedAddModel>) {
            items.clear()
            items.addAll(list)
            currentSelected = list.indexOfFirst { it.isSelected }.takeIf { it >= 0 } ?: 1
            notifyDataSetChanged()
        }
    }
