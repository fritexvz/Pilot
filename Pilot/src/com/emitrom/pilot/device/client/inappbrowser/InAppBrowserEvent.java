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

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;

/**
 * The object that is passed to the callback function from an addEventListener
 * call on an InAppBrowser object.
 */
public class InAppBrowserEvent extends JsObject {

    protected InAppBrowserEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the eventname (String) - one of loadstart, loadstop, loaderror or exit
     */
    public native String getType() /*-{
		var jso = this.@com.pilot.shared.client.JsObject::jsObj;
		return jso.type;
    }-*/;

    /**
     * the URL that was loaded (String)
     */
    public native String getUrl() /*-{
		var jso = this.@com.pilot.shared.client.JsObject::jsObj;
		return jso.url;
    }-*/;

    /**
     * the error code (Number) - only in the case of loaderror
     */
    public native int getCode() /*-{
		var jso = this.@com.pilot.shared.client.JsObject::jsObj;
		return jso.code;
    }-*/;

    /**
     * the error message (String) - only in the case of loaderror
     */
    public native String getMessage() /*-{
		var jso = this.@com.pilot.shared.client.JsObject::jsObj;
		return jso.message;
    }-*/;

}
