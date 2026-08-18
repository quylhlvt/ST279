package com.ava.ui.main.add_character.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\rJ \u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006H\u0014J\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017\u00a8\u0006!"}, d2 = {"Lcom/ava/ui/main/add_character/adapter/BackgroundColorAdapter;", "Lcom/ava/core/base/BaseAdapter;", "Lcom/ava/data/model/addcharacter/SelectedAddModel;", "Lcom/ava/databinding/ItemBackgroundColorBinding;", "()V", "currentSelected", "", "getCurrentSelected", "()I", "setCurrentSelected", "(I)V", "onBackgroundColorClick", "Lkotlin/Function2;", "", "getOnBackgroundColorClick", "()Lkotlin/jvm/functions/Function2;", "setOnBackgroundColorClick", "(Lkotlin/jvm/functions/Function2;)V", "onChooseColorClick", "Lkotlin/Function0;", "getOnChooseColorClick", "()Lkotlin/jvm/functions/Function0;", "setOnChooseColorClick", "(Lkotlin/jvm/functions/Function0;)V", "onNoneColorClick", "getOnNoneColorClick", "setOnNoneColorClick", "clearSelection", "onBind", "binding", "item", "position", "selectItem", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class BackgroundColorAdapter extends com.ava.core.base.BaseAdapter<com.ava.data.model.addcharacter.SelectedAddModel, com.ava.databinding.ItemBackgroundColorBinding> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onChooseColorClick;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onNoneColorClick;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onBackgroundColorClick;
    private int currentSelected = -1;
    
    public BackgroundColorAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnChooseColorClick() {
        return null;
    }
    
    public final void setOnChooseColorClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoneColorClick() {
        return null;
    }
    
    public final void setOnNoneColorClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> getOnBackgroundColorClick() {
        return null;
    }
    
    public final void setOnBackgroundColorClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final int getCurrentSelected() {
        return 0;
    }
    
    public final void setCurrentSelected(int p0) {
    }
    
    @java.lang.Override()
    protected void onBind(@org.jetbrains.annotations.NotNull()
    com.ava.databinding.ItemBackgroundColorBinding binding, @org.jetbrains.annotations.NotNull()
    com.ava.data.model.addcharacter.SelectedAddModel item, int position) {
    }
    
    public final void selectItem(int position) {
    }
    
    public final void clearSelection() {
    }
}