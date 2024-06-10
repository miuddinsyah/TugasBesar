// Generated by view binder compiler. Do not edit!
package com.example.tugasbesar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tugasbesar.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final EditText editTextTTL;

  @NonNull
  public final EditText editTextUsername;

  @NonNull
  public final EditText editTextisiemail;

  @NonNull
  public final EditText editTextisipassword;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  private ActivitySignupBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSignUp,
      @NonNull EditText editTextTTL, @NonNull EditText editTextUsername,
      @NonNull EditText editTextisiemail, @NonNull EditText editTextisipassword,
      @NonNull ConstraintLayout main, @NonNull TextView textView4, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.btnSignUp = btnSignUp;
    this.editTextTTL = editTextTTL;
    this.editTextUsername = editTextUsername;
    this.editTextisiemail = editTextisiemail;
    this.editTextisipassword = editTextisipassword;
    this.main = main;
    this.textView4 = textView4;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignUp;
      Button btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.editTextTTL;
      EditText editTextTTL = ViewBindings.findChildViewById(rootView, id);
      if (editTextTTL == null) {
        break missingId;
      }

      id = R.id.editTextUsername;
      EditText editTextUsername = ViewBindings.findChildViewById(rootView, id);
      if (editTextUsername == null) {
        break missingId;
      }

      id = R.id.editTextisiemail;
      EditText editTextisiemail = ViewBindings.findChildViewById(rootView, id);
      if (editTextisiemail == null) {
        break missingId;
      }

      id = R.id.editTextisipassword;
      EditText editTextisipassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextisipassword == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

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

      return new ActivitySignupBinding((ConstraintLayout) rootView, btnSignUp, editTextTTL,
          editTextUsername, editTextisiemail, editTextisipassword, main, textView4, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
