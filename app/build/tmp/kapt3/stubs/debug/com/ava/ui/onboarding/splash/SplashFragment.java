package com.ava.ui.onboarding.splash;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\b\u0010\'\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/ava/ui/onboarding/splash/SplashFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentSplashBinding;", "Lcom/ava/ui/onboarding/splash/SplashViewModel;", "Lcom/ava/core/base/BackPressHandler;", "()V", "currentOverlayFraction", "", "hasNavigated", "", "mainViewModel", "Lcom/ava/ViewModelActivity;", "getMainViewModel", "()Lcom/ava/ViewModelActivity;", "mainViewModel$delegate", "Lkotlin/Lazy;", "navigateJob", "Lkotlinx/coroutines/Job;", "pendingNavigate", "progressAnimator", "Landroid/animation/ValueAnimator;", "bindViewModel", "", "doNavigate", "goToHome", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "isNetworkAvailable", "observeData", "onBackPressed", "onDestroyView", "onPause", "onResume", "viewListener", "Companion", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class SplashFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentSplashBinding, com.ava.ui.onboarding.splash.SplashViewModel> implements com.ava.core.base.BackPressHandler {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainViewModel$delegate = null;
    private boolean pendingNavigate = false;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job navigateJob;
    @org.jetbrains.annotations.Nullable()
    private android.animation.ValueAnimator progressAnimator;
    private float currentOverlayFraction = 1.0F;
    private boolean hasNavigated = false;
    private static final long MIN_SPLASH_MS = 3000L;
    private static final long API_TIMEOUT_MS = 8000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.ava.ui.onboarding.splash.SplashFragment.Companion Companion = null;
    
    public SplashFragment() {
        super(null, null);
    }
    
    private final com.ava.ViewModelActivity getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentSplashBinding inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void goToHome() {
    }
    
    private final void doNavigate() {
    }
    
    private final boolean isNetworkAvailable() {
        return false;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ava/ui/onboarding/splash/SplashFragment$Companion;", "", "()V", "API_TIMEOUT_MS", "", "MIN_SPLASH_MS", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}