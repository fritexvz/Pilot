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
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.geom.Size;

public class InfoWindowOptions extends AbstractOption {

    public InfoWindowOptions() {
        jsObj = JsoHelper.createObject();
    }

    public native String getContent() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.content;
    }-*/;

    /**
     * Content to display in the InfoWindow. This can be an HTML element, a
     * plain-text string, or a string containing HTML. The InfoWindow will be
     * sized according to the content. To set an explicit size for the content,
     * set content to be a HTML element with that size.
     * 
     * @param value
     */
    public native void setContent(String value) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.content = value;
    }-*/;

    /**
     * Disable auto-pan on open. By default, the info window will pan the map so
     * that it is fully visible when it opens.
     * 
     * @param value
     */
    public native void setDisableAutoPan(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.disableAutoPan = value;
    }-*/;

    public native boolean isDisableAutoPanEnabled()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.disableAutoPan;
    }-*/;

    /**
     * Maximum width of the infowindow, regardless of content's width. This
     * value is only considered if it is set before a call to open. To change
     * the maximum width when changing content, call close, setOptions, and then
     * open.
     * 
     * @param value
     */
    public native void setMaxWidth(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.maxWidth = value;
    }-*/;

    public native double getMaxWidth()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.maxWidth;
    }-*/;

    /**
     * The offset, in pixels, of the tip of the info window from the point on
     * the map at whose geographical coordinates the info window is anchored. If
     * an InfoWindow is opened with an anchor, the pixelOffset will be
     * calculated from the top-center of the anchor's bounds.
     * 
     * @param value
     */
    public native void setPixelOffset(Size value)/*-{
		this.pixelOffset = value;
    }-*/;

    public native Size getPixelOffset()/*-{
		return this.pixelOffset;
    }-*/;

    /**
     * The LatLng at which to display this InfoWindow. If the InfoWindow is
     * opened with an anchor, the anchor's position will be used instead.
     * 
     * @param value
     */
    public native void setPosition(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.position = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    public native LatLng getPosition()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.position;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * All InfoWindows are displayed on the map in order of their zIndex, with
     * higher values displaying in front of InfoWindows with lower values. By
     * default, InfoWinodws are displayed according to their latitude, with
     * InfoWindows of lower latitudes appearing in front of InfoWindows at
     * higher latitudes. InfoWindows are always displayed in front of markers
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
