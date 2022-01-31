package com.example.looogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity_dashboard extends AppCompatActivity implements View.OnClickListener {
CardView home,info,scan,download_scan,prof,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        home=(CardView) findViewById(R.id.home_card);
        info=(CardView) findViewById(R.id.info_card);
       scan=(CardView) findViewById(R.id.scan_card);
        download_scan=(CardView) findViewById(R.id.downloadscan_card);
        prof=(CardView) findViewById(R.id.prof_card);
        email=(CardView) findViewById(R.id.email_card);

// ajouter un ecouteur
        home.setOnClickListener(this);
        info.setOnClickListener(this);
        scan.setOnClickListener(this);
        download_scan.setOnClickListener(this);
        prof.setOnClickListener(this);
        email.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.home_card:i=new Intent(this,home_page.class);startActivity(i);break;
            case R.id.info_card:i=new Intent(this,MainActivity3.class);startActivity(i);break;
            case R.id.scan_card:i=new Intent(this,scan_activity.class);startActivity(i);break;
            case R.id.downloadscan_card:i=new Intent(this,download_scan_activity.class);startActivity(i);break;
            case R.id.prof_card:i=new Intent(this,prof_activity.class);startActivity(i);break;
            case R.id.email_card:i=new Intent(this,email_activity.class);startActivity(i);break;

            default:break;
        }

    }
}