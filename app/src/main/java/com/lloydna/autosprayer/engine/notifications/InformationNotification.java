package com.lloydna.autosprayer.engine.notifications;

public class InformationNotification extends Notification{
    public InformationNotification(String notificationBody) {
        this.notificationBody = notificationBody;
    }

    @Override
    public void sendNotification() {
        //TODO
    }

    @Override
    public String getNotificationBody() {
        return notificationBody;
    }
}
