package com.ava.ui.onboarding.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ava.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashToLanguage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splash_to_language)

    public fun actionSplashToIntro(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splash_to_intro)
  }
}
