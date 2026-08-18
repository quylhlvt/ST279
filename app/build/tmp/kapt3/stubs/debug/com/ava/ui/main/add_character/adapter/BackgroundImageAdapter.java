package com.ava.ui.main.add_character.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\rJ \u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0006H\u0014J\u000e\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/ava/ui/main/add_character/adapter/BackgroundImageAdapter;", "Lcom/ava/core/base/BaseAdapter;", "Lcom/ava/data/model/addcharacter/SelectedAddModel;", "Lcom/ava/databinding/ItemBackgroundImageBinding;", "()V", "currentSelected", "", "getCurrentSelected", "()I", "setCurrentSelected", "(I)V", "onAddImageClick", "Lkotlin/Function0;", "", "getOnAddImageClick", "()Lkotlin/jvm/functions/Function0;", "setOnAddImageClick", "(Lkotlin/jvm/functions/Function0;)V", "onBackgroundImageClick", "Lkotlin/Function2;", "", "getOnBackgroundImageClick", "()Lkotlin/jvm/functions/Function2;", "setOnBackgroundImageClick", "(Lkotlin/jvm/functions/Function2;)V", "onNoneImageClick", "getOnNoneImageClick", "setOnNoneImageClick", "clearSelection", "onBind", "binding", "item", "position", "selectItem", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class BackgroundImageAdapter extends com.ava.core.base.BaseAdapter<com.ava.data.model.addcharacter.SelectedAddModel, com.ava.databinding.ItemBackgroundImageBinding> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onAddImageClick;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onNoneImageClick;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onBackgroundImageClick;
    private int currentSelected = -1;
    
    public BackgroundImageAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAddImageClick() {
        return null;
    }
    
    public final void setOnAddImageClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoneImageClick() {
        return null;
    }
    
    public final void setOnNoneImageClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, kotlin.Unit> getOnBackgroundImageClick() {
        return null;
    }
    
    public final void setOnBackgroundImageClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final int getCurrentSelected() {
        return 0;
    }
    
    public final void setCurrentSelected(int p0) {
    }
    
    @java.lang.Override()
    protected void onBind(@org.jetbrains.annotations.NotNull()
    com.ava.databinding.ItemBackgroundImageBinding binding, @org.jetbrains.annotations.NotNull()
    com.ava.data.model.addcharacter.SelectedAddModel item, int position) {
    }
    
    public final void selectItem(int position) {
    }
    
    public final void clearSelection() {
    }
}