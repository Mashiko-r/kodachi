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

    public void commitButtonTapped(View view){
        EditText editcall = findViewById(R.id.editCall);
        String nickname = editcall.getText().toString();
        CS.setNickName(nickname);
        initialSetting();
        //IMEを開く
    }

    public void nameChangeButtonTapped(View view){
        EditText editname = findViewById(R.id.editName);
        String name = editname.getText().toString();
        CS.setName(name);
        initialSetting();

    }

    public void initialSetting(){
        EditText childName = findViewById(R.id.editName);
        TextView childNickName =findViewById(R.id.calledby);


        childName.setText(CS.getName());
        childNickName.setText(CS.getNickName());
    }


}
