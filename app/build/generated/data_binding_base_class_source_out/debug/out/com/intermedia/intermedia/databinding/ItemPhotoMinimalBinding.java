// Generated by view binder compiler. Do not edit!
package com.intermedia.intermedia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.intermedia.intermedia.R;
import com.intermedia.intermedia.ui.widget.AspectRatioImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPhotoMinimalBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final LottieAnimationView checkAnimationView;

  @NonNull
  public final AspectRatioImageView photoImageView;

  private ItemPhotoMinimalBinding(@NonNull FrameLayout rootView,
      @NonNull LottieAnimationView checkAnimationView,
      @NonNull AspectRatioImageView photoImageView) {
    this.rootView = rootView;
    this.checkAnimationView = checkAnimationView;
    this.photoImageView = photoImageView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPhotoMinimalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPhotoMinimalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_photo_minimal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPhotoMinimalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.check_animation_view;
      LottieAnimationView checkAnimationView = ViewBindings.findChildViewById(rootView, id);
      if (checkAnimationView == null) {
        break missingId;
      }

      id = R.id.photo_image_view;
      AspectRatioImageView photoImageView = ViewBindings.findChildViewById(rootView, id);
      if (photoImageView == null) {
        break missingId;
      }

      return new ItemPhotoMinimalBinding((FrameLayout) rootView, checkAnimationView,
          photoImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
