package com.lloydna.autosprayer.engine.apis;

import androidx.annotation.Discouraged;

import com.lloydna.autosprayer.engine.schedules.Schedule;
import com.lloydna.autosprayer.engine.sprayer_bridge.readers.SchedulesReader;

import java.util.List;

public class SchedulesApi extends Api{ //observable schedule?
    private List<Schedule> subscribers;

    private SchedulesApi(){

    }

    public static Api getSchedulesApi(){
        if(singleton == null)
            singleton = new SchedulesApi();
        return singleton;
    }

    @Override //test implementation, not final one
    public void updateAppData(Object update) {
        List<Schedule> data = (List<Schedule>)update;

        subscribers = data;
    }
//pending eventbus or some sort of something like NSNotification
    @Override
    public void sendAppData() {

    }

    @Discouraged(message = "For testing purposes")
    public List<Schedule> getSchedules(){
        ((SchedulesReader)SchedulesReader.getSchedulesReader()).sendTestSchedules();

        return subscribers;
    }

}
