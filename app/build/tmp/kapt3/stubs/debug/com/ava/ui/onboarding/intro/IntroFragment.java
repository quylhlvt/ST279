package com.ava.ui.onboarding.intro;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/ava/ui/onboarding/intro/IntroFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentIntroBinding;", "Lcom/ava/ui/onboarding/intro/IntroViewModel;", "Lcom/ava/core/base/BackPressHandler;", "()V", "introAdapter", "Lcom/ava/ui/onboarding/intro/IntroAdapter;", "getIntroAdapter", "()Lcom/ava/ui/onboarding/intro/IntroAdapter;", "setIntroAdapter", "(Lcom/ava/ui/onboarding/intro/IntroAdapter;)V", "bindViewModel", "", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "observeData", "onBackPressed", "", "setOnChangeViewPager2", "viewListener", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class IntroFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentIntroBinding, com.ava.ui.onboarding.intro.IntroViewModel> implements com.ava.core.base.BackPressHandler {
    @javax.inject.Inject()
    public com.ava.ui.onboarding.intro.IntroAdapter introAdapter;
    
    public IntroFragment() {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ava.ui.onboarding.intro.IntroAdapter getIntroAdapter() {
        return null;
    }
    
    public final void setIntroAdapter(@org.jetbrains.annotations.NotNull()
    com.ava.ui.onboarding.intro.IntroAdapter p0) {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentIntroBinding inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    private final void setOnChangeViewPager2() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
}