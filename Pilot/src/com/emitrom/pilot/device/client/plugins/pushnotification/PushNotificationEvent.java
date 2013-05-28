package com.emitrom.pilot.device.client.plugins.pushnotification;

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

public class PushNotificationEvent extends JsObject {

    protected PushNotificationEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getAlert() {
        return JsoHelper.getAttribute(jsObj, "alert");
    }

    public String getSound() {
        return JsoHelper.getAttribute(jsObj, "sound");
    }

    public int getBadge() {
        return JsoHelper.getAttributeAsInt(jsObj, "badge");
    }

    public String getEvent() {
        return JsoHelper.getAttribute(jsObj, "event");
    }

    public boolean isForeground() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "foreground");
    }

    public boolean isColdStart() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "coldstart");
    }

    public String getRegID() {
        return JsoHelper.getAttribute(jsObj, "regID");
    }

}
