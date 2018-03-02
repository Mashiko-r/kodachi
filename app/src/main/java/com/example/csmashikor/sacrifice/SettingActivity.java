package com.example.csmashikor.sacrifice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

import Shigemi.Notify;

public class SettingActivity extends AppCompatActivity {
    Notify notify = new Notify();   //通知を呼び出す

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        if(notify.getBirthNotifymonthly()){         //trueならボタンをOnにする必要がある
            Switch monthly = findViewById(R.id.monthly);    //キャストは不要になった
            monthly.setChecked(notify.getBirthNotifymonthly());//これでいい…？

        }

    }


}
