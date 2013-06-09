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
package com.emitrom.pilot.maps.client.maptypes;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.geom.Size;

/**
 * This class is used to create a MapType that renders image tiles
 * 
 */
public class ImageMapTypeOptions extends JsObject {

    public ImageMapTypeOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Alt text to display when this MapType's button is hovered over in the
     * MapTypeControl.
     * 
     * @param value
     */
    public native void setAlt(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.alt = value;
    }-*/;

    public native String getAlt()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.alt;
    }-*/;

    /**
     * Returns a string (URL) for given tile coordinate (x, y) and zoom level.
     * 
     * @param func
     * @return
     */
    public native String getTitleUrl(ImageTypeFunction func)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getTitleUrl = function(coord, zoom) {
			func.@com.emitrom.pilot.maps.client.maptypes.ImageTypeFunction::execute(Lcom/emitrom/pilot/maps/client/geom/Point;D)(coord, zoom);
		};
    }-*/;

    /**
     * The maximum zoom level for the map when displaying this MapType.
     * 
     * @param value
     */
    public native void setMaxZoom(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.maxZoom = value;
    }-*/;

    public native double getMaxZoom()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.maxZoom;
    }-*/;

    /**
     * The minimum zoom level for the map when displaying this MapType.
     * Optional.
     * 
     * @param value
     */
    public native void setMinZoom(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.minZoom = value;
    }-*/;

    public native double getMinZoom()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.minZoom;
    }-*/;

    /**
     * Name to display in the MapTypeControl.
     * 
     * @param value
     */
    public native void setName(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.name = value;
    }-*/;

    public native String getName()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * The opacity to apply to the tiles. The opacity should be specified as a
     * float value between 0 and 1.0, where 0 is fully transparent and 1 is
     * fully opaque.
     * 
     * @param value
     */
    public native void setOpacity(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.opacity = value;
    }-*/;

    public native double getOpacity()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.opacity;
    }-*/;

    /**
     * The tile size.
     * 
     * @return
     */
    public native Size getTileSize()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.titleSize;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return this.tileSize;
    }-*/;

    public native void setTileSize(Size value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		this.tileSize = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

}
