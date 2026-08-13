package com.avatar.school.oc.stylish.ui.onboarding.intro

import androidx.annotation.StringRes
import com.avatar.school.oc.stylish.data.model.intro.IntroModel
import com.avatar.school.oc.stylish.R

class IntroContact {
}
data class IntroUiState(
    val pagesSplash: List<IntroModel>? = emptyList(),
    val page: Int = 0,
    @StringRes val textButtonRes: Int = R.string.next
)

sealed class IntroSingleEvent {
    data object NavigateToNextScreen : IntroSingleEvent()
}