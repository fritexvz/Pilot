/**
   Copyright (c) 2012 Emitrom LLC. All rights reserved. 
   For licensing questions, please contact us at licensing@emitrom.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.emitrom.pilot.maps.client.services.maxzoom;

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A MaxZoom result in JSON format retrieved from the MaxZoomService.
 * 
 */
public class MaxZoomResult extends JsObject {

    public MaxZoomResult() {
        jsObj = JsoHelper.createObject();
    }

    public MaxZoomResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The maximum zoom level found at the given LatLng.
     * 
     * @param value
     */
    public void setStatus(MaxZoomStatus status) {
        setStatus(status.getValue());
    }

    private native void setStatus(String value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.status = value;
    }-*/;

    public MaxZoomStatus getStatus() {
        return MaxZoomStatus.fromValue(_getStatus());
    }

    private native String _getStatus()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.status;
    }-*/;

    /**
     * The maximum zoom level found at the given LatLng.
     * 
     * @param value
     */
    public native void setZoom(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.zoom = value;
    }-*/;

    public native double getZoom()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.zoom;
    }-*/;

}
