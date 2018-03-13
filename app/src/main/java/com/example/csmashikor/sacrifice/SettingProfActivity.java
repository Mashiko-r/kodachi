package com.example.csmashikor.sacrifice;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import Shigemi.ChildStatus;

public class SettingProfActivity extends AppCompatActivity {

    ChildStatus CS = new ChildStatus();
    int birthyear;
    //EditText editcall = findViewById(R.id.editCall);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_prof);
        initialSetting();

        Spinner year = findViewById(R.id.year);     //西暦の管理
        year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                birthyear = i + 2000;


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void boyButtonTapped(View view){
        //CS.setNickName("くん");
        CS.setSex(1);
        nicknameSetting();
    }

    public void girlButtonTapped(View view){
       // CS.setNickName("ちゃん");
        CS.setSex(2);
        nicknameSetting();
    }
/*
    public void kunButtonTapped(View view){
        CS.setNickName("くん");
        nicknameSetting();
    }

    public void chanButtonTapped(View view){
        CS.setNickName("ちゃん");
        nicknameSetting();
    }
    */

    public void commitButtonTapped(View view){
        EditText editcall = findViewById(R.id.editCall);
        String nickname = editcall.getText().toString();
        CS.setNickName(nickname);
        nameChangeButtonTapped();
        initialSetting();

    }           //確定ボタン

    public void nameChangeButtonTapped() {
        EditText editname = findViewById(R.id.editName);
        String name = editname.getText().toString();
        CS.setName(name);
        nameSetting();
    }

    public void nicknameSetting(){
       TextView childNickName =findViewById(R.id.calledby);
        childNickName.setText(CS.getNickName());
    }
    public void nameSetting(){
        EditText childName = findViewById(R.id.editName);
        childName.setText(CS.getName());
    }

    public void initialSetting(){
        nicknameSetting();
        nameSetting();
    }

    public void onBackButtonTapped(View view){
        finish();
    }


}
