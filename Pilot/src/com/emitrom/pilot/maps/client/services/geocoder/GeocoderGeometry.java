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
package com.emitrom.pilot.maps.client.services.geocoder;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.LatLngBounds;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Geometry information about this GeocoderResult
 * 
 */
public class GeocoderGeometry extends JsObject {

    public GeocoderGeometry() {
        jsObj = JsoHelper.createObject();
    }

    public GeocoderGeometry(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The precise bounds of this GeocodeResult, if applicable
     * 
     * @return
     */
    public native LatLngBounds getBounds()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.emitrom.pilot.maps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The latitude/longitude coordinates of this result
     * 
     * @return
     */
    public native LatLng getLocation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The type of location returned in location
     * 
     * @return
     */
    public GeocoderLocationType getLocationType() {
        return GeocoderLocationType.fromValue(_getLocationType());
    }

    private native String _getLocationType()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.location_type;
    }-*/;

    /**
     * The bounds of the recommended viewport for displaying this GeocodeResult
     * 
     * @return
     */
    public native LatLngBounds getViewport()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.viewport;
		var toReturn = @com.emitrom.pilot.maps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
