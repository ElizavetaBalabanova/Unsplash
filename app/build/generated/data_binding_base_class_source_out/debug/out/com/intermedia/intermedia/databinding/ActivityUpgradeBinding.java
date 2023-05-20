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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.intermedia.intermedia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpgradeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final ImageView bannerImageView;

  @NonNull
  public final LinearLayout bottomSheet;

  @NonNull
  public final ImageView check1;

  @NonNull
  public final ImageView check2;

  @NonNull
  public final ImageView check3;

  @NonNull
  public final ExtendedFloatingActionButton goProButton;

  @NonNull
  public final TextView proDetail1SubTextView;

  @NonNull
  public final TextView proDetail1TextView;

  @NonNull
  public final TextView proDetail2SubTextView;

  @NonNull
  public final TextView proDetail2TextView;

  @NonNull
  public final TextView proDetail3SubTextView;

  @NonNull
  public final TextView proDetail3TextView;

  @NonNull
  public final MaterialButton restorePurchaseButton;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivityUpgradeBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout appBar,
      @NonNull ImageView bannerImageView, @NonNull LinearLayout bottomSheet,
      @NonNull ImageView check1, @NonNull ImageView check2, @NonNull ImageView check3,
      @NonNull ExtendedFloatingActionButton goProButton, @NonNull TextView proDetail1SubTextView,
      @NonNull TextView proDetail1TextView, @NonNull TextView proDetail2SubTextView,
      @NonNull TextView proDetail2TextView, @NonNull TextView proDetail3SubTextView,
      @NonNull TextView proDetail3TextView, @NonNull MaterialButton restorePurchaseButton,
      @NonNull TextView titleTextView, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.bannerImageView = bannerImageView;
    this.bottomSheet = bottomSheet;
    this.check1 = check1;
    this.check2 = check2;
    this.check3 = check3;
    this.goProButton = goProButton;
    this.proDetail1SubTextView = proDetail1SubTextView;
    this.proDetail1TextView = proDetail1TextView;
    this.proDetail2SubTextView = proDetail2SubTextView;
    this.proDetail2TextView = proDetail2TextView;
    this.proDetail3SubTextView = proDetail3SubTextView;
    this.proDetail3TextView = proDetail3TextView;
    this.restorePurchaseButton = restorePurchaseButton;
    this.titleTextView = titleTextView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpgradeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpgradeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_upgrade, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpgradeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar;
      AppBarLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.banner_image_view;
      ImageView bannerImageView = ViewBindings.findChildViewById(rootView, id);
      if (bannerImageView == null) {
        break missingId;
      }

      id = R.id.bottom_sheet;
      LinearLayout bottomSheet = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheet == null) {
        break missingId;
      }

      id = R.id.check_1;
      ImageView check1 = ViewBindings.findChildViewById(rootView, id);
      if (check1 == null) {
        break missingId;
      }

      id = R.id.check_2;
      ImageView check2 = ViewBindings.findChildViewById(rootView, id);
      if (check2 == null) {
        break missingId;
      }

      id = R.id.check_3;
      ImageView check3 = ViewBindings.findChildViewById(rootView, id);
      if (check3 == null) {
        break missingId;
      }

      id = R.id.go_pro_button;
      ExtendedFloatingActionButton goProButton = ViewBindings.findChildViewById(rootView, id);
      if (goProButton == null) {
        break missingId;
      }

      id = R.id.pro_detail_1_sub_text_view;
      TextView proDetail1SubTextView = ViewBindings.findChildViewById(rootView, id);
      if (proDetail1SubTextView == null) {
        break missingId;
      }

      id = R.id.pro_detail_1_text_view;
      TextView proDetail1TextView = ViewBindings.findChildViewById(rootView, id);
      if (proDetail1TextView == null) {
        break missingId;
      }

      id = R.id.pro_detail_2_sub_text_view;
      TextView proDetail2SubTextView = ViewBindings.findChildViewById(rootView, id);
      if (proDetail2SubTextView == null) {
        break missingId;
      }

      id = R.id.pro_detail_2_text_view;
      TextView proDetail2TextView = ViewBindings.findChildViewById(rootView, id);
      if (proDetail2TextView == null) {
        break missingId;
      }

      id = R.id.pro_detail_3_sub_text_view;
      TextView proDetail3SubTextView = ViewBindings.findChildViewById(rootView, id);
      if (proDetail3SubTextView == null) {
        break missingId;
      }

      id = R.id.pro_detail_3_text_view;
      TextView proDetail3TextView = ViewBindings.findChildViewById(rootView, id);
      if (proDetail3TextView == null) {
        break missingId;
      }

      id = R.id.restore_purchase_button;
      MaterialButton restorePurchaseButton = ViewBindings.findChildViewById(rootView, id);
      if (restorePurchaseButton == null) {
        break missingId;
      }

      id = R.id.title_text_view;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityUpgradeBinding((ConstraintLayout) rootView, appBar, bannerImageView,
          bottomSheet, check1, check2, check3, goProButton, proDetail1SubTextView,
          proDetail1TextView, proDetail2SubTextView, proDetail2TextView, proDetail3SubTextView,
          proDetail3TextView, restorePurchaseButton, titleTextView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}