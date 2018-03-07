package com.example.csmashikor.sacrifice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_home);
    }

    public void onBackButtonTapped(View view){
        finish();
    }
}
