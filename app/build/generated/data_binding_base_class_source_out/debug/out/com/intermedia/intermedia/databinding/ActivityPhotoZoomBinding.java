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
import com.github.chrisbanes.photoview.PhotoView;
import com.intermedia.intermedia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPhotoZoomBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final PhotoView zoomImageView;

  private ActivityPhotoZoomBinding(@NonNull FrameLayout rootView,
      @NonNull PhotoView zoomImageView) {
    this.rootView = rootView;
    this.zoomImageView = zoomImageView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPhotoZoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPhotoZoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_photo_zoom, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPhotoZoomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.zoom_image_view;
      PhotoView zoomImageView = ViewBindings.findChildViewById(rootView, id);
      if (zoomImageView == null) {
        break missingId;
      }

      return new ActivityPhotoZoomBinding((FrameLayout) rootView, zoomImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}