package com.example.dazhongdianping.UI.UI;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dazhongdianping.R;

public class SplassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splass);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp = getSharedPreferences("sp", Context.MODE_PRIVATE);
                boolean first = sp.getBoolean("first", true);
                if(first){
                    startActivity(new Intent(SplassActivity.this,GuideActivity.class));
                    SharedPreferences.Editor editor=sp.edit();
                    editor.putBoolean("first",false);
                    editor.commit();
                }else {
                    startActivity(new Intent(SplassActivity.this,SplassActivity.class));
                }
                finish();
            }
        },5000);

    }
}
