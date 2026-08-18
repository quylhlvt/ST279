package com.ava.ui.onboarding.permission;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/ava/ui/onboarding/permission/PermissionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_notificationDenyCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_storageDenyCount", "notificationDenyCount", "Lkotlinx/coroutines/flow/StateFlow;", "getNotificationDenyCount", "()Lkotlinx/coroutines/flow/StateFlow;", "storageDenyCount", "getStorageDenyCount", "getNotificationPermissions", "", "", "()[Ljava/lang/String;", "getStoragePermissions", "onNotificationDenied", "", "onNotificationGranted", "onStorageDenied", "onStorageGranted", "shouldGoToSettings", "", "isStorage", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PermissionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _storageDenyCount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _notificationDenyCount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> storageDenyCount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> notificationDenyCount = null;
    
    @javax.inject.Inject()
    public PermissionViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getStorageDenyCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getNotificationDenyCount() {
        return null;
    }
    
    public final void onStorageDenied() {
    }
    
    public final void onStorageGranted() {
    }
    
    public final void onNotificationDenied() {
    }
    
    public final void onNotificationGranted() {
    }
    
    public final boolean shouldGoToSettings(boolean isStorage) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getStoragePermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getNotificationPermissions() {
        return null;
    }
}