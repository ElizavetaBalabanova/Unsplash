// Generated by view binder compiler. Do not edit!
package com.intermedia.intermedia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.intermedia.intermedia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCollectionDefaultBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView collectionCardView;

  @NonNull
  public final TextView collectionCountTextView;

  @NonNull
  public final ImageView collectionImageView;

  @NonNull
  public final TextView collectionNameTextView;

  @NonNull
  public final ImageView collectionPrivateIcon;

  @NonNull
  public final LinearLayout userContainer;

  @NonNull
  public final ImageView userImageView;

  @NonNull
  public final TextView userTextView;

  private ItemCollectionDefaultBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView collectionCardView, @NonNull TextView collectionCountTextView,
      @NonNull ImageView collectionImageView, @NonNull TextView collectionNameTextView,
      @NonNull ImageView collectionPrivateIcon, @NonNull LinearLayout userContainer,
      @NonNull ImageView userImageView, @NonNull TextView userTextView) {
    this.rootView = rootView;
    this.collectionCardView = collectionCardView;
    this.collectionCountTextView = collectionCountTextView;
    this.collectionImageView = collectionImageView;
    this.collectionNameTextView = collectionNameTextView;
    this.collectionPrivateIcon = collectionPrivateIcon;
    this.userContainer = userContainer;
    this.userImageView = userImageView;
    this.userTextView = userTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCollectionDefaultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCollectionDefaultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_collection_default, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCollectionDefaultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.collection_card_view;
      MaterialCardView collectionCardView = ViewBindings.findChildViewById(rootView, id);
      if (collectionCardView == null) {
        break missingId;
      }

      id = R.id.collection_count_text_view;
      TextView collectionCountTextView = ViewBindings.findChildViewById(rootView, id);
      if (collectionCountTextView == null) {
        break missingId;
      }

      id = R.id.collection_image_view;
      ImageView collectionImageView = ViewBindings.findChildViewById(rootView, id);
      if (collectionImageView == null) {
        break missingId;
      }

      id = R.id.collection_name_text_view;
      TextView collectionNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (collectionNameTextView == null) {
        break missingId;
      }

      id = R.id.collection_private_icon;
      ImageView collectionPrivateIcon = ViewBindings.findChildViewById(rootView, id);
      if (collectionPrivateIcon == null) {
        break missingId;
      }

      id = R.id.user_container;
      LinearLayout userContainer = ViewBindings.findChildViewById(rootView, id);
      if (userContainer == null) {
        break missingId;
      }

      id = R.id.user_image_view;
      ImageView userImageView = ViewBindings.findChildViewById(rootView, id);
      if (userImageView == null) {
        break missingId;
      }

      id = R.id.user_text_view;
      TextView userTextView = ViewBindings.findChildViewById(rootView, id);
      if (userTextView == null) {
        break missingId;
      }

      return new ItemCollectionDefaultBinding((ConstraintLayout) rootView, collectionCardView,
          collectionCountTextView, collectionImageView, collectionNameTextView,
          collectionPrivateIcon, userContainer, userImageView, userTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
