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
package com.emitrom.pilot.maps.client.streetview;

import com.emitrom.pilot.maps.client.geom.Size;
import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class StreetViewTileData extends JsObject {

    public StreetViewTileData() {
        jsObj = JsoHelper.createObject();
    }

    public StreetViewTileData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the tile image URL for the specified tile. pano is the panorama ID
     * of the Street View tile. tileZoom is the zoom level of the tile. tileX is
     * the x-coordinate of the tile. tileY is the y-coordinate of the tile.
     * Returns the URL for the tile image.
     * 
     * @param pano
     * @param tileZoom
     * @param tileX
     * @param tileY
     * @return
     */
    public final native String getTileUrl(String pano, double tileZoom, double tileX, double tileY)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.getTileUrl(pano, tileZoom, tileX, tileY);
    }-*/;

    /**
     * The heading (in degrees) at the center of the panoramic tiles.
     * 
     * @param value
     */
    public final native void setCenterHeading(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.centerHeading = value;
    }-*/;

    public final native double getCenterHeading()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.centerHeading;
    }-*/;

    /**
     * The size (in pixels) at which tiles will be rendered. This may not be the
     * native tile image size.
     * 
     * @param value
     */
    public final native void setTileSize(Size value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		this.tileSize = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		;
    }-*/;

    public final native Size getTileSize()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.titleSize;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The size (in pixels) of the whole panorama's "world".
     * 
     * @param value
     */
    public final native void setWorldSize(Size value)/*-{
		this.worldSize = value;
    }-*/;

    public final native Size getWorldSize()/*-{
		return this.worldSize;
    }-*/;

}
