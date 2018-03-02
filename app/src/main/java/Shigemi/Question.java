package Shigemi;

/**
 * Created by csmashiko.r on 2018/03/02.
 * 知恵袋の質問クラス
 * 回答のために一度ここを経由する
 */

public class Question {
    private int questionID;     //質問のID
    private int userID;         //質問したユーザID
    private String title;       //質問のタイトル
    private String text;        //質問の本文
    private int questionDate;   //質問した日付
    private int childGrowCon;   //質問当初の子供の成長度合い
    private String category;    //カテゴリ

}
