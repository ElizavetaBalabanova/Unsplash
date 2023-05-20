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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.intermedia.intermedia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemUserDefaultBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView fullNameTextView;

  @NonNull
  public final MaterialCardView photoOneCardView;

  @NonNull
  public final ImageView photoOneImageView;

  @NonNull
  public final MaterialCardView photoThreeCardView;

  @NonNull
  public final ImageView photoThreeImageView;

  @NonNull
  public final MaterialCardView photoTwoCardView;

  @NonNull
  public final ImageView photoTwoImageView;

  @NonNull
  public final ImageView userImageView;

  @NonNull
  public final TextView usernameTextView;

  private ItemUserDefaultBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView fullNameTextView, @NonNull MaterialCardView photoOneCardView,
      @NonNull ImageView photoOneImageView, @NonNull MaterialCardView photoThreeCardView,
      @NonNull ImageView photoThreeImageView, @NonNull MaterialCardView photoTwoCardView,
      @NonNull ImageView photoTwoImageView, @NonNull ImageView userImageView,
      @NonNull TextView usernameTextView) {
    this.rootView = rootView;
    this.fullNameTextView = fullNameTextView;
    this.photoOneCardView = photoOneCardView;
    this.photoOneImageView = photoOneImageView;
    this.photoThreeCardView = photoThreeCardView;
    this.photoThreeImageView = photoThreeImageView;
    this.photoTwoCardView = photoTwoCardView;
    this.photoTwoImageView = photoTwoImageView;
    this.userImageView = userImageView;
    this.usernameTextView = usernameTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemUserDefaultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemUserDefaultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_user_default, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemUserDefaultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.full_name_text_view;
      TextView fullNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (fullNameTextView == null) {
        break missingId;
      }

      id = R.id.photo_one_card_view;
      MaterialCardView photoOneCardView = ViewBindings.findChildViewById(rootView, id);
      if (photoOneCardView == null) {
        break missingId;
      }

      id = R.id.photo_one_image_view;
      ImageView photoOneImageView = ViewBindings.findChildViewById(rootView, id);
      if (photoOneImageView == null) {
        break missingId;
      }

      id = R.id.photo_three_card_view;
      MaterialCardView photoThreeCardView = ViewBindings.findChildViewById(rootView, id);
      if (photoThreeCardView == null) {
        break missingId;
      }

      id = R.id.photo_three_image_view;
      ImageView photoThreeImageView = ViewBindings.findChildViewById(rootView, id);
      if (photoThreeImageView == null) {
        break missingId;
      }

      id = R.id.photo_two_card_view;
      MaterialCardView photoTwoCardView = ViewBindings.findChildViewById(rootView, id);
      if (photoTwoCardView == null) {
        break missingId;
      }

      id = R.id.photo_two_image_view;
      ImageView photoTwoImageView = ViewBindings.findChildViewById(rootView, id);
      if (photoTwoImageView == null) {
        break missingId;
      }

      id = R.id.user_image_view;
      ImageView userImageView = ViewBindings.findChildViewById(rootView, id);
      if (userImageView == null) {
        break missingId;
      }

      id = R.id.username_text_view;
      TextView usernameTextView = ViewBindings.findChildViewById(rootView, id);
      if (usernameTextView == null) {
        break missingId;
      }

      return new ItemUserDefaultBinding((ConstraintLayout) rootView, fullNameTextView,
          photoOneCardView, photoOneImageView, photoThreeCardView, photoThreeImageView,
          photoTwoCardView, photoTwoImageView, userImageView, usernameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}