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
import com.emitrom.pilot.maps.client.core.MVCArray;
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.overlays.options.PolylineOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 A polyline is a linear overlay of connected line segments on the map.
 */
public class Polyline extends MVCObject {

    /**
     * reate a polyline , which specify both the path of the polyline and the
     * stroke style to use when drawing the polyline. You may pass either an
     * array of LatLngs or an MVCArray of LatLngs when constructing a polyline,
     * though simple arrays are converted to MVCArrays within the polyline upon
     * instantiation.
     * 
     * @return
     */
    public Polyline() {
        jsObj = create();
    }

    /**
     * Create a polyline using the passed PolylineOptions, which specify both
     * the path of the polyline and the stroke style to use when drawing the
     * polyline. You may pass either an array of LatLngs or an MVCArray of
     * LatLngs when constructing a polyline, though simple arrays are converted
     * to MVCArrays within the polyline upon instantiation.
     * 
     * @param options
     * @return
     */
    public Polyline(PolylineOptions options) {
        jsObj = create(options.getJsObj());
    }

    /**
     * Returns the map on which this poly is attached.
     * 
     * @return
     */
    public native GMap getMap()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
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
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso
				.setMap(value.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Retrieves the first path.
     * 
     * @return
     */
    public native MVCArray getPath()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getPath();
		var toReturn = @com.emitrom.pilot.maps.client.core.MVCArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public final native void setOptions(PolylineOptions options)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso
				.setOptions(options.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the first path. See
     * com.emitrom.pilot.maps.client.overlays.PolylineOptions for more
     * details.
     * 
     * @param values
     */
    /**
     * Sets the first path. See
     * com.emitrom.pilot.maps.client.overlays.PolylineOptions for more
     * details.
     * 
     * @param options
     */
    public native void setPath(MVCArray value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso
				.setPath(value.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject create() /*-{
		return new $wnd.google.maps.Polyline();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject options) /*-{
		return new $wnd.google.maps.Polyline(options);
    }-*/;

}
