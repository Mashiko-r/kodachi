package Shigemi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.csmashikor.sacrifice.MainActivity;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by csmashiko.r on 2018/02/28./
 * アプリ内に登録される子供のデータ
 * 二人目以降は未対応
 */

public class ChildStatus {

    Context applicationContext = MainActivity.getContextOfApplication();
    SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(applicationContext);
    SharedPreferences.Editor editor = pref.edit();

    private String name = "";           //名前
    private Date birth;                 //誕生日
    private int sex = 0;                //0=不明 1=男 2=女
    private String nickName = "";       //ニックネーム

    public String getName(){
        return pref.getString("CHILD_NAME","未設定");
    }

    public void setName(String s){
        editor.putString("CHILD_NAME",s);
        editor.commit();
    }


    public void setChildStatus(ChildStatus CS){ //セッター
        this.name = CS.name;
        this.birth = CS.birth;
        this.sex = CS.sex;
        this.nickName = CS.nickName;
    }                                           //返却なし

}
