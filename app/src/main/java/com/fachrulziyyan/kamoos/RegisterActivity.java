package com.fachrulziyyan.kamoos;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText inputEmail, inputUser, inputPassword, inputFullName; // Tambahkan deklarasi inputFullName
    private MaterialButton btnRegister;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi semua input field dan button
        inputEmail = findViewById(R.id.inputEmail);
        inputUser = findViewById(R.id.inputUser);
        inputPassword = findViewById(R.id.inputPassword);
        inputFullName = findViewById(R.id.inputFullName); // Pastikan ID sesuai dengan di activity_register.xml
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString().trim();
                String username = inputUser.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();
                String fullName = inputFullName.getText().toString().trim();

                // Validasi input
                if (email.isEmpty() || username.isEmpty() || password.isEmpty() || fullName.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Semua field harus diisi", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!email.endsWith("@gmail.com")) {
                    Toast.makeText(RegisterActivity.this, "Maaf Email yang Anda masukkan salah", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Simpan data ke SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit(); // Deklarasi dan inisialisasi editor

                editor.putString("email", email);
                editor.putString("username", username);
                editor.putString("password", password);
                editor.putString("fullName", fullName); // Simpan Nama Lengkap
                editor.apply();

                Toast.makeText(RegisterActivity.this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show();

                // Pindah ke MainActivity dengan membawa Nama Lengkap
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                intent.putExtra("FULL_NAME", fullName);
                startActivity(intent);
                finish();
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
