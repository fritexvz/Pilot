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

import com.emitrom.pilot.maps.client.services.TravelMode;
import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.core.JsObject;

public class DirectionsOptions extends JsObject {

    public static int TRAVEL_MODE_DRIVING = getConstant("TRAVEL_MODE_DRIVING");
    public static int TRAVEL_MODE_WALKING = getConstant("TRAVEL_MODE_WALKING");

    public DirectionsOptions() {
        jsObj = create();
    }

    public DirectionsOptions(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean avoidHighways() /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.avoidHighways;
    }-*/;

    public native void setAvoidHighways(boolean value) /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.avoidHighways = value;
    }-*/;

    public native String getCountryCode() /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.countryCode;
    }-*/;

    public native void setCountryCode(String value) /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.coutryCode = value;
    }-*/;

    public native String getLanguage() /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.language;
    }-*/;

    public native void setLanguage(String value) /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.language = value;
    }-*/;

    public TravelMode getTravelMode() {
        return TravelMode.fromValue(_getTravelMode());
    }

    private native String _getTravelMode() /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.travelMode;
    }-*/;

    public void setTravelMode(TravelMode mode) {
        _setTravelMode(mode.getValue());
    }

    private native void _setTravelMode(String value) /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.travelMode = value;
    }-*/;

    private static native int getConstant(String name) /*-{
		return $wnd.google.maps.services.DirectionsOptions[name];
    }-*/;

    private static native JavaScriptObject create() /*-{
		return new $wnd.google.maps.services.DirectionsOptions();
    }-*/;

}
