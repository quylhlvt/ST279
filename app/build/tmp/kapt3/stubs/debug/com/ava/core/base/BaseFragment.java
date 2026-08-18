package com.ava.core.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B5\u0012 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f\u00a2\u0006\u0002\u0010\rJ\b\u0010A\u001a\u00020#H&J\u0006\u0010B\u001a\u00020#J\u0006\u0010C\u001a\u00020#J\u0006\u0010D\u001a\u00020#J\u0006\u0010E\u001a\u00020#J)\u0010F\u001a\u00028\u00002\u0006\u0010G\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010\t2\b\u0010I\u001a\u0004\u0018\u00010JH&\u00a2\u0006\u0002\u0010KJ\b\u0010L\u001a\u00020#H\u0016J\b\u0010M\u001a\u00020#H\u0016J\b\u0010N\u001a\u00020#H\u0016J\b\u0010O\u001a\u00020#H\u0002J\u0010\u0010P\u001a\u00020#2\u0006\u0010Q\u001a\u00020RH\u0016J\u0012\u0010S\u001a\u00020#2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J&\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010G\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010\t2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010V\u001a\u00020#H\u0016J\b\u0010W\u001a\u00020#H\u0016J\b\u0010X\u001a\u00020#H\u0016J\b\u0010Y\u001a\u00020#H\u0016J\b\u0010Z\u001a\u00020#H\u0016J\b\u0010[\u001a\u00020#H\u0016J\b\u0010\\\u001a\u00020#H\u0016J\b\u0010]\u001a\u00020#H\u0016J\b\u0010^\u001a\u00020#H\u0016J\u001a\u0010_\u001a\u00020#2\u0006\u0010`\u001a\u00020U2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010a\u001a\u00020#H\u0016JR\u0010b\u001a\u00020#2\u0006\u0010c\u001a\u00020d2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010d2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0010\b\u0002\u0010g\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010d2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010dJ\u0018\u0010j\u001a\u00020#2\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\u0006\u0010l\u001a\u00020#J\u0018\u0010m\u001a\u00020#2\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J,\u0010n\u001a\u00020#2\u0006\u0010c\u001a\u00020d2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010d2\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\u000e\u0010o\u001a\u00020#2\u0006\u0010c\u001a\u00020dJ\u000e\u0010p\u001a\u00020#2\u0006\u0010q\u001a\u00020rJ\u0018\u0010s\u001a\u00020#2\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\b\u0010t\u001a\u00020#H&R\u0010\u0010\u000e\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00118DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010\'R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u00107\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u001b\u0010<\u001a\u00020=8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010;\u001a\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006u"}, d2 = {"Lcom/ava/core/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "viewModelClass", "Ljava/lang/Class;", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Class;)V", "_binding", "Landroidx/viewbinding/ViewBinding;", "_navController", "Landroidx/navigation/NavController;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "confirmDialogBinding", "Lcom/ava/databinding/DialogbaseBinding;", "dialog", "Landroid/app/Dialog;", "isFirstStart", "loadingController", "Lcom/ava/LoadingController;", "getLoadingController", "()Lcom/ava/LoadingController;", "navController", "getNavController", "()Landroidx/navigation/NavController;", "onNoClick", "Lkotlin/Function0;", "", "getOnNoClick", "()Lkotlin/jvm/functions/Function0;", "setOnNoClick", "(Lkotlin/jvm/functions/Function0;)V", "onYesClick", "getOnYesClick", "setOnYesClick", "sharedPreferences", "Lcom/ava/core/helper/SharedPreferencesManager;", "getSharedPreferences$ST287_Avatar_Maker_High_School_OC_v1_0_0_08_18_2026_debug", "()Lcom/ava/core/helper/SharedPreferencesManager;", "setSharedPreferences$ST287_Avatar_Maker_High_School_OC_v1_0_0_08_18_2026_debug", "(Lcom/ava/core/helper/SharedPreferencesManager;)V", "toast", "Landroid/widget/Toast;", "getToast", "()Landroid/widget/Toast;", "setToast", "(Landroid/widget/Toast;)V", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelActivity", "Lcom/ava/ViewModelActivity;", "getViewModelActivity", "()Lcom/ava/ViewModelActivity;", "viewModelActivity$delegate", "bindViewModel", "checkNetworkAndShowDialog", "hideGlobalDialogSafe", "hideLoading", "hideLoadingSafe", "inflateBinding", "inflater", "container", "savedInstanceState", "Landroid/os/Bundle;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding;", "initText", "initView", "observeData", "observeNetworkRetry", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateView", "Landroid/view/View;", "onDestroy", "onDestroyView", "onDetach", "onFragmentStart", "onFragmentStop", "onPause", "onResume", "onStart", "onStop", "onViewCreated", "view", "setupPreViews", "showConfirmDialog", "message", "", "title", "onYes", "onNo", "yesText", "noText", "showLoadingDataDialog", "onOk", "showLoadingSafe", "showNoInternetDialog", "showOkDialog", "showSnackbar", "showToast", "content", "", "showUnstableNetworkDialog", "viewListener", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding, VM extends androidx.lifecycle.ViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> bindingInflater = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<VM> viewModelClass = null;
    private boolean isFirstStart = true;
    private VB _binding;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    @org.jetbrains.annotations.Nullable()
    private com.ava.databinding.DialogbaseBinding confirmDialogBinding;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onYesClick;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onNoClick;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModelActivity$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Toast toast;
    @javax.inject.Inject()
    public com.ava.core.helper.SharedPreferencesManager sharedPreferences;
    @org.jetbrains.annotations.Nullable()
    private androidx.navigation.NavController _navController;
    
    public BaseFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> bindingInflater, @org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> viewModelClass) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnYesClick() {
        return null;
    }
    
    public final void setOnYesClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoClick() {
        return null;
    }
    
    public final void setOnNoClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.ava.ViewModelActivity getViewModelActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    private final com.ava.LoadingController getLoadingController() {
        return null;
    }
    
    public void onFragmentStart() {
    }
    
    public void onFragmentStop() {
    }
    
    public void setupPreViews() {
    }
    
    public abstract void viewListener();
    
    @org.jetbrains.annotations.Nullable()
    protected final android.widget.Toast getToast() {
        return null;
    }
    
    protected final void setToast(@org.jetbrains.annotations.Nullable()
    android.widget.Toast p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ava.core.helper.SharedPreferencesManager getSharedPreferences$ST287_Avatar_Maker_High_School_OC_v1_0_0_08_18_2026_debug() {
        return null;
    }
    
    public final void setSharedPreferences$ST287_Avatar_Maker_High_School_OC_v1_0_0_08_18_2026_debug(@org.jetbrains.annotations.NotNull()
    com.ava.core.helper.SharedPreferencesManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VB inflateBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeNetworkRetry() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public void initView() {
    }
    
    public void initText() {
    }
    
    public void observeData() {
    }
    
    public final void showSnackbar(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.Object content) {
    }
    
    public final void hideLoading() {
    }
    
    public final void showLoadingSafe() {
    }
    
    public final void hideLoadingSafe() {
    }
    
    public final void hideGlobalDialogSafe() {
    }
    
    public final void showConfirmDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onYes, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNo, @org.jetbrains.annotations.Nullable()
    java.lang.String yesText, @org.jetbrains.annotations.Nullable()
    java.lang.String noText) {
    }
    
    public final void showNoInternetDialog(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOk) {
    }
    
    public final void showLoadingDataDialog(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOk) {
    }
    
    public final void showUnstableNetworkDialog(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOk) {
    }
    
    public final void checkNetworkAndShowDialog() {
    }
    
    public final void showOkDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOk) {
    }
    
    public abstract void bindViewModel();
}