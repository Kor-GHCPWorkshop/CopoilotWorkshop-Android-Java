package com.keon.engwordzzang.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.keon.engwordzzang.R;
import com.keon.engwordzzang.MainActivity;

public class LoginFragment extends Fragment {

    private EditText emailEditText, passwordEditText;
    private Button loginButton, registerButton;
    private ProgressBar progressBar;
    private FirebaseAuth firebaseAuth;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        
        // 초기화
        emailEditText = view.findViewById(R.id.email_edit_text);
        passwordEditText = view.findViewById(R.id.password_edit_text);
        loginButton = view.findViewById(R.id.login_button);
        registerButton = view.findViewById(R.id.register_button);
        progressBar = view.findViewById(R.id.progress_bar);
        
        // Firebase Auth 인스턴스 초기화
        firebaseAuth = FirebaseAuth.getInstance();
        
        // 로그인 버튼 클릭 리스너 설정
        loginButton.setOnClickListener(v -> loginUser());
        
        // 회원가입 버튼 클릭 리스너 설정
        registerButton.setOnClickListener(v -> registerUser());
        
        return view;
    }
    
    @Override
    public void onStart() {
        super.onStart();
        // 이미 로그인된 사용자 확인
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if (currentUser != null) {
            navigateToMainActivity();
        }
    }
    
    private void loginUser() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        
        if (validateForm(email, password)) {
            progressBar.setVisibility(View.VISIBLE);
            
            firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getContext(), "로그인 성공!", Toast.LENGTH_SHORT).show();
                            navigateToMainActivity();
                        } else {
                            Toast.makeText(getContext(), "로그인 실패: " + task.getException().getMessage(), 
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
    
    private void registerUser() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        
        if (validateForm(email, password)) {
            progressBar.setVisibility(View.VISIBLE);
            
            firebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getContext(), "회원가입 성공!", Toast.LENGTH_SHORT).show();
                            navigateToMainActivity();
                        } else {
                            Toast.makeText(getContext(), "회원가입 실패: " + task.getException().getMessage(), 
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
    
    private boolean validateForm(String email, String password) {
        boolean valid = true;
        
        if (TextUtils.isEmpty(email)) {
            emailEditText.setError("이메일을 입력해주세요");
            valid = false;
        } else {
            emailEditText.setError(null);
        }
        
        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("비밀번호를 입력해주세요");
            valid = false;
        } else if (password.length() < 6) {
            passwordEditText.setError("비밀번호는 6자 이상이어야 합니다");
            valid = false;
        } else {
            passwordEditText.setError(null);
        }
        
        return valid;
    }
    
    private void navigateToMainActivity() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}
