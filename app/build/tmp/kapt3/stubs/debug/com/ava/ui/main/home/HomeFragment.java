package com.ava.ui.main.home;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0016J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010&\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\'"}, d2 = {"Lcom/ava/ui/main/home/HomeFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentHomeBinding;", "Lcom/ava/ui/main/home/HomeViewModel;", "Lcom/ava/core/base/BackPressHandler;", "()V", "countRate", "", "mainViewModel", "Lcom/ava/ViewModelActivity;", "getMainViewModel", "()Lcom/ava/ViewModelActivity;", "mainViewModel$delegate", "Lkotlin/Lazy;", "bindViewModel", "", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "navigateWithCheck", "destination", "observeData", "onBackPressed", "", "onFragmentStart", "onFragmentStop", "onHomeMenuClick", "action", "Lcom/ava/ui/main/home/HomeMenuAction;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "viewListener", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class HomeFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentHomeBinding, com.ava.ui.main.home.HomeViewModel> implements com.ava.core.base.BackPressHandler {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainViewModel$delegate = null;
    private int countRate = 0;
    
    public HomeFragment() {
        super(null, null);
    }
    
    private final com.ava.ViewModelActivity getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentHomeBinding inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onFragmentStart() {
    }
    
    @java.lang.Override()
    public void onFragmentStop() {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    private final void onHomeMenuClick(com.ava.ui.main.home.HomeMenuAction action) {
    }
    
    private final void navigateWithCheck(int destination) {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
}