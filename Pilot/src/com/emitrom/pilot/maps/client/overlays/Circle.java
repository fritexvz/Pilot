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
package com.emitrom.pilot.maps.client.overlays;

import com.emitrom.pilot.maps.client.GMap;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.LatLngBounds;
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.overlays.options.CircleOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A circle on the Earth's surface; also known as a "spherical cap".
 * 
 */
public class Circle extends MVCObject {

    /**
     * Create a circle
     * 
     * @return
     */
    public Circle() {
        jsObj = create();
    }

    /**
     * Create a circle using the passed CircleOptions, which specify the center,
     * radius, and style.
     * 
     * @return
     */
    public Circle(CircleOptions options) {
        jsObj = create(options.getJsObj());
    }

    private static native JavaScriptObject create()/*-{
		return $wnd.google.maps.Circle();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject options)/*-{
		return $wnd.google.maps.Circle(options);
    }-*/;

    /**
     * Returns the bounds of this Circle.
     * 
     * @return
     */
    public final native LatLngBounds getBounds()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.emitrom.pilot.maps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native void setBounds(LatLngBounds value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.bounds = value.@com.pilot.shared.client.core.JsObject::getJsObj()();
    }-*/;

    /**
     * Returns the map on which this rectangle is displayed.
     * 
     * @return
     */
    public final native GMap getMap()/*-{
		return this.getMap();
    }-*/;

    public final native void setMap(GMap map)/*-{
		this.setMap(map);
    }-*/;

    public final native void setOptions(CircleOptions value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.options = value.@com.pilot.shared.client.core.JsObject::getJsObj()();
    }-*/;

    /**
     * Returns the radius of this circle (in meters).
     * 
     * @param value
     */
    public final native void setRadius(double value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.setRadius(value);
    }-*/;

    public final native double getRadius()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.getRadius();
    }-*/;

    /**
     * Sets the center of this circle.
     * 
     * @param value
     */
    public final native void setCenter(LatLng value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso
				.setCenter(value.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    public final native LatLng getCenter()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getCenter();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
