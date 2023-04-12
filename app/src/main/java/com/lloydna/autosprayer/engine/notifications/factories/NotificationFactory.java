package com.lloydna.autosprayer.engine.notifications.factories;

import com.lloydna.autosprayer.engine.notifications.Notification;

public interface NotificationFactory {
    public Notification createNotificationWithBody(String notificationBody);
}
