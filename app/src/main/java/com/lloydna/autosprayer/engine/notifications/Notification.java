package com.lloydna.autosprayer.engine.notifications;

public abstract class Notification {
    protected String notificationBody;

    public abstract void sendNotification();
    public abstract String getNotificationBody();
}
