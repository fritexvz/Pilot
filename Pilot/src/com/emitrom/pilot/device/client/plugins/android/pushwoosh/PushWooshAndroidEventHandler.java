package com.emitrom.pilot.device.client.plugins.android.pushwoosh;

public interface PushWooshAndroidEventHandler {
    public void onSuccess(String status);

    public void onError(String status);
}
