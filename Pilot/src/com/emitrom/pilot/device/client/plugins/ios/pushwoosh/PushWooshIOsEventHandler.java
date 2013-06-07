package com.emitrom.pilot.device.client.plugins.ios.pushwoosh;

public interface PushWooshIOsEventHandler {
    public void onSuccess(String status);

    public void onError(String status);
}
