package shigemi;

import java.util.Date;

/**
 * Created by csmashiko.r on 2018/02/28.
 */

public class ChildStatus {
    private String name = "";           //名前
    private Date birth;                 //誕生日
    private int sex = 0;                //0=不明 1=男 2=女
    private String nickName = "";       //ニックネーム

    public ChildStatus getChildStatus(){    //ゲッター
        ChildStatus CS = new ChildStatus(); //インスタンスを生成
        CS.name = name;
        CS.birth = birth;
        CS.sex = sex;
        CS.nickName = nickName;
        return CS;                         //ChildStatusを返却

    }

    public void setChildStatus(ChildStatus CS){ //セッター
        name = CS.name;
        birth = CS.birth;
        sex = CS.sex;
        nickName = CS.nickName;
    }                                           //返却なし

}
