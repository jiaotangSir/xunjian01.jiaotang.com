package com.jiaotang.xunjian01.mission;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.jiaotang.xunjian01.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    private List<MissionCondition> missionConditionList = new ArrayList<MissionCondition>();

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        加载布局layout_main_mission_completed
        View view = inflater.inflate(R.layout.layout_main_mission_completed,container,false);
//        初始化数据，以后是从数据库解析数据
        initMissionCondition();
//        重写listView
        MissionConditionAdapter missionConditionAdapter = new MissionConditionAdapter(getContext(),
                R.layout.mission_completed_item,missionConditionList);
        ListView listView = (ListView) view.findViewById(R.id.listView_completed);
        listView.setAdapter(missionConditionAdapter);
        return view;
    }

    //        初始化数据，以后是从数据库解析数据
    private void initMissionCondition(){

        MissionCondition missionCondition1 =  new MissionCondition("20161101","已办","德州某地1");
        missionConditionList.add(missionCondition1);
        MissionCondition missionCondition2 =  new MissionCondition("20161102","已办","德州某地2");
        missionConditionList.add(missionCondition2);

    }
}
