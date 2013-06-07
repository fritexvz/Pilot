package com.emitrom.pilot.device.client.plugins.ios.pushwoosh;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class PushWooshIOsObject extends JsObject {

    public PushWooshIOsObject() {
        jsObj = JsoHelper.createObject();
    }

    PushWooshIOsObject(JavaScriptObject obj) {
        jsObj = obj;
    }
}
