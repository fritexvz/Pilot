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
import com.emitrom.pilot.maps.client.overlays.options.PolygonOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A polygon (like a polyline) defines a series of connected coordinates in an
 * ordered sequence; additionally, polygons form a closed loop and define a
 * filled region.
 * 
 */
public class Polygon extends MVCObject {

    /**
     * Create a polygon. A polygon may contain one or more paths, where each
     * path consists of an array of LatLngs. You may pass either an array of
     * LatLngs or an MVCArray of LatLngs when constructing these paths. Arrays
     * are converted to MVCArrays within the polygon upon instantiation.
     * 
     * @return
     */
    public Polygon() {
        jsObj = create();
    }

    /**
     * Create a polygon using the passed PolygonOptions, which specify the
     * polygon's path, the stroke style for the polygon's edges, and the fill
     * style for the polygon's interior regions. A polygon may contain one or
     * more paths, where each path consists of an array of LatLngs. You may pass
     * either an array of LatLngs or an MVCArray of LatLngs when constructing
     * these paths. Arrays are converted to MVCArrays within the polygon upon
     * instantiation.
     * 
     * @param options
     * @return
     */
    public Polygon(PolygonOptions options) {
        jsObj = create(options.getJsObj());
    }

    /**
     * Returns the map on which this poly is attached.
     * 
     * @return
     */
    public native GMap getMap()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
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
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.setMap(value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Retrieves the first path.
     * 
     * @return
     */
    public native MVCArray getPath()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.getPath();
		var toReturn = @com.emitrom.pilot.maps.client.core.MVCArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Retrieves the paths.
     * 
     * @return, an array of arrays
     */
    public native MVCArray getPaths()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.getPaths();
		var toReturn = @com.emitrom.pilot.maps.client.core.MVCArray::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * 
     * @param options
     */
    public native void setOptions(PolygonOptions options)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		this
				.setOptions(options.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the first path. See
     * com.emitrom.pilot.maps.client.overlays.PolylineOptions for more
     * details.
     * 
     * @param options
     */
    public native void setPath(MVCArray value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.setPath(value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the path for this Polygon.
     * 
     * @param options
     */
    public native void setPaths(MVCArray value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.setPaths(value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    private static native JavaScriptObject create() /*-{
		return new $wnd.google.maps.Polygon();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject options) /*-{
		return new $wnd.google.maps.Polygon(options);
    }-*/;

}
