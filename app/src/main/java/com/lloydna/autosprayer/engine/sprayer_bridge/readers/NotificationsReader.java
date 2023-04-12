package com.lloydna.autosprayer.engine.sprayer_bridge.readers;

import com.lloydna.autosprayer.engine.schedules.Schedule;

import java.util.List;

public class NotificationsReader extends Reader{
    private NotificationsReader(){}

    public static Reader getNotificationsReader(){
        if(singleton == null)
            singleton = new NotificationsReader();
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
