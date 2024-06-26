// Generated by view binder compiler. Do not edit!
package com.example.tugasbesar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tugasbesar.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHalamanawallBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText Dari;

  @NonNull
  public final EditText Tujuan;

  @NonNull
  public final Button button;

  @NonNull
  public final View image3;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final Switch switch1;

  @NonNull
  public final EditText tanggalPergi;

  @NonNull
  public final EditText tanggalPulang;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  private ActivityHalamanawallBinding(@NonNull LinearLayout rootView, @NonNull EditText Dari,
      @NonNull EditText Tujuan, @NonNull Button button, @NonNull View image3,
      @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout main,
      @NonNull Switch switch1, @NonNull EditText tanggalPergi, @NonNull EditText tanggalPulang,
      @NonNull TextView textView4, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.Dari = Dari;
    this.Tujuan = Tujuan;
    this.button = button;
    this.image3 = image3;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.main = main;
    this.switch1 = switch1;
    this.tanggalPergi = tanggalPergi;
    this.tanggalPulang = tanggalPulang;
    this.textView4 = textView4;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHalamanawallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHalamanawallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_halamanawall, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHalamanawallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Dari;
      EditText Dari = ViewBindings.findChildViewById(rootView, id);
      if (Dari == null) {
        break missingId;
      }

      id = R.id.Tujuan;
      EditText Tujuan = ViewBindings.findChildViewById(rootView, id);
      if (Tujuan == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.image_3;
      View image3 = ViewBindings.findChildViewById(rootView, id);
      if (image3 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.switch1;
      Switch switch1 = ViewBindings.findChildViewById(rootView, id);
      if (switch1 == null) {
        break missingId;
      }

      id = R.id.tanggalPergi;
      EditText tanggalPergi = ViewBindings.findChildViewById(rootView, id);
      if (tanggalPergi == null) {
        break missingId;
      }

      id = R.id.tanggalPulang;
      EditText tanggalPulang = ViewBindings.findChildViewById(rootView, id);
      if (tanggalPulang == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityHalamanawallBinding((LinearLayout) rootView, Dari, Tujuan, button, image3,
          imageView, imageView2, main, switch1, tanggalPergi, tanggalPulang, textView4, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
