package com.jiaotang.xunjian01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity_map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

    }
    public void clickAbnormal(View v){
        Intent intent = new Intent(this,AbnormalRecord.class);
        startActivity(intent);
    }
}
