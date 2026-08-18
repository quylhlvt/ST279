package com.ava.ui.main.createPony;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0011H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/ava/ui/main/createPony/ChoosePonyFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentChoosePonyBinding;", "Lcom/ava/ui/main/createPony/ChoosePonyViewModel;", "Lcom/ava/core/base/BackPressHandler;", "()V", "adapter", "Lcom/ava/ui/main/createPony/ChoosePonyAdapter;", "isFirstLoad", "", "mainViewModel", "Lcom/ava/ViewModelActivity;", "getMainViewModel", "()Lcom/ava/ViewModelActivity;", "mainViewModel$delegate", "Lkotlin/Lazy;", "bindViewModel", "", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "navigateBack", "navigateToCustomize", "character", "Lcom/ava/data/model/custom/CustomModel;", "index", "", "observeData", "onBackPressed", "onFragmentStart", "onFragmentStop", "onResume", "viewListener", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class ChoosePonyFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentChoosePonyBinding, com.ava.ui.main.createPony.ChoosePonyViewModel> implements com.ava.core.base.BackPressHandler {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.ava.ui.main.createPony.ChoosePonyAdapter adapter;
    private boolean isFirstLoad = true;
    
    public ChoosePonyFragment() {
        super(null, null);
    }
    
    private final com.ava.ViewModelActivity getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentChoosePonyBinding inflateBinding(@org.jetbrains.annotations.NotNull()
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
    
    private final void navigateToCustomize(com.ava.data.model.custom.CustomModel character, int index) {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    private final void navigateBack() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
}