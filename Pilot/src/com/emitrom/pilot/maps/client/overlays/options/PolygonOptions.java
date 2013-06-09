/**
 Copyright (c) 2013 Emitrom LLC. All rights reserved.
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

import com.emitrom.pilot.core.shared.client.core.JsoHelper;

public class PolygonOptions extends AbstractOption {

    public PolygonOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Indicates whether this Polyline handles click events. Defaults to true.
     * 
     * @param value
     */
    public native void setClickable(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    public native boolean isClickable()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

    /**
     * Render each edge as a geodesic (a segment of a "great circle"). A
     * geodesic is the shortest path between two points along the surface of the
     * Earth
     * 
     * @param value
     */
    public native void setGeodesic(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.geodesic = value;
    }-*/;

    public native boolean getGeodesic()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.geodesic;
    }-*/;

    /**
     * The ordered sequence of coordinates of the Polyline. This path may be
     * specified using either a simple array of LatLngs, or an MVCArray of
     * LatLngs. Note that if you pass a simple array, it will be converted to an
     * MVCArray Inserting or removing LatLngs in the MVCArray will automatically
     * update the polyline on the map.
     * 
     * @param values
     */
    public native void setPath(Object values)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.path = values;
    }-*/;

    public native <T> T getPath()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.path;
    }-*/;

    /**
     * The stroke color. All CSS3 colors are supported except for extended named
     * colors.
     * 
     * @param value
     */
    public native void setStrokeColor(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.strokeColor = value;
    }-*/;

    public native String getStrokeColor()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.strokeColor;
    }-*/;

    /**
     * The stroke opacity between 0.0 and 1.0
     * 
     * @param value
     */
    public native void setStrokeOpacity(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.strokeOpacity = value;
    }-*/;

    public native double getStrokeOpacity()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.strokeOpacity;
    }-*/;

    /**
     * The stroke width in pixels.
     * 
     * @param value
     */
    public native void setStrokeWeight(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.strokeWeight = value;
    }-*/;

    public native double getStrokeWeight()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.strokeWeight;
    }-*/;

    /**
     * The zIndex compared to other polys.
     * 
     * @param value
     */
    public native void setZIndex(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    public native double getZIndex()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.zIndex;
    }-*/;

}
