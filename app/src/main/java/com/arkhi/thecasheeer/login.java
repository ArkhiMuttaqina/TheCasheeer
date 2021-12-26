package com.arkhi.thecasheeer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.arkhi.thecasheeer.main_home;
import com.arkhi.thecasheeer.login;


public class login extends AppCompatActivity {
    public ImageButton btn_signin_google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init_item();

    }

    public void init_item() {
        btn_signin_google = findViewById(R.id.button_signin);
        btn_signin_google.setOnClickListener(v -> {
            Intent goToX = new Intent(login.this, main_home.class);
            startActivity(goToX);
            login.this.finish();
        });
    }



}