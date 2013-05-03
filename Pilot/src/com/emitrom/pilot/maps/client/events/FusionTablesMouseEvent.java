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
package com.emitrom.pilot.maps.client.events;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.geom.Size;
import com.emitrom.pilot.maps.client.layers.fusiontables.FusionTablesCell;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class FusionTablesMouseEvent extends JavaScriptObject {

    protected FusionTablesMouseEvent() {

    }

    /**
     * Pre-rendered HTML content, as placed in the infowindow by the default UI.
     * 
     * @return
     */
    public final native String getInfoWindowHtml()/*-{
		return this.infoWindowHtml;
    }-*/;

    /**
     * The position at which to anchor an infowindow on the clicked feature.
     * 
     * @return
     */
    public final native LatLng getLatLgn()/*-{
		var jso = this.latLng;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jso);
		return toReturn;
    }-*/;

    /**
     * The offset to apply to an infowindow anchored on the clicked feature.
     * 
     * @return
     */
    public final native Size getPixelOffset()/*-{
		var jso = this.pixelOffset;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jso);
		return toReturn;
    }-*/;

    /**
     * A collection of FusionTablesCell objects, indexed by column name,
     * representing the contents of the table row which included the clicked
     * feature.
     * 
     * @return
     */
    public final native JsArray<FusionTablesCell> getRow()/*-{
		return this.row;
    }-*/;

}
