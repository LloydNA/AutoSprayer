package com.lloydna.autosprayer.engine.notifications;

public class ErrorNotification extends Notification{
    public ErrorNotification(String notificationBody) {
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
