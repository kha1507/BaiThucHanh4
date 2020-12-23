package com.example.baitt4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TaiKhoan extends AppCompatActivity {
    Button ql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taikhoan);
        ql = (Button) findViewById(R.id.bt_logout);
        ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToi();
            }
        });

    }


    public void openToi() {
        Intent it=new Intent(TaiKhoan.this,DangNhap.class);
        startActivity(it);
    }

}

