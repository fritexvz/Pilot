package com.emitrom.pilot.device.client.plugins.pushnotification;

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

public class PushNotificationRegisterConfig extends JsObject {

    public PushNotificationRegisterConfig() {
        jsObj = JsoHelper.createObject();
    }

    public void setSenderId(String value) {
        JsoHelper.setAttribute(jsObj, "senderId", value);
    }

    public void setEcb(PushNotificationCallback callback) {
        JsoHelper.setAttribute(jsObj, "ecb", getEcbHandler(callback));
    }

    public void setBadge(boolean value) {
        JsoHelper.setAttribute(jsObj, "badge", value);
    }

    public void setSound(boolean value) {
        JsoHelper.setAttribute(jsObj, "sound", value);
    }

    public void setAlert(boolean value) {
        JsoHelper.setAttribute(jsObj, "alert", value);
    }

    private native JavaScriptObject getEcbHandler(PushNotificationCallback callback)/*-{
		return function(e) {
			var event = @com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationCallback::onEvent(Lcom/emitrom/pilot/device/client/plugins/pushnotification/PushNotificationEvent;)(event);
		};
    }-*/;

}
