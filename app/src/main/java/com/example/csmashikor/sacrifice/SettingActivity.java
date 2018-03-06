package com.example.csmashikor.sacrifice;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import Shigemi.Notify;

/**
 * ●確定ボタンの追加
 * →全スイッチ等の設定を同時に確定させる。設定変更の破棄が可能となる。
 * →各リストビュー毎に実装予定。
 *
 * ●写真通知のスピナーの挙動変更
 * →初期値の設定の都合上
 * 　
 */

public class SettingActivity extends AppCompatActivity{
    Notify notify = new Notify();   //ここで無理やりtrueで作らされてる説
    //private TextView debugger;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //debugger = findViewById(R.id.debugger);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);




        Spinner spinner = findViewById(R.id.picNotifySpinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Spinner spinner = (Spinner) adapterView;
                String item = (String)spinner.getSelectedItem();
                if(!item.isEmpty()){
                    //debugger.setText(item + "が選択されたんじゃね？");
                    TextView picnotify = findViewById(R.id.picNotifyNow);
                    //picnotify.setText("現在の設定:"+item);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
               // debugger.setText("何か選べよ");

            }
        });
        initialSetting();   //初期値を全部入れてくれるいい奴
    }

     public void initialSetting(){

            Switch monthly = findViewById(R.id.monthly);        //月ごとの初期値を獲得してスイッチに反映させる
            monthly.setChecked(notify.getBirthNotifymonthly());

            Switch yearly = findViewById(R.id.yearly);          //年ごとの初期値を獲得してスイッチに反映させる
            yearly.setChecked(notify.getBirthNotifyyearly());

            Switch answer = findViewById(R.id.gettingAnswer);   //質問に回答が来る設定の初期値をー
            answer.setChecked(notify.getAnsNotify());

            Switch good = findViewById(R.id.gettingGood);       //質問にGoodが来る設定の初期値をー
            good.setChecked(notify.getGoodNotify());

     }

     public void commitButtonTapped(View view){
         Switch monthly = findViewById(R.id.monthly);
         Switch yearly = findViewById(R.id.yearly);
         Switch answer = findViewById(R.id.gettingAnswer);
         Switch good   = findViewById(R.id.gettingGood);
         /*写真選択*/

         notify.setBirthNotifymonthly(monthly.isChecked());
         notify.setBirthNotifyyearly(yearly.isChecked());
         notify.setAnsNotify(answer.isChecked());
         notify.setGoodNotify(good.isChecked());

     }  //確定ボタンが押された時のメソッド

    public void backButtonTapped(View view){
         finish();
    }
    public void debuggButtonTapped(View view){
        TextView debugger = findViewById(R.id.debugger);
        debugger.setText(String.valueOf("はい"));
    }




}
