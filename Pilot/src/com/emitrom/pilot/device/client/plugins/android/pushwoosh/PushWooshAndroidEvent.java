package com.emitrom.pilot.device.client.plugins.android.pushwoosh;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class PushWooshAndroidEvent extends JsObject {

    PushWooshAndroidEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native String getTitle()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return peer.notification.title;
    }-*/;

    public native PushWooshAndroidObject getUserData()/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = peer.notification.userData;
		return @com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

}
