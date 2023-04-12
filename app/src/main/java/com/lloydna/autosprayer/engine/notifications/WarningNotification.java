package com.lloydna.autosprayer.engine.notifications;

public class WarningNotification extends Notification{
    public WarningNotification(String notificationBody) {
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
