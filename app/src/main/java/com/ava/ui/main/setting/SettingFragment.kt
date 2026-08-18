package com.ava.ui.main.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.ava.core.base.BaseFragment
import com.ava.core.extention.gone
import com.ava.core.extention.onClick
import com.ava.core.extention.policy
import com.ava.core.extention.popBack
import com.ava.core.extention.setImageActionBar
import com.ava.core.extention.setTextActionBar
import com.ava.core.extention.shareApp
import com.ava.core.extention.toLangFromSetting
import com.ava.core.extention.visible
import com.ava.core.helper.RateHelper
import com.ava.utils.state.RateState
import com.ava.R
import com.ava.databinding.FragmentSettingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingFragment : BaseFragment<FragmentSettingBinding, SettingViewModel>( FragmentSettingBinding::inflate, SettingViewModel::class.java) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBackPressHandler()
    }

    private fun setupBackPressHandler() {
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    popBack()
                }
            }
        )
    }

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSettingBinding = FragmentSettingBinding.inflate(inflater, container, false)

    override fun initView() {
        binding.apply {

            setupActionBar()
            setupActionTiltleBar()
            setupRateButton()
        }
    }

    private fun FragmentSettingBinding.setupActionBar() {
        actionBar.apply {
            setImageActionBar(
                btnActionBarLeft,
                R.drawable.back_app
            )
        }
    }
 private fun FragmentSettingBinding.setupActionTiltleBar() {


            binding.apply {
                txt1.isSelected = true
                txt2.isSelected = true
                txt3.isSelected = true
                txt4.isSelected = true

                setTextActionBar(
                    actionBar.tvCenter,
                    getString(R.string.settings)
                )
                actionBar.tvCenter.isSelected =true
            }

    }



    private fun FragmentSettingBinding.setupRateButton() {
        if (sharedPreferences.isRateRequest()) {
            btnRate.gone()
        } else {
            btnRate.visible()
        }
    }



    override fun viewListener() {
        binding.apply {
            setupActionBarListeners()
            setupNavigationListeners()
        }
    }

    private fun FragmentSettingBinding.setupActionBarListeners() {
        actionBar.btnActionBarLeft.onClick {
            popBack()
        }
    }

    private fun FragmentSettingBinding.setupNavigationListeners() {
        btnLang.onClick {
            toLangFromSetting()
        }

        btnPolicy.onClick {
            policy()
        }

        btnRate.onClick {
            RateHelper.showRateDialog(requireActivity(), sharedPreferences) { state ->
                if (state != RateState.CANCEL) {
                    btnRate.gone()
                    showToast(R.string.have_rated)
                }
            }
        }

        btnShare.onClick {
            shareApp()
        }
    }


    override fun observeData() {}

    override fun bindViewModel() {}
}