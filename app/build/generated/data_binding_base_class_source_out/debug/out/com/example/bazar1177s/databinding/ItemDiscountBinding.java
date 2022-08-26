// Generated by view binder compiler. Do not edit!
package com.example.bazar1177s.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bazar1177s.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDiscountBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivDiscountAddToCart;

  @NonNull
  public final ImageView ivDiscountImage;

  @NonNull
  public final LinearLayout llItemDiscount;

  @NonNull
  public final TextView tvDiscountName;

  @NonNull
  public final TextView tvDiscountNewPrice;

  @NonNull
  public final TextView tvDiscountOldPrice;

  @NonNull
  public final TextView tvDiscountPercentage;

  private ItemDiscountBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView ivDiscountAddToCart, @NonNull ImageView ivDiscountImage,
      @NonNull LinearLayout llItemDiscount, @NonNull TextView tvDiscountName,
      @NonNull TextView tvDiscountNewPrice, @NonNull TextView tvDiscountOldPrice,
      @NonNull TextView tvDiscountPercentage) {
    this.rootView = rootView;
    this.ivDiscountAddToCart = ivDiscountAddToCart;
    this.ivDiscountImage = ivDiscountImage;
    this.llItemDiscount = llItemDiscount;
    this.tvDiscountName = tvDiscountName;
    this.tvDiscountNewPrice = tvDiscountNewPrice;
    this.tvDiscountOldPrice = tvDiscountOldPrice;
    this.tvDiscountPercentage = tvDiscountPercentage;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDiscountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDiscountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_discount, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDiscountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_discount_add_to_cart;
      ImageView ivDiscountAddToCart = ViewBindings.findChildViewById(rootView, id);
      if (ivDiscountAddToCart == null) {
        break missingId;
      }

      id = R.id.iv_discount_image;
      ImageView ivDiscountImage = ViewBindings.findChildViewById(rootView, id);
      if (ivDiscountImage == null) {
        break missingId;
      }

      id = R.id.ll_item_discount;
      LinearLayout llItemDiscount = ViewBindings.findChildViewById(rootView, id);
      if (llItemDiscount == null) {
        break missingId;
      }

      id = R.id.tv_discount_name;
      TextView tvDiscountName = ViewBindings.findChildViewById(rootView, id);
      if (tvDiscountName == null) {
        break missingId;
      }

      id = R.id.tv_discount_new_price;
      TextView tvDiscountNewPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvDiscountNewPrice == null) {
        break missingId;
      }

      id = R.id.tv_discount_old_price;
      TextView tvDiscountOldPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvDiscountOldPrice == null) {
        break missingId;
      }

      id = R.id.tv_discount_percentage;
      TextView tvDiscountPercentage = ViewBindings.findChildViewById(rootView, id);
      if (tvDiscountPercentage == null) {
        break missingId;
      }

      return new ItemDiscountBinding((MaterialCardView) rootView, ivDiscountAddToCart,
          ivDiscountImage, llItemDiscount, tvDiscountName, tvDiscountNewPrice, tvDiscountOldPrice,
          tvDiscountPercentage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
