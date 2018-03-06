package com.example.csmashikor.sacrifice;

import android.content.Context;
import android.content.Intent;
import android.graphics.Camera;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import Shigemi.Notify;

public class MainActivity extends AppCompatActivity {

    public static Context contextOfApplication;     //アプリ全体で保持するコンテキスト
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contextOfApplication = getApplicationContext();
    }

    public void settingButtonTapped(View view){                                                     //設定ボタンがタップされた時。設定画面へ遷移する
        Intent intent =new Intent(this,ChooseSettingActivity.class);
        startActivity(intent);
    }

    public void debuggButtonTapped(View view){
        //最終的に削除

    }

    public static Context getContextOfApplication(){
        return contextOfApplication;
    }

    public void plusButtonTapped(View view){
       //カメラアプリへ遷移
    }



}