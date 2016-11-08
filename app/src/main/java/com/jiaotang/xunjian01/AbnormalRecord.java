package com.jiaotang.xunjian01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AbnormalRecord extends AppCompatActivity {

    private Spinner spinner;
    private String[] abnormalLevel = {"一级隐患","二级隐患","三级隐患"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abnormal_record);

        spinner = (Spinner) findViewById(R.id.spinner_abnormal_level);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,abnormalLevel);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
