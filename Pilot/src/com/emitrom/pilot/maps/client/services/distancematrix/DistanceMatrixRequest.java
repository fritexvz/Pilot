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
package com.emitrom.pilot.maps.client.services.distancematrix;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.services.TravelMode;
import com.emitrom.pilot.maps.client.services.UnitSystem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

import java.util.ArrayList;

/**
 * A distance matrix query sent by the DistanceMatrixService containing arrays
 * of origin and destination locations, and various options for computing
 * metrics.
 * 
 */
public class DistanceMatrixRequest extends JsObject {

    public DistanceMatrixRequest() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * If true, instructs the Distance Matrix service to avoid highways where
     * possible. Optional.
     * 
     * @param value
     */
    public native void setAvoidHighways(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.avoidHighways = value;
    }-*/;

    public native boolean isAvoidHighways()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.avoidHighways;
    }-*/;

    /**
     * If true, instructs the Distance Matrix service to avoid toll roads where
     * possible. Optional.
     * 
     * @param value
     */
    public native void setAvoidTolls(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.avoidTolls = value;
    }-*/;

    public native boolean isAvoidTolls()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.avoidTolls;
    }-*/;

    /**
     * An array containing destination address strings and/or LatLngs, to which
     * to calculate distance and time. Required.
     * 
     * @param destinations
     */
    public void setDestinationsAsString(ArrayList<String> destinations) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : destinations) {
            values.push(s);
        }
        _setDestinations(values);
    }

    public void setDestination(String... destinations) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : destinations) {
            values.push(s);
        }
        _setDestinations(values);
    }

    private native void _setDestinations(JsArrayString values)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.destinations = values;
    }-*/;

    /**
     * An array containing destination address strings and/or LatLngs, to which
     * to calculate distance and time. Required.
     * 
     * @param destinations
     */
    public void setDestinations(ArrayList<LatLng> destinations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : destinations) {
            values.push(latLgn.getJsObj());
        }
        _setDestinations(values);
    }

    public void setDestinations(LatLng... destinations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : destinations) {
            values.push(latLgn.getJsObj());
        }
        _setDestinations(values);
    }

    private native void _setDestinations(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.destinations = values;
    }-*/;

    public native JsArrayString getDestinations()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.destinations;
    }-*/;

    /**
     * An array containing origin address strings and/or LatLngs, from which to
     * calculate distance and time. Required.
     * 
     * @param destinations
     */

    public void setOriginsAsString(ArrayList<String> destinations) {
        JsArrayString values = JsArrayString.createArray().cast();
        for (String s : destinations) {
            values.push(s);
        }
        _setDestinations(values);
    }

    public native void _setOrigins(JsArrayString value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.origins = value;
    }-*/;

    /**
     * An array containing origin address strings and/or LatLngs, from which to
     * calculate distance and time. Required.
     * 
     * @param origin
     */
    public void setOrigins(ArrayList<LatLng> origin) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : origin) {
            values.push(latLgn.getJsObj());
        }
        _setOrigins(values);
    }

    public void setOrigins(LatLng... destinations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : destinations) {
            values.push(latLgn.getJsObj());
        }
        _setOrigins(values);
    }

    private native void _setOrigins(JsArray<JavaScriptObject> value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.origins = value;
    }-*/;

    public native JsArrayString getOriginsAsStringArray()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return this.origins;
    }-*/;

    /**
     * Region code used as a bias for geocoding requests. Optional.
     * 
     * @param value
     */
    public native void setRegion(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.region = value;
    }-*/;

    public native String getRegion()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.region;
    }-*/;

    /**
     * AnimationType of routing requested. Required.
     * 
     * @param mode
     */
    public void setTravelMode(TravelMode mode) {
        setTravelMode(mode.getValue());
    }

    private native void setTravelMode(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.travelMode = value;
    }-*/;

    public TravelMode getTravelMode() {
        return TravelMode.fromValue(_getTravelMode());
    }

    private native String _getTravelMode()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.travelMode;
    }-*/;

    /**
     * Preferred unit system to use when displaying distance. Optional; defaults
     * to metric.
     * 
     * @param system
     */

    public void setUnitSystem(UnitSystem system) {
        setUnitSystem(system.getValue());
    }

    private native void setUnitSystem(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.unitSystem = value;
    }-*/;

    public UnitSystem getUnitSystem() {
        return UnitSystem.fromValue(_getUnitSystem());
    }

    private native String _getUnitSystem()/*-{
		return this.unitSystem;
    }-*/;

}
