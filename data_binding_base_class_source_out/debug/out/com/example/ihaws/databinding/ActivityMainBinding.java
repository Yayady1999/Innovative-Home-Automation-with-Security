// Generated by view binder compiler. Do not edit!
package com.example.ihaws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.ihaws.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputLayout emailId;

  @NonNull
  public final TextInputEditText emailIdEditText;

  @NonNull
  public final Button forgotPasswordButton;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final TextView logoAbbreText;

  @NonNull
  public final TextView logoText;

  @NonNull
  public final TextInputLayout passwordId;

  @NonNull
  public final TextInputEditText passwordIdEditText;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull TextInputLayout emailId,
      @NonNull TextInputEditText emailIdEditText, @NonNull Button forgotPasswordButton,
      @NonNull Button loginButton, @NonNull TextView logoAbbreText, @NonNull TextView logoText,
      @NonNull TextInputLayout passwordId, @NonNull TextInputEditText passwordIdEditText) {
    this.rootView = rootView;
    this.emailId = emailId;
    this.emailIdEditText = emailIdEditText;
    this.forgotPasswordButton = forgotPasswordButton;
    this.loginButton = loginButton;
    this.logoAbbreText = logoAbbreText;
    this.logoText = logoText;
    this.passwordId = passwordId;
    this.passwordIdEditText = passwordIdEditText;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_id;
      TextInputLayout emailId = rootView.findViewById(id);
      if (emailId == null) {
        break missingId;
      }

      id = R.id.email_id_edit_text;
      TextInputEditText emailIdEditText = rootView.findViewById(id);
      if (emailIdEditText == null) {
        break missingId;
      }

      id = R.id.forgot_password_button;
      Button forgotPasswordButton = rootView.findViewById(id);
      if (forgotPasswordButton == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = rootView.findViewById(id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.logo_abbre_text;
      TextView logoAbbreText = rootView.findViewById(id);
      if (logoAbbreText == null) {
        break missingId;
      }

      id = R.id.logo_text;
      TextView logoText = rootView.findViewById(id);
      if (logoText == null) {
        break missingId;
      }

      id = R.id.password_id;
      TextInputLayout passwordId = rootView.findViewById(id);
      if (passwordId == null) {
        break missingId;
      }

      id = R.id.password_id_edit_text;
      TextInputEditText passwordIdEditText = rootView.findViewById(id);
      if (passwordIdEditText == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, emailId, emailIdEditText,
          forgotPasswordButton, loginButton, logoAbbreText, logoText, passwordId,
          passwordIdEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}