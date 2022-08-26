// Generated by view binder compiler. Do not edit!
package com.example.bazar1177s.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bazar1177s.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOrderBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button bBuyurtmaBekorQilish;

  @NonNull
  public final Button bBuyurtmaTasdiqlash;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final RecyclerView rvBuyurtma;

  @NonNull
  public final TextView tvUmumiyNarx;

  @NonNull
  public final TextView tvYetkazibBerishNarx;

  private FragmentOrderBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Button bBuyurtmaBekorQilish, @NonNull Button bBuyurtmaTasdiqlash,
      @NonNull ImageView ivBack, @NonNull RecyclerView rvBuyurtma, @NonNull TextView tvUmumiyNarx,
      @NonNull TextView tvYetkazibBerishNarx) {
    this.rootView = rootView;
    this.bBuyurtmaBekorQilish = bBuyurtmaBekorQilish;
    this.bBuyurtmaTasdiqlash = bBuyurtmaTasdiqlash;
    this.ivBack = ivBack;
    this.rvBuyurtma = rvBuyurtma;
    this.tvUmumiyNarx = tvUmumiyNarx;
    this.tvYetkazibBerishNarx = tvYetkazibBerishNarx;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.b_buyurtma_bekor_qilish;
      Button bBuyurtmaBekorQilish = ViewBindings.findChildViewById(rootView, id);
      if (bBuyurtmaBekorQilish == null) {
        break missingId;
      }

      id = R.id.b_buyurtma_tasdiqlash;
      Button bBuyurtmaTasdiqlash = ViewBindings.findChildViewById(rootView, id);
      if (bBuyurtmaTasdiqlash == null) {
        break missingId;
      }

      id = R.id.iv_back;
      ImageView ivBack = ViewBindings.findChildViewById(rootView, id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.rv_buyurtma;
      RecyclerView rvBuyurtma = ViewBindings.findChildViewById(rootView, id);
      if (rvBuyurtma == null) {
        break missingId;
      }

      id = R.id.tv_umumiy_narx;
      TextView tvUmumiyNarx = ViewBindings.findChildViewById(rootView, id);
      if (tvUmumiyNarx == null) {
        break missingId;
      }

      id = R.id.tv_yetkazib_berish_narx;
      TextView tvYetkazibBerishNarx = ViewBindings.findChildViewById(rootView, id);
      if (tvYetkazibBerishNarx == null) {
        break missingId;
      }

      return new FragmentOrderBinding((CoordinatorLayout) rootView, bBuyurtmaBekorQilish,
          bBuyurtmaTasdiqlash, ivBack, rvBuyurtma, tvUmumiyNarx, tvYetkazibBerishNarx);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}