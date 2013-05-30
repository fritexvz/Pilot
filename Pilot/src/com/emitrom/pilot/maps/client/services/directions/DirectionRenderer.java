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
package com.emitrom.pilot.maps.client.services.directions;

import com.emitrom.pilot.maps.client.GMap;
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Renders directions retrieved in the form of a
 * com.emitrom.pilot.maps.client.services.DirectionsResult object retrieved
 * from the com.emitrom.pilot.maps.client.services.DirectionsService.
 * 
 * 
 */
public class DirectionRenderer extends MVCObject {

    /**
     * Creates the renderer. Directions can be rendered on a map (as visual
     * overlays) or additionally on a <div> panel (as textual instructions).
     * 
     * @return
     */
    public DirectionRenderer() {
        jsObj = create();
    }

    /**
     * Creates the renderer with the given options. Directions can be rendered
     * on a map (as visual overlays) or additionally on a <div> panel (as
     * textual instructions).
     * 
     * @return
     */

    public DirectionRenderer(DirectionRendererOptions options) {
        jsObj = create(options.getJsObj());
    }

    /**
     * Returns the renderer's current set of directions.
     * 
     * @return
     */
    public native DirectionsResult getDirections()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getDirections();
		var toReturn = @com.emitrom.pilot.maps.client.services.directions.DirectionsResult::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns the map on which the DirectionsResult is rendered.
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
     * Returns the current (zero-based) route index in use by this
     * DirectionsRenderer object.
     * 
     * @return
     */
    public native int getRouteIndex()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.getRouteIndex();
    }-*/;

    /**
     * Set the renderer to use the result from the DirectionsService. Setting a
     * valid set of directions in this manner will display the directions on the
     * renderer's designated map and panel.
     * 
     * @param value
     */
    public native void setDirections(DirectionsResult value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		this
				.setDirections(value.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * This method specifies the map on which directions will be rendered. Pass
     * null to remove the directions from the map.
     * 
     * @param value
     */
    public native void setMap(GMap value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		this
				.setMap(value.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Change the options settings of this DirectionsRenderer after
     * initialization.
     * 
     * @param options
     */
    public native void setOptions(DirectionRendererOptions options)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		this
				.setOptions(options.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    public native void setRouteIndex(int value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.setRouteIndex(value);
    }-*/;

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.DirectionRenderer();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject options)/*-{
		return new $wnd.google.maps.DirectionRenderer(options);
    }-*/;

}
