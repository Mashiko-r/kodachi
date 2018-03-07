package Shigemi;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;

import com.example.csmashikor.sacrifice.MainActivity;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by cskawasaki.k on 2018/02/28.
 *
 * 猿子:共有プリファレンスに通知設定全部投げます
 * 　　:通知設定にアクセスできるのはこのクラスだけなので、通知設定を読み込む際は必ずこのクラスを経由することになります。
 *
 */

public class Notify{

    Context applicationContext = MainActivity.getContextOfApplication();

    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(applicationContext);
    SharedPreferences.Editor editor = pref.edit();





    //バースデイ通知
    public boolean getBirthNotifymonthly() {

        return pref.getBoolean("BIRTH_NOTIFY_MONTHLY",true);
    }//月ごと

    public void setBirthNotifymonthly(boolean birthNotifymonthly) {
        editor.putBoolean("BIRTH_NOTIFY_MONTHLY",birthNotifymonthly);
        editor.commit();
    }//月ごと

    public boolean getBirthNotifyyearly() {
        return pref.getBoolean("BIRTH_NOTIFY_YEARLY",true);
    }//年ごと

    public void setBirthNotifyyearly(boolean birthNotifyyearly) {
        editor.putBoolean("BIRTH_NOTIFY_YEARLY",birthNotifyyearly);
        editor.commit();
    }   //年ごと


    //知恵袋回答通知
    public boolean getAnsNotify() {
        return pref.getBoolean("GET_ANSWER_NOTIFY",true);
    }

    public void setAnsNotify(boolean ansNotify) {
        editor.putBoolean("GET_ANSWER_NOTIFY",ansNotify);
        editor.commit();
    }

    //知恵袋good通知
    public boolean getGoodNotify() {
        return pref.getBoolean("GET_GOOD_NOTIFY",true);
    }

    public void setGoodNotify(boolean goodNotify) {
        editor.putBoolean("GET_GOOD_NOTIFY",goodNotify);
        editor.commit();
    }

    //写真通知
    public int getPicNotify() {
        return pref.getInt("GET_PIC_NOTIFY",3);
    }

    public void setPicNotify(int picNotify) {
        editor.putInt("GET_PIC_NOTIFY",picNotify);
        editor.commit();

    }
}
