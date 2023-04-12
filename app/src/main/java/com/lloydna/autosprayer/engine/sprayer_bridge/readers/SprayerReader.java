package com.lloydna.autosprayer.engine.sprayer_bridge.readers;

import com.lloydna.autosprayer.engine.apis.SchedulesApi;
import com.lloydna.autosprayer.engine.schedules.Schedule;
import com.lloydna.autosprayer.engine.schedules.UniversalSchedule;

import java.util.ArrayList;
import java.util.List;

public class SprayerReader extends Reader{
    private SprayerReader(){}

    public static Reader getSprayerReader(){
        if(singleton == null)
            singleton = new SprayerReader();
        return singleton;
    }

    @Override
    public void read() {
        //TODO
        //retrieve data from sprayer
    }

    @Override
    public void sendDataToApp() {

    }
}
