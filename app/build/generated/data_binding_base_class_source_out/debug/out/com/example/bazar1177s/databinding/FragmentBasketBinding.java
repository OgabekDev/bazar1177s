// Generated by view binder compiler. Do not edit!
package com.example.bazar1177s.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class FragmentBasketBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView icBack;

  @NonNull
  public final ImageView icCart;

  @NonNull
  public final RecyclerView rvCartHorizontal;

  @NonNull
  public final RecyclerView rvCartVertical;

  private FragmentBasketBinding(@NonNull CoordinatorLayout rootView, @NonNull ImageView icBack,
      @NonNull ImageView icCart, @NonNull RecyclerView rvCartHorizontal,
      @NonNull RecyclerView rvCartVertical) {
    this.rootView = rootView;
    this.icBack = icBack;
    this.icCart = icCart;
    this.rvCartHorizontal = rvCartHorizontal;
    this.rvCartVertical = rvCartVertical;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBasketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBasketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_basket, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBasketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ic_back;
      ImageView icBack = ViewBindings.findChildViewById(rootView, id);
      if (icBack == null) {
        break missingId;
      }

      id = R.id.ic_cart;
      ImageView icCart = ViewBindings.findChildViewById(rootView, id);
      if (icCart == null) {
        break missingId;
      }

      id = R.id.rv_cart_horizontal;
      RecyclerView rvCartHorizontal = ViewBindings.findChildViewById(rootView, id);
      if (rvCartHorizontal == null) {
        break missingId;
      }

      id = R.id.rv_cart_vertical;
      RecyclerView rvCartVertical = ViewBindings.findChildViewById(rootView, id);
      if (rvCartVertical == null) {
        break missingId;
      }

      return new FragmentBasketBinding((CoordinatorLayout) rootView, icBack, icCart,
          rvCartHorizontal, rvCartVertical);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
