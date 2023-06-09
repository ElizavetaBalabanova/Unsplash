// Generated by view binder compiler. Do not edit!
package com.intermedia.intermedia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.intermedia.intermedia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSelectedAutoWallpaperCollectionBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final EmptyErrorStateLayoutBinding emptyStateLayout;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentSelectedAutoWallpaperCollectionBinding(@NonNull FrameLayout rootView,
      @NonNull EmptyErrorStateLayoutBinding emptyStateLayout, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.emptyStateLayout = emptyStateLayout;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSelectedAutoWallpaperCollectionBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSelectedAutoWallpaperCollectionBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_selected_auto_wallpaper_collection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSelectedAutoWallpaperCollectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.empty_state_layout;
      View emptyStateLayout = ViewBindings.findChildViewById(rootView, id);
      if (emptyStateLayout == null) {
        break missingId;
      }
      EmptyErrorStateLayoutBinding binding_emptyStateLayout = EmptyErrorStateLayoutBinding.bind(emptyStateLayout);

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new FragmentSelectedAutoWallpaperCollectionBinding((FrameLayout) rootView,
          binding_emptyStateLayout, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
