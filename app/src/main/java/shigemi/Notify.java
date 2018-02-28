package shigemi;

/**
 * Created by cskawasaki.k on 2018/02/28.
 */

public class Notify {
    private boolean birthNotify = true; //初期設定バースデイ通知あり
    private boolean ansNotify = true;   //初期設定知恵袋回答通知あり
    private boolean goodNotify = true;   //初期設定知恵袋good通知あり
    private int picNotify = 2;  //初期設定写真通知週ごと通知

    //バースデイ通知
    public boolean getBirthNotify() {
        return birthNotify;
    }

    public void setBirthNotify(boolean birthNotify) {
        this.birthNotify = birthNotify;
    }

    //知恵袋回答通知
    public boolean getAnsNotify() {
        return ansNotify;
    }

    public void setAnsNotify(boolean ansNotify) {
        this.ansNotify = ansNotify;
    }

    //知恵袋good通知
    public boolean getGoodNotify() {
        return goodNotify;
    }

    public void setGoodNotify(boolean goodNotify) {
        this.goodNotify = goodNotify;
    }

    //写真通知
    public int getPicNotify() {
        return picNotify;
    }

    public void setPicNotify(int picNotify) {
        this.picNotify = picNotify;
    }
}
