package com.example.ihaws;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/ihaws/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "binding", "Lcom/example/ihaws/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/ihaws/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/ihaws/databinding/ActivityMainBinding;)V", "doLogin", "", "forgotPassword", "emailid", "Landroid/widget/EditText;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "updateUI", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.ihaws.databinding.ActivityMainBinding binding;
    private com.google.firebase.auth.FirebaseAuth auth;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ihaws.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.ihaws.databinding.ActivityMainBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void doLogin() {
    }
    
    private final void forgotPassword(android.widget.EditText emailid) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void updateUI(com.google.firebase.auth.FirebaseUser currentUser) {
    }
    
    public MainActivity() {
        super();
    }
}