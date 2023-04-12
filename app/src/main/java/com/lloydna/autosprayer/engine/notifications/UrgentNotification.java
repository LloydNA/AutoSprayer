package com.lloydna.autosprayer.engine.notifications;

public class UrgentNotification extends Notification{
    public UrgentNotification(String notificationBody) {
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
