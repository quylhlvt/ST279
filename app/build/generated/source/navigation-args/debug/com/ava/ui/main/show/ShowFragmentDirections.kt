package com.ava.ui.main.show

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ava.R

public class ShowFragmentDirections private constructor() {
  public companion object {
    public fun actionShowToSuccessCosplay(): NavDirections =
        ActionOnlyNavDirections(R.id.action_show_to_successCosplay)
  }
}
