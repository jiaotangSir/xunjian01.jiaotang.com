package com.jiaotang.xunjian01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AbnormalRecord extends AppCompatActivity {

    private Button button_back;
    private Spinner spinner;
    private String[] abnormalLevel = {"一级隐患","二级隐患","三级隐患"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abnormal_record);

        button_back = (Button)findViewById(R.id.button_abnormalBack);
        spinner = (Spinner) findViewById(R.id.spinner_abnormal_level);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,abnormalLevel);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
