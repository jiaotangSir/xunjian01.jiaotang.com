package com.jiaotang.xunjian01.mission;

import android.widget.Toast;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/11/2.
 */

public class MissionCondition extends BmobObject implements Serializable{


    String missionId;
    String missionStatus;
    String missionPlace;

    public MissionCondition(String missionId,String missionCompletionStatus,String missionPlace){
        this.missionId = missionId;
        this.missionStatus = missionCompletionStatus;
        this.missionPlace = missionPlace;


    }
    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public void setMissionStatus(String missionCompletionStatus) {
        this.missionStatus = missionCompletionStatus;
    }

    public void setMissionPlace(String missionPlace) {
        this.missionPlace = missionPlace;
    }

    public String getMissionId() {
        return missionId;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public String getMissionPlace() {
        return missionPlace;
    }
    
}
