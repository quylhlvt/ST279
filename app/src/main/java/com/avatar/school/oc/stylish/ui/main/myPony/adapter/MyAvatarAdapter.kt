package com.avatar.school.oc.stylish.ui.main.myPony.adapter

import android.content.Context
import com.avatar.school.oc.stylish.core.base.BaseAdapter
import com.avatar.school.oc.stylish.core.extention.gone
import com.avatar.school.oc.stylish.core.extention.loadImage
import com.avatar.school.oc.stylish.core.extention.onClick
import com.avatar.school.oc.stylish.core.extention.visible
import com.avatar.school.oc.stylish.data.model.mypony.MyAlbumModel
import com.avatar.school.oc.stylish.R
import com.avatar.school.oc.stylish.databinding.ItemMyAvatarBinding


class MyAvatarAdapter(val context: Context) :
    BaseAdapter<MyAlbumModel, ItemMyAvatarBinding>(ItemMyAvatarBinding::inflate) {
    var onItemClick: ((MyAlbumModel) -> Unit) = {}
    var onLongClick: ((Int) -> Unit) = {}
    var onItemTick: ((Int) -> Unit) = {}

    var onEditClick: ((String) -> Unit) = {}
    var onDeleteClick: ((String) -> Unit) = {}

    override fun onBind(binding: ItemMyAvatarBinding, item: MyAlbumModel, position: Int) {
        binding.apply {
            loadImage(root, item.path, imvImage)

            if (item.isShowSelection) {
                btnSelect.visible()
                btnEdit.gone()
                btnDelete.gone()
            } else {
                btnSelect.gone()
                btnEdit.visible()
                btnDelete.visible()
            }

            btnSelect.setImageResource(
                if (item.isSelected) R.drawable.ic_selected else R.drawable.ic_not_select
            )


            // Click luôn navigate, không check selection mode
            root.onClick { onItemClick.invoke(item) }

            root.setOnLongClickListener {
                if (items.any { it.isShowSelection }) return@setOnLongClickListener false
                onLongClick.invoke(position)
                true
            }

            btnEdit.onClick { onEditClick.invoke(item.idEdit) }
            btnDelete.onClick { onDeleteClick.invoke(item.path) }
            btnSelect.onClick { onItemTick.invoke(position) } // chỉ tick button mới toggle
        }
    }
}