package com.jiaotang.xunjian01.record;

/**
 * Created by Administrator on 2016/11/4.
 */

public class RecordCondition {
    String recordTitle;
    String recordCompletionStatus;
    String recordDate;

    public RecordCondition(String recordTitle,String recordCompletionStatus,String recordDate){
        this.recordTitle = recordTitle;
        this.recordCompletionStatus = recordCompletionStatus;
        this.recordDate = recordDate;
    }


    public String getRecordTitle() {
        return recordTitle;
    }

    public String getRecordCompletionStatus() {
        return recordCompletionStatus;
    }

    public String getRecordDate() {
        return recordDate;
    }
}
