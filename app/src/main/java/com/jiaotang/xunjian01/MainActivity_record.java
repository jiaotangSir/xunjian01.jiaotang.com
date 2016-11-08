package com.jiaotang.xunjian01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import com.jiaotang.xunjian01.record.RecordCondition;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_record extends AppCompatActivity {

    private ArrayList<RecordCondition> mRecordCondition = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_record);

        initRecordCondition();
        ListView listView = (ListView) findViewById(R.id.listView_record);
        RecordAdapter recordAdapter = new RecordAdapter(this,R.layout.record_item,mRecordCondition);
        listView.setAdapter(recordAdapter);
    }
    public void clickBack(View v){
        finish();
    }

    //    初始化数据，后续将加入数据库
    private void initRecordCondition(){
        RecordCondition recordCondition1 = new RecordCondition("XX小区漏水","未处理","2016.10.15");
        RecordCondition recordCondition2 = new RecordCondition("XX小区漏气","未处理","2016.10.16");
        mRecordCondition.add(recordCondition1);
        mRecordCondition.add(recordCondition2);
    }



//    自定义listView适配器
    public class RecordAdapter extends ArrayAdapter<RecordCondition>{

    private int resourceId;

    public RecordAdapter(Context context, int resource, List<RecordCondition> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RecordCondition recordCondition = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        TextView recordTitle = (TextView) view.findViewById(R.id.text_record_title);
        TextView recordCompletionStatus = (TextView) view.findViewById(R.id.text_record_completionStatus);
        TextView recordDate = (TextView) view.findViewById(R.id.text_record_date);
        recordTitle.setText(recordCondition.getRecordTitle());
        recordCompletionStatus.setText(recordCondition.getRecordCompletionStatus());
        recordDate.setText(recordCondition.getRecordDate());

        return view;
    }
}
}
