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
import com.emitrom.pilot.maps.client.core.LatLngBounds;
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.overlays.options.RectangleOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A rectangle overlay
 * 
 */
public class Rectangle extends MVCObject {

    /**
     * Create a rectangle.
     * 
     * @return
     */
    public Rectangle() {
        jsObj = create();
    }

    /**
     * Create a rectangle with options
     * 
     * @return
     */
    public Rectangle(RectangleOptions options) {
        jsObj = create(options.getJsObj());
    }

    /**
     * Returns the bounds of this Circle.
     * 
     * @return
     */
    public final native LatLngBounds getBounds()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.emitrom.pilot.maps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native void setBounds(LatLngBounds value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.bounds = value.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Returns the map on which this poly is attached.
     * 
     * @return
     */
    public native GMap getMap()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.getMap();
		var toReturn = @com.emitrom.pilot.maps.client.GMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Renders this Polyline or Polygon on the specified map. If map is set to
     * null, the Poly will be removed.
     * 
     * @param value
     */
    public native void setMap(GMap value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso
				.setMap(value.@com.pilot.shared.client.JsObject::getJsObj()());
    }-*/;

    public native void setOptions(RectangleOptions value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso
				.options(value.@com.pilot.shared.client.JsObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject create()/*-{
		return $wnd.google.maps.Rectangle();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject options)/*-{
		return $wnd.google.maps.Rectangle(options);
    }-*/;

}
