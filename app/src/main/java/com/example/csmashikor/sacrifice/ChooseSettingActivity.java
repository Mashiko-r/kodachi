package com.example.csmashikor.sacrifice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_setting);
    }

    public void backButtonTapped(View view){
        finish();
    }//戻る

    public void profileButtonTapped(View view){
        Intent intent = new Intent(this, SettingProfActivity.class);
        startActivity(intent);
    }//プロフィール設定画面へ遷移

    public void notifyButtonTapped(View view){
        Intent intent = new Intent(this,SettingActivity.class);
        startActivity(intent);
    }//通知設定画面へ遷移

    public void homeButtonTapped(View view){

    }//home設定画面へ遷移(空)


}
