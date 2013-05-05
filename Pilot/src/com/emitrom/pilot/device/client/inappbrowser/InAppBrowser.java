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

import com.emitrom.pilot.device.client.handlers.InAppBrowserEventHandler;
import com.emitrom.pilot.device.client.handlers.InAppBrowserExecuteScriptHandler;
import com.emitrom.pilot.device.client.handlers.InAppBrowserInsertCssHandler;
import com.emitrom.pilot.util.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The InAppBrowser is a web-browser that is shown in your app when you use the
 * window.open call.
 *
 * @see <a href=http://docs.phonegap.com/en/2.7.0/cordova_inappbrowser_inappbrowser.md.html>
 * http://docs.phonegap.com/en/2.7.0/cordova_inappbrowser_inappbrowser.md.html</a>
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
     * Closes this InAppBrowser window.
     */
    public native void close() /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.close();
    }-*/;

    /**
     * Injects JavaScript code into the InAppBrowser window
     *
     * @param url
     *            the URL containing the script that will be executed
     */
    public native void executeScriptFromFile(String url) /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.executeScript({file: url});
    }-*/;

    /**
     * Injects JavaScript code into the InAppBrowser window
     *
     * @param url
     *            , the URL containing the script that will be executed
     * @param handler
     *
     */
    public native void executeScriptFromFile(String url, InAppBrowserExecuteScriptHandler handler) /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        var result = jso.executeScript({file: url});

        handler.@com.emitrom.pilot.device.client.handlers.InAppBrowserExecuteScriptHandler::onScriptFinished(Ljava/lang/Object;)(result)
    }-*/;

    /**
     * Injects JavaScript code into the InAppBrowser window
     *
     * @param script
     *            , text of the script to inject
     */
    public native void executeScriptFromCode(String script) /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.executeScript({code: script});
    }-*/;

    /**
     * Injects JavaScript code into the InAppBrowser window
     *
     * @param script
     *            , text of the script to inject
     * @param handler
     */
    public native void executeScriptFromCode(String script, InAppBrowserExecuteScriptHandler handler) /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        var result = jso.executeScript({code: script});

        handler.@com.emitrom.pilot.device.client.handlers.InAppBrowserExecuteScriptHandler::onScriptFinished(Ljava/lang/Object;)(result);
    }-*/;

    /**
     * Injects CSS into the InAppBrowser window
     *
     * @param url
     *            , the URL of the stylesheet to inject
     */
    public native void insertCssFromUrl(String url)  /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.insertCss({file: url});
    }-*/;

    /**
     * Injects CSS into the InAppBrowser window
     *
     * @param css
     *            , the URL of the stylesheet to inject
     *
     * @param handler
     */
    public native void insertCssFromCode(String css, InAppBrowserInsertCssHandler handler)  /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.insertCss({file: url.toString()});

        handler.@com.emitrom.pilot.device.client.handlers.InAppBrowserInsertCssHandler::onCssInserted()();
    }-*/;

    /**
     * Injects CSS into the InAppBrowser window
     *
     * @param css
     *            , text of the stylesheet to inject
     */
    public native void insertCss(String css)  /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.insertCss({code: css});
    }-*/;

    /**
     * Injects CSS into the InAppBrowser window
     *
     * @param css
     *            , text of the stylesheet to inject
     *
     * @param handler
     */
    public native void insertCss(String css, InAppBrowserInsertCssHandler handler)  /*-{
        var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
        jso.insertCss({code: css});

        handler.@com.emitrom.pilot.device.client.handlers.InAppBrowserInsertCssHandler::onCssInserted()();
    }-*/;

    /**
     * event fired when the InAppBrowser starts to load a URL
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public InAppBrowserHandlerRegistration addLoadStartHandler(InAppBrowserEventHandler handler) {
        return addEventListener("loadstart", handler);
    }

    /**
     * event fired when the InAppBrowser finished loading a URL
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public InAppBrowserHandlerRegistration addLoadStopHandler(InAppBrowserEventHandler handler) {
        return addEventListener("loadstop", handler);
    }

    /**
     * event fired when the InAppBrowser encounters an error loading a URL
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public InAppBrowserHandlerRegistration addLoadErrorHandler(InAppBrowserEventHandler handler) {
        return addEventListener("loaderror", handler);
    }

    /**
     * event fired when the InAppBrowser window is closed
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public InAppBrowserHandlerRegistration addExitHandler(InAppBrowserEventHandler handler) {
        return addEventListener("exit", handler);
    }

    /**
     * Adds a listener for an event from the InAppBrowser.
     */
    public native InAppBrowserHandlerRegistration addEventListener(String event, InAppBrowserEventHandler handler) /*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::jsObj;
		var fn = function(e) {
			var event = @com.emitrom.pilot.device.client.inappbrowser.InAppBrowserEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.pilot.device.client.handlers.InAppBrowserEventHandler::onEvent(Lcom/emitrom/pilot/device/client/inappbrowser/InAppBrowserEvent;)(event);
		};
		jso.addEventListener(event, fn);
		return @com.emitrom.pilot.device.client.inappbrowser.InAppBrowserHandlerRegistration::new(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;)(jso, fn, event);
    }-*/;

}
