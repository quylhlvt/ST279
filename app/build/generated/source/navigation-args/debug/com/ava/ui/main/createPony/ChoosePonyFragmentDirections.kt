package com.ava.ui.main.createPony

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ava.R

public class ChoosePonyFragmentDirections private constructor() {
  public companion object {
    public fun actionCreatePonyToHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_createPony_to_home)

    public fun actionCreatePonyToCustom(): NavDirections =
        ActionOnlyNavDirections(R.id.action_createPony_to_custom)
  }
}
