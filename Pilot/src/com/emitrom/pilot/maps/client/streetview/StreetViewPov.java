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
package com.emitrom.pilot.maps.client.streetview;

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A point of view object which specifies the camera's orientation at the Street
 * View panorama's position. The point of view is defined as heading, pitch and
 * zoom.
 * 
 */
public class StreetViewPov extends JsObject {

    public StreetViewPov() {
        jsObj = JsoHelper.createObject();
    }

    public StreetViewPov(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The camera heading in degrees relative to true north. True north is 0,
     * east is 90, south is 180, west is 270.
     * 
     * @param value
     */
    public native void setHeading(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.heading = value;
    }-*/;

    public native double getHeading()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return this.heading;
    }-*/;

    /**
     * The camera pitch in degrees, relative to the street view vehicle. Ranges
     * from 90 (directly upwards) to -90 (directly downwards).
     * 
     * @param value
     */
    public native void setPitch(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.pitch = value;
    }-*/;

    public native double getPitch()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.pitch;
    }-*/;

    /**
     * The zoom level. Fully zoomed-out is level 0, zooming in increases the
     * zoom level.
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
