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
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.overlays.options.InfoWindowOptions;
import com.emitrom.pilot.maps.client.streetview.StreetViewPanorama;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An overlay that looks like a bubble and is often connected to a marker. This
 * class extends com.emitrom.pilot.maps.client.core.MVCObject.
 * 
 */
public class InfoWindow extends MVCObject {

    /**
     * Creates an info window. An InfoWindow can be placed on a map at a
     * particular position or above a marker, depending on what is specified in
     * the options. Unless auto-pan is disabled, an InfoWindow will pan the map
     * to make itself visible when it is opened. After constructing an
     * InfoWindow, you must call open to display it on the map. The user can
     * click the close button on the InfoWindow to remove it from the map, or
     * the developer can call close() for the same effect.
     * 
     * @return
     */
    public InfoWindow() {
        jsObj = create();
    }

    /**
     * Creates an info window with the given options. An InfoWindow can be
     * placed on a map at a particular position or above a marker, depending on
     * what is specified in the options. Unless auto-pan is disabled, an
     * InfoWindow will pan the map to make itself visible when it is opened.
     * After constructing an InfoWindow, you must call open to display it on the
     * map. The user can click the close button on the InfoWindow to remove it
     * from the map, or the developer can call close() for the same effect.
     * 
     * @param options
     * @return
     */
    public InfoWindow(InfoWindowOptions options) {
        jsObj = create(options.getJsObj());
    }

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.InfoWindow();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject options)/*-{
		return new $wnd.google.maps.InfoWindow(options);
    }-*/;

    /**
     * 
     * @param value
     */
    public  native void setContent(String value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.setContent(value);
    }-*/;

    public  native String getContent()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.getContent();
    }-*/;

    public  native LatLng getPosition()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.getPosition();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public  native void setPosition(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.setPosition(value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    public  native double getZIndex()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.getZIndex();
    }-*/;

    public  native void setZIndex(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.setZIndex(value);
    }-*/;

    /**
     * Opens this InfoWindow on the given map. Optionally, an InfoWindow can be
     * associated with an anchor. In the core API, the only anchor is the Marker
     * class. However, an anchor can be any MVCObject that exposes the position
     * property and optionally anchorPoint for calculating the pixelOffset (see
     * InfoWindowOptions). The anchorPoint is the offset from the anchor's
     * position to the tip of the InfoWindow
     * 
     * @param map
     * @param anchor
     */
    public  native void open(GMap map, MVCObject anchor)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.open(
						map.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()(),
						anchor.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    public  native void open(GMap map)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.open(map.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    public  native void open(StreetViewPanorama view, MVCObject anchor)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.open(
						map.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()(),
						anchor.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    public  native void open(StreetViewPanorama view)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.open(map.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    public  native void setOptions(InfoWindowOptions options)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.setOptions(options.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;
    
    /**
     * Close the info window
     */
    public  native void close()/*-{
  		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
  		jso.close();
      }-*/;

}
