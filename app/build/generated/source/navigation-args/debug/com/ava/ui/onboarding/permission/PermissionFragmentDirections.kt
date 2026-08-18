package com.ava.ui.onboarding.permission

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ava.R

public class PermissionFragmentDirections private constructor() {
  public companion object {
    public fun actionPermissionToHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_permission_to_home)
  }
}
