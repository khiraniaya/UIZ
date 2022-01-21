package com.example.looogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class login_prof extends AppCompatActivity {

    Button btnsignin3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_prof);

        btnsignin3 = (Button) findViewById(R.id.btnsignin3);
        btnsignin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity5();
            }
        });



    }

    public void openActivity5() {
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
}