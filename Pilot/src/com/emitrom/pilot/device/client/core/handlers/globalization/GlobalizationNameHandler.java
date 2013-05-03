package com.emitrom.pilot.device.client.core.handlers.globalization;

import java.util.List;

public interface GlobalizationNameHandler {
    public void onSuccess(List<String> names);

    public void onError();
}
