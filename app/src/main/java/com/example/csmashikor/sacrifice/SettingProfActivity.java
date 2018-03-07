package com.example.csmashikor.sacrifice;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import Shigemi.ChildStatus;

public class SettingProfActivity extends AppCompatActivity {

    ChildStatus CS = new ChildStatus();
    private EditText editcall = findViewById(R.id.editCall);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_prof);
        initialSetting();
    }

    public void boyButtonTapped(View view){
        CS.setNickName("くん");
        CS.setSex(1);
        initialSetting();
    }

    public void girlButtonTapped(View view){
        CS.setNickName("ちゃん");
        CS.setSex(2);
        initialSetting();
    }

    public void kunButtonTapped(View view){
        CS.setNickName("くん");
        initialSetting();
    }

    public void chanButtonTapped(View view){
        CS.setNickName("ちゃん");
        initialSetting();
    }

    public void otherButtonTapped(View view){

        //IMEを開く
    }

    public void nameChangeButtonTapped(View view){

    }

    public void initialSetting(){
        TextView childName = findViewById(R.id.namestring);
        TextView childNickName =findViewById(R.id.calledby);

        childName.setText(CS.getName());
        childNickName.setText(CS.getNickName());
    }


}
