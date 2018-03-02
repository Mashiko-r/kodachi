package Shigemi;

import java.util.Date;

/**
 * Created by csmashiko.r on 2018/02/28./
 * アプリ内に登録される子供のデータ
 * 二人目以降は未対応
 */

public class ChildStatus {
    private String name = "";           //名前
    private Date birth;                 //誕生日
    private int sex = 0;                //0=不明 1=男 2=女
    private String nickName = "";       //ニックネーム

    public ChildStatus getChildStatus(){    //ゲッター
        ChildStatus CS = new ChildStatus(); //インスタンスを生成
        CS.name = this.name;
        CS.birth = this.birth;
        CS.sex = this.sex;
        CS.nickName = this.nickName;
        return CS;                         //ChildStatusを返却

    }

    public void setChildStatus(ChildStatus CS){ //セッター
        this.name = CS.name;
        this.birth = CS.birth;
        this.sex = CS.sex;
        this.nickName = CS.nickName;
    }                                           //返却なし

}
