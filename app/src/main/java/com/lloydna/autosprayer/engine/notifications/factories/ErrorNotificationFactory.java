package com.lloydna.autosprayer.engine.notifications.factories;

import com.lloydna.autosprayer.engine.notifications.ErrorNotification;
import com.lloydna.autosprayer.engine.notifications.Notification;

public class ErrorNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotificationWithBody(String notificationBody) {
        return new ErrorNotification(notificationBody);
    }
}
