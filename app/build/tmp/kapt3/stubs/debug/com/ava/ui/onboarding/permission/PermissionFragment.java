package com.ava.ui.onboarding.permission;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J+\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0017\u00a2\u0006\u0002\u0010\'J\b\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\nH\u0002J\u0018\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020\nH\u0016J\f\u0010-\u001a\u00020\n*\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/ava/ui/onboarding/permission/PermissionFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentPermissionBinding;", "Lcom/ava/ui/onboarding/permission/PermissionViewModel;", "Lcom/ava/core/base/BackPressHandler;", "()V", "pendingPermissionRequest", "", "pendingStorageRequest", "bindViewModel", "", "createColoredText", "Landroid/text/SpannableString;", "textRes", "", "colorRes", "font", "handleContinue", "handlePermissionRequest", "isStorage", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initText", "initView", "isNetworkAvailable", "observeData", "onBackPressed", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "updateContinueMargin", "updatePermissionUI", "granted", "viewListener", "setupActionBar", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class PermissionFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentPermissionBinding, com.ava.ui.onboarding.permission.PermissionViewModel> implements com.ava.core.base.BackPressHandler {
    private boolean pendingPermissionRequest = false;
    private boolean pendingStorageRequest = false;
    
    public PermissionFragment() {
        super(null, null);
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    private final boolean isNetworkAvailable() {
        return false;
    }
    
    private final void updateContinueMargin() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentPermissionBinding inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final void setupActionBar(com.ava.databinding.FragmentPermissionBinding $this$setupActionBar) {
    }
    
    private final void handlePermissionRequest(boolean isStorage) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void updatePermissionUI(boolean granted, boolean isStorage) {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void initText() {
    }
    
    private final void handleContinue() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    private final android.text.SpannableString createColoredText(@androidx.annotation.StringRes()
    int textRes, @androidx.annotation.ColorRes()
    int colorRes, int font) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
}