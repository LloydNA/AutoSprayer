package com.lloydna.autosprayer.engine.notifications.factories;

import com.lloydna.autosprayer.engine.notifications.Notification;
import com.lloydna.autosprayer.engine.notifications.WarningNotification;

public class WarningNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotificationWithBody(String notificationBody) {
        return new WarningNotification(notificationBody);
    }
}
