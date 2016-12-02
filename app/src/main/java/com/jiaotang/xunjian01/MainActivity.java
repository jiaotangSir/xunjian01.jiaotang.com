package com.jiaotang.xunjian01;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        b1 = (Button) findViewById(R.id.button_mission);
        b2 = (Button) findViewById(R.id.button_map);
        b3 = (Button) findViewById(R.id.button_record);
// 注册三个按钮
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);


        //初始化数据
        DataMessage dataMessage = DataMessage.getSingleMessage();
        dataMessage.initUnmissionData();



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_mission:

                {
                System.out.println("任务");
                Intent intent_mission;
                intent_mission = new Intent(this,MainActivity_mission.class);
                startActivity(intent_mission);
                }
                break;
            case R.id.button_map:
                System.out.println("地图");
                Intent intent_map;
                intent_map = new Intent(this,MainActivity_map.class);
                startActivity(intent_map);
                break;
            case R.id.button_record: {
                System.out.println("记录");
                Intent intent_record = new Intent(this,MainActivity_record.class);
                startActivity(intent_record);

            }
            break;
        }

    }



}
