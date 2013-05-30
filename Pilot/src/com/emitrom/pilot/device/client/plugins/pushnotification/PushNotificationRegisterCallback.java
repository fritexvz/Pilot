package com.emitrom.pilot.device.client.plugins.pushnotification;

/**
 * Handler Interface for Pushnotification registration
 * 
 */
public interface PushNotificationRegisterCallback {
    public void onSuccess(String result);

    public void onError(String result);
}
