// Generated by view binder compiler. Do not edit!
package com.surya.androidlauncher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.surya.androidlauncher.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView itemAppIcon;

  @NonNull
  public final TextView itemAppLabel;

  @NonNull
  public final TextView itemAppName;

  private ListItemBinding(@NonNull RelativeLayout rootView, @NonNull ImageView itemAppIcon,
      @NonNull TextView itemAppLabel, @NonNull TextView itemAppName) {
    this.rootView = rootView;
    this.itemAppIcon = itemAppIcon;
    this.itemAppLabel = itemAppLabel;
    this.itemAppName = itemAppName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_app_icon;
      ImageView itemAppIcon = ViewBindings.findChildViewById(rootView, id);
      if (itemAppIcon == null) {
        break missingId;
      }

      id = R.id.item_app_label;
      TextView itemAppLabel = ViewBindings.findChildViewById(rootView, id);
      if (itemAppLabel == null) {
        break missingId;
      }

      id = R.id.item_app_name;
      TextView itemAppName = ViewBindings.findChildViewById(rootView, id);
      if (itemAppName == null) {
        break missingId;
      }

      return new ListItemBinding((RelativeLayout) rootView, itemAppIcon, itemAppLabel, itemAppName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
