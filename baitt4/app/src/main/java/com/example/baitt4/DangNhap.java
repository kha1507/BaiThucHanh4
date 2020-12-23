package com.example.baitt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DangNhap extends AppCompatActivity {
    Button btSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        btSignUp =(Button) findViewById(R.id.button_dn);
        btSignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(DangNhap.this, "Đăng Nhập thành công", Toast.LENGTH_LONG).show();
                Intent it =new Intent(DangNhap.this, TaiKhoan.class);
                startActivity(it);
            }
        });
    }
}

