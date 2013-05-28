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
package com.emitrom.pilot.maps.client.overlays.options;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.core.JsoHelper;

public class CircleOptions extends AbstractOption {

    public CircleOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Returns the center.
     * 
     * @return
     */
    public native LatLng getCenter()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.center;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public void setCenter(LatLng value) {
        setCenter(value.getJsObj());
    }

    /**
     * Indicates whether this circle handles click events. Defaults to true.
     * 
     * @param value
     */
    public native void setClickable(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    public native boolean isClickable()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

    /**
     * The fill color. All CSS3 colors are supported except for extended named
     * colors.
     * 
     * @param value
     */
    public native void setFillColor(String value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.fillColor = value;
    }-*/;

    public native String getFillColor()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.fillColor;
    }-*/;

    /**
     * The fill opacity between 0.0 and 1.0
     * 
     * @param value
     */
    public native void setFillOpacitiy(double value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.fillOpacitiy = value;
    }-*/;

    public native double getFillOpacitiy()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.fillOpacitiy;
    }-*/;

    /**
     * The radius in meters on the Earth's surface
     */
    public native void setRadius(double value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.radius = value;
    }-*/;

    public native double getRadius()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.radius;
    }-*/;

    /**
     * The stroke color. All CSS3 colors are supported except for extended named
     * colors.
     * 
     * @param value
     */
    public native void setStrokeColor(String value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.strokeColor = value;
    }-*/;

    public native String getStrokeColor()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.strokeColor;
    }-*/;

    /**
     * The stroke opacity between 0.0 and 1.0
     * 
     * @param value
     */
    public native void setStrokeOpacity(double value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.strokeOpacity = value;
    }-*/;

    public native double getStrokeOpacity()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.strokeOpacity;
    }-*/;

    /**
     * The stroke width in pixels.
     * 
     * @param value
     */
    public native void setStrokeWeight(double value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.strokeWeight = value;
    }-*/;

    public native double getStrokeWeight()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.strokeWeight;
    }-*/;

    /**
     * The zIndex compared to other polys.
     * 
     * @param value
     */
    public native void setZIndex(double value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    public native double getZIndex()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.zIndex;
    }-*/;

    private native void setCenter(JavaScriptObject value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.center = value;
    }-*/;
}
