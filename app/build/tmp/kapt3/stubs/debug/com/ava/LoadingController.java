package com.ava;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&JT\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J.\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH&\u00a8\u0006\u0011"}, d2 = {"Lcom/ava/LoadingController;", "", "hideGlobalDialog", "", "hideGlobalLoading", "showGlobalConfirmDialog", "message", "", "title", "onYes", "Lkotlin/Function0;", "onNo", "yesText", "noText", "showGlobalLoading", "showGlobalOkDialog", "onOk", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public abstract interface LoadingController {
    
    public abstract void showGlobalLoading();
    
    public abstract void hideGlobalLoading();
    
    public abstract void hideGlobalDialog();
    
    public abstract void showGlobalConfirmDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onYes, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNo, @org.jetbrains.annotations.Nullable()
    java.lang.String yesText, @org.jetbrains.annotations.Nullable()
    java.lang.String noText);
    
    public abstract void showGlobalOkDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOk);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}