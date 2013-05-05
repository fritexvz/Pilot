/**
 * Copyright (c) 2012 Emitrom LLC. All rights reserved. For licensing questions,
 * please contact us at licensing@emitrom.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.emitrom.pilot.device.client.inappbrowser;

import com.emitrom.pilot.util.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The InAppBrowser is a web-browser that is shown in your app when you use the
 * window.open call.
 */
public class InAppBrowser extends JsObject {

    protected InAppBrowser(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Opens a new browser window. The "name" and "features" arguments are
     * specified <a href=
     * 'http://developer.mozilla.org/en/docs/DOM:window.open'>here</a>.
     * 
     * @param url
     *            the URL that the new window will display
     * @param name
     *            the name of the window (e.g. "_blank")
     * @param features
     *            the features to be enabled/disabled on this window
     */
    public static native InAppBrowser open(String url, String name, String features) /*-{
		var obj = $wnd.open(url, name, features);
		return @com.emitrom.pilot.device.client.inappbrowser.InAppBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * event fired when the InAppBrowser starts to load a URL
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public void addLoadStartHandler(InAppBrowserEventHandler handler) {
        addEventListener("loadstart", handler);
    }

    /**
     * Adds a listener for an event from the InAppBrowser.
     */
    public native InAppBrowserHandlerRegistration addEventListener(String event, InAppBrowserEventHandler handler) /*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
		var fn = function(e) {
			var event = @com.emitrom.pilot.device.client.inappbrowser.InAppBrowserEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.pilot.device.client.inappbrowser.InAppBrowserEventHandler::onEvent(Lcom/emitrom/pilot/device/client/inappbrowser/InAppBrowserEvent;)(event);
		};
		jso.addEventListener(event, fn);
		return @com.emitrom.pilot.device.client.inappbrowser.InAppBrowserHandlerRegistration::new(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;)(jso, fn, event);
    }-*/;

}
