package com.ava.databinding;
import com.ava.R;
import com.ava.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogColorPickerBindingImpl extends DialogColorPickerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mater, 1);
        sViewsWithIds.put(R.id.mater2, 2);
        sViewsWithIds.put(R.id.mater3, 3);
        sViewsWithIds.put(R.id.contrainColor, 4);
        sViewsWithIds.put(R.id.tvTitle, 5);
        sViewsWithIds.put(R.id.colorPickerView, 6);
        sViewsWithIds.put(R.id.hueSlider, 7);
        sViewsWithIds.put(R.id.bg, 8);
        sViewsWithIds.put(R.id.btnCancle, 9);
        sViewsWithIds.put(R.id.imgCancleFor, 10);
        sViewsWithIds.put(R.id.txtCancle, 11);
        sViewsWithIds.put(R.id.btnSave, 12);
        sViewsWithIds.put(R.id.imgSaveFor, 13);
        sViewsWithIds.put(R.id.txtSave, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogColorPickerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private DialogColorPickerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (ir.kotlin.quyhcolorpicker.QuylhColorPicker) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (ir.kotlin.quyhcolorpicker.QuylhHueSlider) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            , (com.ava.core.extention.OuterStrokeTextView) bindings[5]
            , (com.ava.core.extention.OuterStrokeShadownTextView) bindings[11]
            , (com.ava.core.extention.OuterStrokeShadownTextView) bindings[14]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}