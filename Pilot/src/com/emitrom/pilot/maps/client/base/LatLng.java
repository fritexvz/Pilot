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
package com.emitrom.pilot.maps.client.base;

import com.emitrom.pilot.util.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class LatLng extends JsObject {

    /**
     * Notice the ordering of latitude and longitude. The latitude will be
     * clamped to lie between -90 degrees and +90 degrees, and longitude will be
     * wrapped to lie between -180 degrees and +180 degrees.
     * 
     * @param lat
     * @param ln
     * @return
     */
    public LatLng(double lat, double lng) {
        jsObj = create(lat, lng);
    }

    /**
     * Notice the ordering of latitude and longitude. If the noWrap flag is
     * true, then the numbers will be used as passed, otherwise latitude will be
     * clamped to lie between -90 degrees and +90 degrees, and longitude will be
     * wrapped to lie between -180 degrees and +180 degrees.
     * 
     * @param lat
     * @param ln
     * @return
     */

    public LatLng(double lat, double lng, boolean noWrap) {
        jsObj = create(lat, lng, noWrap);
    }

    public LatLng(JavaScriptObject jso) {
        super(jso);
    }

    public static LatLng instance(JavaScriptObject jso) {
        return new LatLng(jso);
    }

    /**
     * Returns the latitude in degrees.
     * 
     * @return
     */
    public native double getLat()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.lat();
    }-*/;

    /**
     * Returns the longitude in degrees.
     * 
     * @return
     */
    public native double getLng()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.lng();
    }-*/;

    /**
     * Comparison function.
     * 
     * @param other
     * @return
     */
    public final native boolean isEqualTo(LatLng other) /*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.equals(other.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns a string of the form "lat,lng" for this LatLng. We round the
     * lat/lng values to 6 decimal places by default.
     * 
     * @return
     */
    public final native String toUrlValue() /*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.toUrlValue();
    }-*/;

    /**
     * Returns a string of the form "lat,lng" for this LatLng. We round the
     * lat/lng values to 6 decimal places by default.
     * 
     * @param precision
     * @return
     */
    public final native String toUrlValue(double precision) /*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.toUrlValue(precision);
    }-*/;

    /**
     * Converts to string representation.
     * 
     * @return
     */
    public final native String toStringValue()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.toString();
    }-*/;

    private native JavaScriptObject create(double lat, double lng)/*-{
		return new $wnd.google.maps.LatLng(lat, lng);
    }-*/;

    private native JavaScriptObject create(double lat, double lng, boolean noWrap)/*-{
		return new $wnd.google.maps.LatLng(lat, lng, noWrap);
    }-*/;
}
