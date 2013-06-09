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
package com.emitrom.pilot.maps.client.events;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.geom.Size;
import com.emitrom.pilot.maps.client.layers.kml.KmlFeatureData;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The properties of a click event on a KML/KMZ or GeoRSS document.
 */
public class KmlMouseEvent extends JavaScriptObject {

    protected KmlMouseEvent() {

    }

    /**
     * A KmlFeatureData object, containing information about the clicked
     * feature.
     * 
     * @return
     */
    public final native KmlFeatureData getFeatureData()/*-{
		return this.featureData;
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

}
