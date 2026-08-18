package com.ava.ui.main.add_character;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 \u008c\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u008c\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J8\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020!2\b\b\u0002\u0010J\u001a\u00020&2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010NH\u0002J\b\u0010O\u001a\u00020HH\u0002J\b\u0010P\u001a\u00020HH\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RH\u0002J\u0010\u0010T\u001a\u00020&2\u0006\u0010I\u001a\u00020!H\u0002J\u0012\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020&H\u0002J\b\u0010W\u001a\u00020HH\u0002J\b\u0010X\u001a\u00020HH\u0002J\b\u0010Y\u001a\u00020HH\u0002J\u0012\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020&H\u0002J\b\u0010\\\u001a\u00020HH\u0003J\u0018\u0010]\u001a\u00020H2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_H\u0002J\u0012\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020&H\u0002J\b\u0010c\u001a\u00020HH\u0002J\u0018\u0010d\u001a\u00020H2\u0006\u0010e\u001a\u00020_2\u0006\u0010`\u001a\u00020_H\u0002J\u0018\u0010f\u001a\u00020H2\u0006\u0010I\u001a\u00020!2\u0006\u0010`\u001a\u00020_H\u0002J\u0010\u0010g\u001a\u00020H2\u0006\u0010I\u001a\u00020!H\u0002J\u0018\u0010h\u001a\u00020H2\u0006\u0010e\u001a\u00020_2\u0006\u0010`\u001a\u00020_H\u0002J\b\u0010i\u001a\u00020HH\u0002J\u000e\u0010j\u001a\b\u0012\u0004\u0012\u00020k0RH\u0002J$\u0010l\u001a\u00020\u00022\u0006\u0010m\u001a\u00020n2\b\u0010o\u001a\u0004\u0018\u00010p2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\b\u0010s\u001a\u00020HH\u0002J\b\u0010t\u001a\u00020HH\u0002J\b\u0010u\u001a\u00020HH\u0002J\b\u0010v\u001a\u00020HH\u0002J\b\u0010w\u001a\u00020HH\u0016J\b\u0010x\u001a\u00020HH\u0002J\u000e\u0010y\u001a\b\u0012\u0004\u0012\u00020z0RH\u0002J\b\u0010{\u001a\u00020HH\u0016J\b\u0010|\u001a\u00020&H\u0016J\b\u0010}\u001a\u00020HH\u0016J\b\u0010~\u001a\u00020HH\u0016J\b\u0010\u007f\u001a\u00020HH\u0016J\t\u0010\u0080\u0001\u001a\u00020HH\u0002J\t\u0010\u0081\u0001\u001a\u00020HH\u0002J\t\u0010\u0082\u0001\u001a\u00020HH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020H2\u0007\u0010\u0084\u0001\u001a\u00020_H\u0002J\t\u0010\u0085\u0001\u001a\u00020HH\u0002J\t\u0010\u0086\u0001\u001a\u00020HH\u0002J\u0012\u0010\u0087\u0001\u001a\u00020H2\u0007\u0010\u0088\u0001\u001a\u00020_H\u0002J\u0012\u0010\u0089\u0001\u001a\u00020H2\u0007\u0010\u0088\u0001\u001a\u00020_H\u0002J\t\u0010\u008a\u0001\u001a\u00020HH\u0002J\t\u0010\u008b\u0001\u001a\u00020HH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\u000b\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\b?\u0010@R\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010\u000b\u001a\u0004\bD\u0010E\u00a8\u0006\u008d\u0001"}, d2 = {"Lcom/ava/ui/main/add_character/AddCharacterFragment;", "Lcom/ava/core/base/BaseFragment;", "Lcom/ava/databinding/FragmentAddCharacterBinding;", "Lcom/ava/ui/main/add_character/AddCharacterViewModel;", "Lcom/ava/core/base/BackPressHandler;", "()V", "backgroundCategoryAdapter", "Lcom/ava/ui/main/add_character/adapter/BackgroundCategoryAdapter;", "getBackgroundCategoryAdapter", "()Lcom/ava/ui/main/add_character/adapter/BackgroundCategoryAdapter;", "backgroundCategoryAdapter$delegate", "Lkotlin/Lazy;", "backgroundColorAdapter", "Lcom/ava/ui/main/add_character/adapter/BackgroundColorAdapter;", "getBackgroundColorAdapter", "()Lcom/ava/ui/main/add_character/adapter/BackgroundColorAdapter;", "backgroundColorAdapter$delegate", "backgroundImageAdapter", "Lcom/ava/ui/main/add_character/adapter/BackgroundImageAdapter;", "getBackgroundImageAdapter", "()Lcom/ava/ui/main/add_character/adapter/BackgroundImageAdapter;", "backgroundImageAdapter$delegate", "imageManager", "Lcom/ava/data/datalocal/manager/CharacterImageManager;", "getImageManager", "()Lcom/ava/data/datalocal/manager/CharacterImageManager;", "setImageManager", "(Lcom/ava/data/datalocal/manager/CharacterImageManager;)V", "imagePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "imagepath", "", "getImagepath", "()Ljava/lang/String;", "imagepath$delegate", "isKeyboardOpen", "", "keyboardLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "permissionViewModel", "Lcom/ava/ui/onboarding/permission/PermissionViewModel;", "getPermissionViewModel", "()Lcom/ava/ui/onboarding/permission/PermissionViewModel;", "permissionViewModel$delegate", "speechAdapter", "Lcom/ava/ui/main/add_character/adapter/SpeechAdapter;", "getSpeechAdapter", "()Lcom/ava/ui/main/add_character/adapter/SpeechAdapter;", "speechAdapter$delegate", "stickerAdapter", "Lcom/ava/ui/main/add_character/adapter/StickerAdapter;", "getStickerAdapter", "()Lcom/ava/ui/main/add_character/adapter/StickerAdapter;", "stickerAdapter$delegate", "stickerCategoryAdapter", "Lcom/ava/ui/main/add_character/adapter/StickerCategoryAdapter;", "getStickerCategoryAdapter", "()Lcom/ava/ui/main/add_character/adapter/StickerCategoryAdapter;", "stickerCategoryAdapter$delegate", "textColorAdapter", "Lcom/ava/ui/main/add_character/adapter/TextColorAdapter;", "getTextColorAdapter", "()Lcom/ava/ui/main/add_character/adapter/TextColorAdapter;", "textColorAdapter$delegate", "textFontAdapter", "Lcom/ava/ui/main/add_character/adapter/TextFontAdapter;", "getTextFontAdapter", "()Lcom/ava/ui/main/add_character/adapter/TextFontAdapter;", "textFontAdapter$delegate", "addDrawable", "", "path", "isCharacter", "bitmapText", "Landroid/graphics/Bitmap;", "onDone", "Lkotlin/Function0;", "applySelectedTextStyle", "bindViewModel", "buttonNavigationList", "Ljava/util/ArrayList;", "Landroid/widget/FrameLayout;", "checkNetworkBeforeRemoteAsset", "clearFocus", "check", "collapseKeyboard", "confirmExit", "confirmReset", "handleChooseColor", "isTextColor", "handleDoneText", "handleFontClick", "font", "", "position", "handleRemoveBackground", "fromColorTab", "handleSave", "handleSetBackgroundColor", "color", "handleSetBackgroundImage", "handleSpeech", "handleTextColorClick", "hideLoadingAfterFirstFrame", "imageNavigationList", "Landroid/widget/ImageView;", "inflateBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initActionBar", "initData", "initDrawView", "initRcv", "initView", "launchImagePicker", "layoutNavigationList", "Landroidx/constraintlayout/widget/ConstraintLayout;", "observeData", "onBackPressed", "onDestroyView", "onFragmentStart", "onFragmentStop", "onKeyboardClose", "onKeyboardOpen", "restoreUIState", "setFlFunctionTopMargin", "margin", "setupKeyboardListener", "setupKeyboardListenerLegacy", "setupTypeBackground", "type", "setupTypeNavigation", "submitAllAdapters", "viewListener", "Companion", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
public final class AddCharacterFragment extends com.ava.core.base.BaseFragment<com.ava.databinding.FragmentAddCharacterBinding, com.ava.ui.main.add_character.AddCharacterViewModel> implements com.ava.core.base.BackPressHandler {
    @javax.inject.Inject()
    public com.ava.data.datalocal.manager.CharacterImageManager imageManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy permissionViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.ViewTreeObserver.OnGlobalLayoutListener keyboardLayoutListener;
    private boolean isKeyboardOpen = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy backgroundImageAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy backgroundCategoryAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy stickerCategoryAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy backgroundColorAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy stickerAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy speechAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy textFontAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy textColorAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy imagepath$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> imagePickerLauncher = null;
    @java.lang.Deprecated()
    public static final int NONE_BACKGROUND_POSITION = 0;
    @java.lang.Deprecated()
    public static final int ADD_BACKGROUND_POSITION = 1;
    @org.jetbrains.annotations.NotNull()
    private static final com.ava.ui.main.add_character.AddCharacterFragment.Companion Companion = null;
    
    public AddCharacterFragment() {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ava.data.datalocal.manager.CharacterImageManager getImageManager() {
        return null;
    }
    
    public final void setImageManager(@org.jetbrains.annotations.NotNull()
    com.ava.data.datalocal.manager.CharacterImageManager p0) {
    }
    
    private final com.ava.ui.onboarding.permission.PermissionViewModel getPermissionViewModel() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.BackgroundImageAdapter getBackgroundImageAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.BackgroundCategoryAdapter getBackgroundCategoryAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.StickerCategoryAdapter getStickerCategoryAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.BackgroundColorAdapter getBackgroundColorAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.StickerAdapter getStickerAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.SpeechAdapter getSpeechAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.TextFontAdapter getTextFontAdapter() {
        return null;
    }
    
    private final com.ava.ui.main.add_character.adapter.TextColorAdapter getTextColorAdapter() {
        return null;
    }
    
    private final java.lang.String getImagepath() {
        return null;
    }
    
    private final java.util.ArrayList<android.widget.FrameLayout> buttonNavigationList() {
        return null;
    }
    
    private final java.util.ArrayList<android.widget.ImageView> imageNavigationList() {
        return null;
    }
    
    private final java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayout> layoutNavigationList() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.ava.databinding.FragmentAddCharacterBinding inflateBinding(@org.jetbrains.annotations.NotNull()
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
    public void observeData() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    @java.lang.Override()
    public void viewListener() {
    }
    
    /**
     * Chặn tải asset online khi thiết bị không có mạng.
     */
    private final boolean checkNetworkBeforeRemoteAsset(java.lang.String path) {
        return false;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    /**
     * Source of truth duy nhất cho keyboard state và flFunction position.
     *
     * Logic:
     * - Keyboard lên (heightDiff > THRESHOLD):
     *    → Tab Text + speech dialog không mở → set bottomMargin = -170dp (cố định)
     *    → Các tab khác hoặc speech dialog đang mở → giữ nguyên (margin = 0)
     * - Keyboard xuống (heightDiff < -THRESHOLD):
     *    → Luôn reset margin = 0, bất kể tab nào
     */
    private final void setupKeyboardListener() {
    }
    
    private final void setupKeyboardListenerLegacy() {
    }
    
    private final void onKeyboardOpen() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onKeyboardClose() {
    }
    
    private final void setFlFunctionTopMargin(int margin) {
    }
    
    /**
     * Đóng keyboard và reset view.
     * Dùng ở mọi nơi cần dismiss keyboard — backpress, click ngoài, done text, tab switch.
     */
    private final void collapseKeyboard() {
    }
    
    private final void clearFocus(boolean check) {
    }
    
    private final void initActionBar() {
    }
    
    private final void initRcv() {
    }
    
    private final void initData() {
    }
    
    /**
     * Giữ loading từ màn Custom cho tới khi màn Background đã sẵn sàng vẽ.
     * post sau pre-draw bảo đảm frame chứa character/background được render trước
     * khi dialog loading biến mất.
     */
    private final void hideLoadingAfterFirstFrame() {
    }
    
    private final void submitAllAdapters() {
    }
    
    private final void restoreUIState() {
    }
    
    private final void applySelectedTextStyle() {
    }
    
    private final void initDrawView() {
    }
    
    private final void addDrawable(java.lang.String path, boolean isCharacter, android.graphics.Bitmap bitmapText, kotlin.jvm.functions.Function0<kotlin.Unit> onDone) {
    }
    
    private final void setupTypeBackground(int type) {
    }
    
    private final void setupTypeNavigation(int type) {
    }
    
    private final void confirmExit() {
    }
    
    private final void confirmReset() {
    }
    
    private final void handleSetBackgroundImage(java.lang.String path, int position) {
    }
    
    private final void handleSetBackgroundColor(int color, int position) {
    }
    
    private final void handleRemoveBackground(boolean fromColorTab) {
    }
    
    private final void launchImagePicker() {
    }
    
    private final void handleChooseColor(boolean isTextColor) {
    }
    
    /**
     * Speech dialog có EditText riêng với keyboard riêng.
     * flFunction KHÔNG được đẩy lên khi keyboard của dialog mở.
     *
     * Giải pháp: set isSpeechDialogOpen = true TRƯỚC KHI dialog show.
     * Layout change listener sẽ check flag này và bỏ qua keyboard event.
     */
    private final void handleSpeech(java.lang.String path) {
    }
    
    private final void handleFontClick(int font, int position) {
    }
    
    private final void handleTextColorClick(int color, int position) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void handleDoneText() {
    }
    
    private final void handleSave() {
    }
    
    /**
     * Logic backpress:
     * - Keyboard đang mở → đóng keyboard, KHÔNG back
     * - Keyboard đóng → hiện confirm dialog
     */
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ava/ui/main/add_character/AddCharacterFragment$Companion;", "", "()V", "ADD_BACKGROUND_POSITION", "", "NONE_BACKGROUND_POSITION", "ST287_Avatar_Maker_High_School_OC_v1.0.0_08.18.2026_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}