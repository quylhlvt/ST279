package com.ava.ui.main.cosplay;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\bH\u0002J\u0010\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020\bH\u0016J\f\u0010+\u001a\u00020\b*\u00020\u0002H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/ava/ui/main/cosplay/CosplayFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentCosplayBinding;", "Lcom/ava/ui/main/cosplay/CosplayViewModel;", "()V", "renderJob", "Lkotlinx/coroutines/Job;", "bindViewModel", "", "checkOnlineNetworkOrShowDialog", "", "templateIndex", "", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "isOnlineTemplate", "mergeBitmaps", "Landroid/graphics/Bitmap;", "bitmaps", "", "observeData", "onFragmentStart", "onFragmentStop", "onResume", "onViewCreated", "view", "Landroid/view/View;", "renderCharacter", "item", "Lcom/ava/ui/main/cosplay/CosplayViewModel$RandomItem;", "setShowButtonEnabled", "enabled", "setupBackPressHandler", "showBitmap", "bitmap", "showLoading", "viewListener", "setupActionBar", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class CosplayFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentCosplayBinding, com.ava.ui.main.cosplay.CosplayViewModel> {
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job renderJob;
    
    public CosplayFragment() {
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
    public void onFragmentStart() {
    }
    
    @java.lang.Override()
    public void onFragmentStop() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void setupActionBar(com.ava.databinding.FragmentCosplayBinding $this$setupActionBar) {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentCosplayBinding inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void renderCharacter(com.ava.ui.main.cosplay.CosplayViewModel.RandomItem item) {
    }
    
    private final void showLoading() {
    }
    
    private final void showBitmap(android.graphics.Bitmap bitmap) {
    }
    
    private final void setShowButtonEnabled(boolean enabled) {
    }
    
    private final android.graphics.Bitmap mergeBitmaps(java.util.List<android.graphics.Bitmap> bitmaps) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
}