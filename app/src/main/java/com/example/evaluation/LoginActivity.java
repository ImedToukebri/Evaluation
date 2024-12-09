package com.example.evaluation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin = findViewById(R.id.btnLogin);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin.setOnClickListener(v -> {

            String username = "admin";
            String password = "1234";


            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
