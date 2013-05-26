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
import com.emitrom.pilot.maps.client.overlays.InfoWindow;
import com.emitrom.pilot.maps.client.overlays.options.MarkerOptions;
import com.emitrom.pilot.maps.client.overlays.options.PolylineOptions;
import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * This object defines the properties that can be set on a DirectionsRenderer
 * object.
 * 
 */
public class DirectionRendererOptions extends JsObject {

    public DirectionRendererOptions() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionRendererOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The directions to display on the map and/or in a <div> panel, retrieved
     * as a DirectionsResult object from DirectionsService.
     * 
     * @param value
     */
    public native void setDirections(DirectionsResult value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.directions = value.@com.pilot.shared.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * If true, allows the user to drag and modify the paths of routes rendered
     * by this DirectionsRenderer.
     * 
     * @param value
     */
    public native void setDraggable(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.draggable = value;
    }-*/;

    /**
     * This property indicates whether the renderer should provide UI to select
     * amongst alternative routes. By default, this flag is false and a
     * user-selectable list of routes will be shown in the directions'
     * associated panel. To hide that list, set hideRouteList to true.
     * 
     * @param value
     */
    public native void setHideRouteList(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.hideRouteList = value;
    }-*/;

    /**
     * The InfoWindow in which to render text information when a marker is
     * clicked. Existing info window content will be overwritten and its
     * position moved. If no info window is specified, the DirectionsRenderer
     * will create and use its own info window. This property will be ignored if
     * suppressInfoWindows is set to true.
     * 
     * @param value
     */
    public native void setInfoWindow(InfoWindow value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.infoWindow = value.@com.pilot.shared.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * Map on which to display the directions.
     * 
     * @param value
     */
    public native void setMap(GMap value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.map = value.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Options for the markers. All markers rendered by the DirectionsRenderer
     * will use these options.
     * 
     * @param value
     */
    public native void setMarkerOptions(MarkerOptions value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.markerOptions = value.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    /**
     * Options for the polylines. All polylines rendered by the
     * DirectionsRenderer will use these options.
     * 
     * @param value
     */
    public native void setPolylineOptions(PolylineOptions value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.polylineOptions = value.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    /**
     * By default, the input map is centered and zoomed to the bounding box of
     * this set of directions. If this option is set to true, the viewport is
     * left unchanged, unless the map's center and zoom were never set.
     * 
     * @param value
     */
    public native void setPreserveViewPort(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.preserveViewPort = value;
    }-*/;

    /**
     * The index of the route within the DirectionsResult object. The default
     * value is 0.
     * 
     * @param value
     */
    public native void setRouteIndex(int value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.routeIndex = value;
    }-*/;

    /**
     * Suppress the rendering of the AbstractLayer when bicycling directions are
     * requested.
     * 
     * @param value
     */
    public native void setSuppressBicyclingLayer(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.suppressBicyclingLayer = value;
    }-*/;

    /**
     * Suppress the rendering of info windows.
     * 
     * @param value
     */
    public native void setSuppressInfoWindows(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.suppressInfoWindows = value;
    }-*/;

    /**
     * Suppress the rendering of info markers.
     * 
     * @param value
     */
    public native void setSuppressMarker(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.suppressMarker = value;
    }-*/;

    /**
     * Suppress the rendering of info polylines.
     * 
     * @param value
     */
    public native void setSuppressPolylines(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.suppressPolylines = value;
    }-*/;

}
