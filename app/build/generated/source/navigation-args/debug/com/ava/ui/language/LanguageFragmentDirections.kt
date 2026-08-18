package com.ava.ui.language

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ava.R

public class LanguageFragmentDirections private constructor() {
  public companion object {
    public fun actionLanguageToIntro(): NavDirections =
        ActionOnlyNavDirections(R.id.action_language_to_intro)
  }
}
