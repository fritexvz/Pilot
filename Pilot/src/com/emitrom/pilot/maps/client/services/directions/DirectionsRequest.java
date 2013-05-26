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

import java.util.ArrayList;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.services.TravelMode;
import com.emitrom.pilot.maps.client.services.UnitSystem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * A directions query to be sent to the DirectionsService.
 * 
 */
public class DirectionsRequest extends JsObject {

    public DirectionsRequest() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * If true, instructs the Directions service to avoid highways where
     * possible. Optional.
     * 
     * @param value
     */
    public native void setAvoidHighways(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.avoidHighways = value;
    }-*/;

    public native boolean isAvoidHighways()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.avoidHighways;
    }-*/;

    /**
     * If true, instructs the Directions service to avoid toll roads where
     * possible. Optional.
     * 
     * @param value
     */
    public native void setAvoidTolls(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.avoidTolls = value;
    }-*/;

    public native boolean isAvoidTolls()/*-{
		return this.avoidTolls;
    }-*/;

    /**
     * Location of destination. Required.
     * 
     * @param value
     */
    public native void setDestination(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.destination = value;
    }-*/;

    /**
     * Location of destination.Required.
     * 
     * @param value
     */
    public native void setDestination(LatLng value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.destination = value.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native LatLng getDestination()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.destination;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Whether or not route alternatives should be provided. Optional.
     * 
     * @param value
     */
    public native void setProvideRouteAlternatives(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.provideRouteAlternatives = value;
    }-*/;

    public native boolean providesRouteAlternatives()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.provideRouteAlternatives;
    }-*/;

    /**
     * If set to true, the DirectionService will attempt to re-order the
     * supplied intermediate waypoints to minimize overall cost of the route. If
     * waypoints are optimized, inspect DirectionsRoute.getWaypointOrder() in
     * the response to determine the new ordering.
     * 
     * @param value
     */
    public native void setOptimizeWaypoints(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.optimizeWaypoints = value;
    }-*/;

    public native boolean optimizeWaypoints()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.optimizeWaypoints;
    }-*/;

    /**
     * Origin of destination. Required.
     * 
     * @param value
     */
    public native void setOrigin(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.origin = value;
    }-*/;

    /**
     * Location of destination.Required.
     * 
     * @param value
     */
    public native void setOrigin(LatLng value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.origin = value.@com.pilot.shared.client.JsObject::getJsObj()();
		;
    }-*/;

    public native LatLng getOrigin()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.origin;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Region code used as a bias for geocoding requests. Optional.
     * 
     * @param value
     */
    public native void setRegion(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.region = value;
    }-*/;

    public native String getRegion()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.region;
    }-*/;

    /**
     * AnimationType of routing requested. Required.
     * 
     * @param value
     */
    public void setTravelMode(TravelMode mode) {
        setTravelMode(mode.getValue());
    }

    private native void setTravelMode(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.travelMode = value;
    }-*/;

    public TravelMode getTravelMode() {
        return TravelMode.fromValue(_getTravelMode());
    }

    private native String _getTravelMode()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.travelMode;
    }-*/;

    /**
     * Preferred unit system to use when displaying distance. Defaults to the
     * unit system used in the country of origin.
     * 
     * @param value
     */

    public void setUnitSystem(UnitSystem system) {
        setUnitSystem(system.getValue());
    }

    private native void setUnitSystem(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.unitSystem = value;
    }-*/;

    public UnitSystem getUnitSystem() {
        return UnitSystem.fromValue(_getUnitSystem());
    }

    private native String _getUnitSystem()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.unitSystem;
    }-*/;

    /**
     * Array of intermediate waypoints. Directions will be calculated from the
     * origin to the destination by way of each waypoint in this array.
     * Optional.
     * 
     * @param values
     */
    public void setWayPoints(ArrayList<DirectionsWaypoints> wayPoints) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsWaypoints wayPoint : wayPoints) {
            values.push(wayPoint.getJsObj());
        }
        _setWayPoints(values);
    }

    public void setWayPoints(DirectionsWaypoints... wayPoints) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsWaypoints wayPoint : wayPoints) {
            values.push(wayPoint.getJsObj());
        }
        _setWayPoints(values);
    }

    private native void _setWayPoints(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.wayPoints = values;
    }-*/;

    public ArrayList<DirectionsWaypoints> getWayPoints() {
        ArrayList<DirectionsWaypoints> result = new ArrayList<DirectionsWaypoints>();
        JsArray<JavaScriptObject> values = _getWayPoints();
        for (int i = 0; i < values.length(); i++) {
            result.add(new DirectionsWaypoints(values.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getWayPoints()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.wayPoints;
    }-*/;

}
