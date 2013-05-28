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
package com.emitrom.pilot.maps.client.services.geocoder;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.LatLngBounds;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

/**
 * The specification for a geocoding request to be sent to the Geocoder.
 * 
 */
public class GeocoderRequest extends JsObject {

    public GeocoderRequest() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Address. Optional.
     * 
     * @param value
     */
    public native void setAddress(String value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.address = value;
    }-*/;

    public native String getAddress()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.address;
    }-*/;

    /**
     * LatLngBounds within which to search. Optional.
     * 
     * @return
     */
    public native LatLngBounds getBounds()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.emitrom.pilot.maps.client.core.LatLngBounds::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setBounds(LatLngBounds value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.bounds = value.@com.pilot.shared.client.core.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * LatLng about which to search. Optional.
     * 
     * @return
     */
    public native LatLng getLocation()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLocation(LatLng value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.location = value.@com.pilot.shared.client.core.JsObject::getJsObj()();
    }-*/;

    /**
     * Country code top-level domain within which to search. Optional.
     * 
     * @param value
     */
    public native void setRegion(String value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.region = value;
    }-*/;

    public native String getRegion()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.region;
    }-*/;

}
