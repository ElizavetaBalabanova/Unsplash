// Generated by view binder compiler. Do not edit!
package com.intermedia.intermedia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputLayout;
import com.intermedia.intermedia.R;
import com.intermedia.intermedia.ui.widget.ContentLoadingLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetAddCollectionBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageView addCollectionButton;

  @NonNull
  public final ConstraintLayout addToCollectionLayout;

  @NonNull
  public final TextView addToCollectionTitle;

  @NonNull
  public final MaterialButton cancelCollectionButton;

  @NonNull
  public final TextInputLayout collectionDescriptionTextInputLayout;

  @NonNull
  public final TextInputLayout collectionNameTextInputLayout;

  @NonNull
  public final ContentLoadingLayout contentLoadingLayout;

  @NonNull
  public final MaterialButton createCollectionButton;

  @NonNull
  public final ConstraintLayout createCollectionLayout;

  @NonNull
  public final TextView createCollectionTitle;

  @NonNull
  public final ContentLoadingLayout createLoadingLayout;

  @NonNull
  public final EmptyErrorStateLayoutBinding emptyStateLayout;

  @NonNull
  public final MaterialCheckBox makeCollectionPrivateCheckbox;

  @NonNull
  public final RecyclerView recyclerView;

  private BottomSheetAddCollectionBinding(@NonNull NestedScrollView rootView,
      @NonNull ImageView addCollectionButton, @NonNull ConstraintLayout addToCollectionLayout,
      @NonNull TextView addToCollectionTitle, @NonNull MaterialButton cancelCollectionButton,
      @NonNull TextInputLayout collectionDescriptionTextInputLayout,
      @NonNull TextInputLayout collectionNameTextInputLayout,
      @NonNull ContentLoadingLayout contentLoadingLayout,
      @NonNull MaterialButton createCollectionButton,
      @NonNull ConstraintLayout createCollectionLayout, @NonNull TextView createCollectionTitle,
      @NonNull ContentLoadingLayout createLoadingLayout,
      @NonNull EmptyErrorStateLayoutBinding emptyStateLayout,
      @NonNull MaterialCheckBox makeCollectionPrivateCheckbox, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.addCollectionButton = addCollectionButton;
    this.addToCollectionLayout = addToCollectionLayout;
    this.addToCollectionTitle = addToCollectionTitle;
    this.cancelCollectionButton = cancelCollectionButton;
    this.collectionDescriptionTextInputLayout = collectionDescriptionTextInputLayout;
    this.collectionNameTextInputLayout = collectionNameTextInputLayout;
    this.contentLoadingLayout = contentLoadingLayout;
    this.createCollectionButton = createCollectionButton;
    this.createCollectionLayout = createCollectionLayout;
    this.createCollectionTitle = createCollectionTitle;
    this.createLoadingLayout = createLoadingLayout;
    this.emptyStateLayout = emptyStateLayout;
    this.makeCollectionPrivateCheckbox = makeCollectionPrivateCheckbox;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetAddCollectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetAddCollectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_add_collection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetAddCollectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_collection_button;
      ImageView addCollectionButton = ViewBindings.findChildViewById(rootView, id);
      if (addCollectionButton == null) {
        break missingId;
      }

      id = R.id.add_to_collection_layout;
      ConstraintLayout addToCollectionLayout = ViewBindings.findChildViewById(rootView, id);
      if (addToCollectionLayout == null) {
        break missingId;
      }

      id = R.id.add_to_collection_title;
      TextView addToCollectionTitle = ViewBindings.findChildViewById(rootView, id);
      if (addToCollectionTitle == null) {
        break missingId;
      }

      id = R.id.cancel_collection_button;
      MaterialButton cancelCollectionButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelCollectionButton == null) {
        break missingId;
      }

      id = R.id.collection_description_text_input_layout;
      TextInputLayout collectionDescriptionTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (collectionDescriptionTextInputLayout == null) {
        break missingId;
      }

      id = R.id.collection_name_text_input_layout;
      TextInputLayout collectionNameTextInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (collectionNameTextInputLayout == null) {
        break missingId;
      }

      id = R.id.content_loading_layout;
      ContentLoadingLayout contentLoadingLayout = ViewBindings.findChildViewById(rootView, id);
      if (contentLoadingLayout == null) {
        break missingId;
      }

      id = R.id.create_collection_button;
      MaterialButton createCollectionButton = ViewBindings.findChildViewById(rootView, id);
      if (createCollectionButton == null) {
        break missingId;
      }

      id = R.id.create_collection_layout;
      ConstraintLayout createCollectionLayout = ViewBindings.findChildViewById(rootView, id);
      if (createCollectionLayout == null) {
        break missingId;
      }

      id = R.id.create_collection_title;
      TextView createCollectionTitle = ViewBindings.findChildViewById(rootView, id);
      if (createCollectionTitle == null) {
        break missingId;
      }

      id = R.id.create_loading_layout;
      ContentLoadingLayout createLoadingLayout = ViewBindings.findChildViewById(rootView, id);
      if (createLoadingLayout == null) {
        break missingId;
      }

      id = R.id.empty_state_layout;
      View emptyStateLayout = ViewBindings.findChildViewById(rootView, id);
      if (emptyStateLayout == null) {
        break missingId;
      }
      EmptyErrorStateLayoutBinding binding_emptyStateLayout = EmptyErrorStateLayoutBinding.bind(emptyStateLayout);

      id = R.id.make_collection_private_checkbox;
      MaterialCheckBox makeCollectionPrivateCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (makeCollectionPrivateCheckbox == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new BottomSheetAddCollectionBinding((NestedScrollView) rootView, addCollectionButton,
          addToCollectionLayout, addToCollectionTitle, cancelCollectionButton,
          collectionDescriptionTextInputLayout, collectionNameTextInputLayout, contentLoadingLayout,
          createCollectionButton, createCollectionLayout, createCollectionTitle,
          createLoadingLayout, binding_emptyStateLayout, makeCollectionPrivateCheckbox,
          recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}