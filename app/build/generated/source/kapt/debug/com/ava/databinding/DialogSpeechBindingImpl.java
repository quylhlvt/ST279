package com.ava.databinding;
import com.ava.R;
import com.ava.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogSpeechBindingImpl extends DialogSpeechBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutBubble, 1);
        sViewsWithIds.put(R.id.imvBubble, 2);
        sViewsWithIds.put(R.id.edtSpeech, 3);
        sViewsWithIds.put(R.id.tvGetText, 4);
        sViewsWithIds.put(R.id.view2, 5);
        sViewsWithIds.put(R.id.view3, 6);
        sViewsWithIds.put(R.id.sizeSpeech, 7);
        sViewsWithIds.put(R.id.view4, 8);
        sViewsWithIds.put(R.id.view5, 9);
        sViewsWithIds.put(R.id.frame, 10);
        sViewsWithIds.put(R.id.sizeSlider, 11);
        sViewsWithIds.put(R.id.linear, 12);
        sViewsWithIds.put(R.id.rcvFontSpeech, 13);
        sViewsWithIds.put(R.id.linear2, 14);
        sViewsWithIds.put(R.id.rcvColorSpeech, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogSpeechBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private DialogSpeechBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.FrameLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (com.ava.ui.main.add_character.HorizontalSizeSlider) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[9]
            );
        this.layoutRoot.setTag(null);
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