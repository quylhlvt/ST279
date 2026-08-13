package com.avatar.school.oc.stylish.core.custom.listener.listenerdraw

import android.view.MotionEvent
import com.avatar.school.oc.stylish.core.custom.DrawView


interface DrawEvent {
    fun onActionDown(tattooView: DrawView?, event: MotionEvent?)
    fun onActionMove(tattooView: DrawView?, event: MotionEvent?)
    fun onActionUp(tattooView: DrawView?, event: MotionEvent?)
}