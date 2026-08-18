package com.ava.ui.main.random;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J$\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0002J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\bH\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0016J\f\u0010*\u001a\u00020\b*\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/ava/ui/main/random/RandomFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentRandomBinding;", "Lcom/ava/ui/main/random/RandomViewModel;", "()V", "count", "", "bindViewModel", "", "checkOnlineNetworkOrShowDialog", "", "templateIndex", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "isOnlineTemplate", "mergeBitmaps", "Landroid/graphics/Bitmap;", "bitmaps", "", "observeData", "onFragmentStart", "onFragmentStop", "onResume", "onViewCreated", "view", "Landroid/view/View;", "renderCharacter", "item", "Lcom/ava/ui/main/random/RandomViewModel$RandomItem;", "setSaveButtonEnabled", "enabled", "setupBackPressHandler", "showBitmap", "bitmap", "showLoading", "viewListener", "setupActionBar", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class RandomFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentRandomBinding, com.ava.ui.main.random.RandomViewModel> {
    private int count = 0;
    
    public RandomFragment() {
        super(null, null);
    }
    
    private final boolean isOnlineTemplate(int templateIndex) {
        return false;
    }
    
    private final boolean checkOnlineNetworkOrShowDialog(int templateIndex) {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBackPressHandler() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentRandomBinding inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onFragmentStart() {
    }
    
    @java.lang.Override()
    public void onFragmentStop() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void setupActionBar(com.ava.databinding.FragmentRandomBinding $this$setupActionBar) {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void renderCharacter(com.ava.ui.main.random.RandomViewModel.RandomItem item) {
    }
    
    private final void showLoading() {
    }
    
    private final void showBitmap(android.graphics.Bitmap bitmap) {
    }
    
    private final void setSaveButtonEnabled(boolean enabled) {
    }
    
    private final android.graphics.Bitmap mergeBitmaps(java.util.List<android.graphics.Bitmap> bitmaps) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
}