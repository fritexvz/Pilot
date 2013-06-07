package com.emitrom.pilot.device.client.plugins.android.pushwoosh;

public interface PushWooshEventHandler {
    public void onSuccess(String status);

    public void onError(String status);
}
