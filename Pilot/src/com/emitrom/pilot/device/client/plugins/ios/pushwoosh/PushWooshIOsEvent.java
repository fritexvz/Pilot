package com.emitrom.pilot.device.client.plugins.ios.pushwoosh;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PushWooshIOsEvent extends JsObject {

    PushWooshIOsEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getAlert()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return peer.notification.aps.alert;
    }-*/;

    public native String getSound()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return peer.notification.aps.sound;
    }-*/;

    public native PushWooshIOsObject getUserData()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = peer.notification.u;
		return @com.emitrom.pilot.device.client.plugins.ios.pushwoosh.PushWooshIOsObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
