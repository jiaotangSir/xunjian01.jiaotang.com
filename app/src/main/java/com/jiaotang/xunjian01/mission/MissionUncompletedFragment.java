package com.jiaotang.xunjian01.mission;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.jiaotang.xunjian01.DataMessage;
import com.jiaotang.xunjian01.MainActivity;
import com.jiaotang.xunjian01.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class MissionUncompletedFragment extends Fragment {

    //定义待办任务数组unMissionConditionList
    private List<MissionCondition> unMissionConditionList = new ArrayList<>();
    private String[] data = {"1212","33333"};


    public MissionUncompletedFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mission_uncompleted, container, false);
        //取出dataMessage中的未完成任务的数据
        DataMessage dataMessage = DataMessage.getSingleMessage();
        unMissionConditionList = dataMessage.unMissionConditionList;



//        重写listView
        MissionConditionAdapter missionConditionAdapter = new MissionConditionAdapter(
                getContext(),
                R.layout.mission_completed_item,
                unMissionConditionList);
        ListView listView = (ListView) view.findViewById(R.id.listView_uncompleted);
        listView.setAdapter(missionConditionAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //这里弹出详细界面，并传入本行任务的详细数据,数据待写

                //获取对应行的数据，以后会进行数据的传递
                MissionCondition missionCondition = unMissionConditionList.get(position);
                //进入待办任务详细页面
                Intent intent = new Intent(getContext(),MissionUncompletedDetail.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("missionCondition", missionCondition);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });


        return view;
    }



}
