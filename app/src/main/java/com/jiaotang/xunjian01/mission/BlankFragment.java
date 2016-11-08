package com.jiaotang.xunjian01.mission;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.jiaotang.xunjian01.MainActivity_mission;
import com.jiaotang.xunjian01.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private List<MissionCondition> missionConditionList = new ArrayList<MissionCondition>();

    public BlankFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        //加载layout_main_mission_uncompleted.xml布局
        View view = inflater.inflate(R.layout.layout_main_mission_uncompleted,container,false);
//        初始化数据，以后是从数据库解析数据
        initMissionCondition();
//        重写listView
        MissionConditionAdapter missionConditionAdapter = new MissionConditionAdapter(
                getContext(),
                R.layout.mission_completed_item,
                missionConditionList);
        final ListView listView = (ListView) view.findViewById(R.id.listView_uncompleted);
        listView.setAdapter(missionConditionAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //这里弹出详细界面，并传入本行任务的详细数据,数据待写
                System.out.println("ddddddddd");
                Toast.makeText(getActivity(),"1212121212",Toast.LENGTH_LONG).show();
//                MissionCondition missionCondition = missionConditionList.get(position);
//                Intent intent = new Intent(getContext(),MissionUncompletedDetail.class);
//                startActivity(intent);


            }
        });
        

        return view;
    }

    //        初始化数据，以后是从数据库解析数据
    private void initMissionCondition(){

        MissionCondition missionCondition1 =  new MissionCondition("20161101","待办","德州某地1");
        missionConditionList.add(missionCondition1);
        MissionCondition missionCondition2 =  new MissionCondition("20161102","待办","德州某地2");
        missionConditionList.add(missionCondition2);

    }



}
