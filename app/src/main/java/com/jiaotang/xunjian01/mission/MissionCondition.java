package com.jiaotang.xunjian01.mission;

/**
 * Created by Administrator on 2016/11/2.
 */

public class MissionCondition {
    String missionId;
    String missionCompletionStatus;
    String missionPlace;

    public MissionCondition(String missionId,String missionCompletionStatus,String missionPlace){
        this.missionId = missionId;
        this.missionCompletionStatus = missionCompletionStatus;
        this.missionPlace = missionPlace;


    }

    public String getMissionId() {
        return missionId;
    }

    public String getMissionCompletionStatus() {
        return missionCompletionStatus;
    }

    public String getMissionPlace() {
        return missionPlace;
    }
}
