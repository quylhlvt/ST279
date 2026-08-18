package com.ava.utils.share.whatsapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u001aB5\u0012 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u000fH\u0002\u00a8\u0006\u001b"}, d2 = {"Lcom/ava/utils/share/whatsapp/WhatsappSharingFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Lcom/ava/core/base/BaseFragment;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "viewModelClass", "Ljava/lang/Class;", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Class;)V", "addStickerPackageToWhatsApp", "", "sp", "Lcom/ava/utils/share/whatsapp/StickerPack;", "addToWhatsapp", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "showErrorDialog", "Companion", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public abstract class WhatsappSharingFragment<VB extends androidx.viewbinding.ViewBinding, VM extends androidx.lifecycle.ViewModel> extends com.ava.core.base.BaseFragment<VB, VM> {
    private static final int ADD_PACK_REQUEST = 200;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_STICKER_PACK_ID = "sticker_pack_id";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_STICKER_PACK_AUTHORITY = "sticker_pack_authority";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_STICKER_PACK_NAME = "sticker_pack_name";
    private static final int MIN_STICKERS_REQUIRED = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.ava.utils.share.whatsapp.WhatsappSharingFragment.Companion Companion = null;
    
    public WhatsappSharingFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> bindingInflater, @org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> viewModelClass) {
        super(null, null);
    }
    
    public final void addToWhatsapp(@org.jetbrains.annotations.NotNull()
    com.ava.utils.share.whatsapp.StickerPack sp) {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void addStickerPackageToWhatsApp(com.ava.utils.share.whatsapp.StickerPack sp) {
    }
    
    private final void showErrorDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/ava/utils/share/whatsapp/WhatsappSharingFragment$Companion;", "", "()V", "ADD_PACK_REQUEST", "", "EXTRA_STICKER_PACK_AUTHORITY", "", "EXTRA_STICKER_PACK_ID", "EXTRA_STICKER_PACK_NAME", "MIN_STICKERS_REQUIRED", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}