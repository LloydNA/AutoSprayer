package com.lloydna.autosprayer.engine.notifications.factories;

import com.lloydna.autosprayer.engine.notifications.Notification;
import com.lloydna.autosprayer.engine.notifications.UrgentNotification;

public class UrgentNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotificationWithBody(String notificationBody) {
        return new UrgentNotification(notificationBody);
    }
}
