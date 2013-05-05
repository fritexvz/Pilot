package com.emitrom.pilot.device.client.inappbrowser;

import com.google.gwt.core.client.JavaScriptObject;

public class InAppBrowserHandlerRegistration {

    private JavaScriptObject iapp;
    private JavaScriptObject fn;
    private String eventName;

    public InAppBrowserHandlerRegistration(JavaScriptObject iapp, JavaScriptObject fn, String eventName) {
        super();
        this.iapp = iapp;
        this.fn = fn;
        this.eventName = eventName;
    }

    public native void unregister() /*-{
		var obj = this.@com.emitrom.pilot.device.client.inappbrowser.InAppBrowserHandlerRegistration::iapp;
		var objjso = obj.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
		var action = this.@com.emitrom.pilot.device.client.inappbrowser.InAppBrowserHandlerRegistration::eventName;
		var fn = this.@com.emitrom.pilot.device.client.inappbrowser.InAppBrowserHandlerRegistration::fn;
		objjso.removeEventListener(action, fn);
    }-*/;

}
