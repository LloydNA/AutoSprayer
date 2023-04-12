package com.lloydna.autosprayer.engine.sprayer_bridge.readers;

import androidx.annotation.Discouraged;

import com.lloydna.autosprayer.engine.apis.SchedulesApi;
import com.lloydna.autosprayer.engine.schedules.Schedule;
import com.lloydna.autosprayer.engine.schedules.UniversalSchedule;

import java.util.ArrayList;
import java.util.List;

public class SchedulesReader extends Reader{
    private SchedulesReader(){}

    public static Reader getSchedulesReader(){
        if(singleton == null)
            singleton = new SchedulesReader();
        return singleton;
    }

    @Override
    public void read() {
        //TODO
        //retrieve data from sprayer
    }

    @Override
    public void sendDataToApp() { //we are going to use IDL objects from opendds
        SchedulesApi.getSchedulesApi().updateAppData(null);
    }

    @Discouraged(message = "This function is only meant for testing purposes")
    public void sendTestSchedules(){
        List<Schedule> schedules = new ArrayList<>();

        schedules.add(new UniversalSchedule("Winter"));
        schedules.add(new UniversalSchedule("Summer"));
        schedules.add(new UniversalSchedule("Spring"));

        SchedulesApi.getSchedulesApi().updateAppData(schedules);
    }
}
