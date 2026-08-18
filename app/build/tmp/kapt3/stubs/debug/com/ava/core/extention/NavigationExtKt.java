package com.ava.core.extention;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0016"}, d2 = {"nav", "", "Landroidx/fragment/app/Fragment;", "actionId", "", "popBack", "", "safeNavigate", "Landroidx/navigation/NavController;", "args", "Landroid/os/Bundle;", "toHome", "toHomeFromLanguage", "toHomeFromPermission", "toHomeFromSetting", "toIntro", "toIntroFromLanguage", "toLangFromSetting", "toLanguage", "toPermission", "toSettingFromHome", "toSettingFromLang", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class NavigationExtKt {
    
    public static final void nav(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$nav, int actionId) {
    }
    
    /**
     * Navigate an toàn với args — không crash khi:
     * - Action không tồn tại ở destination hiện tại (double-tap, wrong destination)
     */
    public static final void safeNavigate(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController $this$safeNavigate, int actionId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle args) {
    }
    
    public static final void toLanguage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toLanguage) {
    }
    
    public static final void toIntro(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toIntro) {
    }
    
    public static final void toPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toPermission) {
    }
    
    public static final void toHome(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toHome) {
    }
    
    public static final void toHomeFromPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toHomeFromPermission) {
    }
    
    public static final void toLangFromSetting(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toLangFromSetting) {
    }
    
    public static final void toHomeFromSetting(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toHomeFromSetting) {
    }
    
    public static final void toSettingFromLang(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toSettingFromLang) {
    }
    
    public static final void toIntroFromLanguage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toIntroFromLanguage) {
    }
    
    public static final void toHomeFromLanguage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toHomeFromLanguage) {
    }
    
    public static final void toSettingFromHome(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toSettingFromHome) {
    }
    
    public static final boolean popBack(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$popBack) {
        return false;
    }
}