package com.example.csmashikor.sacrifice;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


public class CameraActivity extends AppCompatActivity {

    private final static int RESULT_CAMERA = 1001;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        //カメラ起動
        imageView = findViewById(R.id.imageView);
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, RESULT_CAMERA);
    }


    protected void onActivityResult(int resultCode, Intent data){
        if(resultCode == RESULT_CAMERA){
            Bitmap bitmap;
            //cancelしたケースも含む
            if(data.getExtras() == null){
                Log.d("debug", "cancel ?");
                return;
            }
            else{
                bitmap = (Bitmap)data.getExtras().get("date");
                //画像サイズを計測
                int bmpWidth = bitmap.getWidth();
                int bmpHeight = bitmap.getHeight();
                Log.d("debug",String.format("w=%d",bmpWidth));
                Log.d("debug",String.format("w=%d",bmpHeight));
            }
            imageView.setImageBitmap(bitmap);
        }

    }

}

