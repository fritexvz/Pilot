package com.emitrom.pilot.device.client.plugins.android.pushwoosh;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class PushWooshAndroidObject extends JsObject {

    public PushWooshAndroidObject() {
        jsObj = JsoHelper.createObject();
    }

    PushWooshAndroidObject(JavaScriptObject obj) {
        jsObj = obj;
    }
}
