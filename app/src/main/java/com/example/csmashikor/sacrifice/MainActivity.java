package com.example.csmashikor.sacrifice;

import android.content.Intent;
import android.graphics.Camera;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void settingButtonTapped(View view){                                                     //設定ボタンがタップされた時。設定画面へ遷移する
        Intent intent =new Intent(this,SettingActivity.class);
        startActivity(intent);


    }

    /*public void plusButtonTapped(View view){
        Intent intent = new Intent(this,カメラアプリへ遷移.class);
        startActivity(intent);
    }*/



}