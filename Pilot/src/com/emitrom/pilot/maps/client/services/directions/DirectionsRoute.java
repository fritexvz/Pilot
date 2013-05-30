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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

/**
 * A single route containing a set of legs in a DirectionsResult. (This object
 * was formerly known as "DirectionsTrip".) Note that though this object is
 * "JSON-like," it is not strictly JSON, as it directly and indirectly includes
 * LatLng objects.
 * 
 */
public class DirectionsRoute extends JsObject {

    public DirectionsRoute() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionsRoute(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The bounds for this route.
     * 
     * @param value
     */
    public native void setBounds(LatLng value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		this.bounds = value.@com.pilot.shared.client.core.JsObject::getJsObj()();
		;
    }-*/;

    public native LatLng getBounds()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.bounds;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Copyrights text to be displayed for this route.
     * 
     * @param value
     */
    public native void setCopyrights(String value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.copyrights = value;
    }-*/;

    public native String getCopyrights()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.copyrights;
    }-*/;

    /**
     * An array of DirectionsLegs, each of which contains information about the
     * steps of which it is composed. There will be one leg for each waypoint or
     * destination specified. So a route with no waypoints will contain one
     * DirectionsLeg and a route with one waypoint will contain two. (This
     * property was formerly known as "routes".)
     * 
     * @param values
     */
    public void setLegs(ArrayList<DirectionsLeg> legs) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsLeg leg : legs) {
            values.push(leg.getJsObj());
        }
        _setLegs(values);
    }

    public void setLegs(DirectionsLeg... legs) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsLeg leg : legs) {
            values.push(leg.getJsObj());
        }
        _setLegs(values);
    }

    private native void _setLegs(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.legs = values;
    }-*/;

    public ArrayList<DirectionsLeg> getLegs() {
        ArrayList<DirectionsLeg> legs = new ArrayList<DirectionsLeg>();
        JsArray<JavaScriptObject> array = _getOverviewPath();
        for (int i = 0; i < array.length(); i++) {
            legs.add(new DirectionsLeg(array.get(i)));
        }
        return legs;
    }

    private native JsArray<JavaScriptObject> _getLegs()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.legs;
    }-*/;

    /**
     * An array of LatLngs representing the entire course of this route. The
     * path is simplified in order to make it suitable in contexts where a small
     * number of vertices is required (such as Static Maps API URLs).
     * 
     * @param values
     */
    public void setOverviewPath(ArrayList<LatLng> points) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : points) {
            values.push(latLgn.getJsObj());
        }
        _setOverviewPath(values);
    }

    public void setOverviewPath(LatLng... points) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : points) {
            values.push(latLgn.getJsObj());
        }
        _setOverviewPath(values);
    }

    public ArrayList<LatLng> getOverviewPath() {
        ArrayList<LatLng> points = new ArrayList<LatLng>();
        JsArray<JavaScriptObject> array = _getOverviewPath();
        for (int i = 0; i < array.length(); i++) {
            points.add(new LatLng(array.get(i)));
        }
        return points;
    }

    private native void _setOverviewPath(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.overview_path = values;
    }-*/;

    private native JsArray<JavaScriptObject> _getOverviewPath()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.overview_path;
    }-*/;

    /**
     * Warnings to be displayed when showing these directions.
     * 
     * @param values
     */
    public void setWarnings(String[] warnings) {
        JsArrayString strings = JsArrayString.createArray().cast();
        for (String s : warnings) {
            strings.push(s);
        }
        _setWarnings(strings);
    }

    private native void _setWarnings(JsArrayString values)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.warnings = values;
    }-*/;

    public String[] getWarnins() {
        JsArrayString values = _getWarnings();
        String[] warnings = new String[values.length()];
        for (int i = 0; i < values.length(); i++) {
            warnings[i] = values.get(i);
        }
        return warnings;
    }

    private native JsArrayString _getWarnings()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.warnings;
    }-*/;

    /**
     * If optimizeWaypoints was set to true, this field will contain the
     * re-ordered permutation of the input waypoints. For example, if the input
     * was: <br/>
     * Origin: Los Angeles Waypoints: Dallas, Bangor, Phoenix <br/>
     * Destination: New York <br/>
     * and the optimized output was ordered as follows: <br/>
     * Origin: Los Angeles <br/>
     * Waypoints: Phoenix, Dallas, Bangor <br/>
     * Destination: New York <br/>
     * then this field will be an Array containing the values [2, 0, 1]. Note
     * that the numbering of waypoints is zero-based. If any of the input
     * waypoints has stopover set to false, this field will be empty, since
     * route optimization is not available for such queries.
     * 
     * @param values
     */
    public native void setWaypointOrder(JsArrayNumber values)/*-{
		this.waypoint_order = values;
    }-*/;

    public native JsArrayNumber getWaypointOrder()/*-{
		return this.waypoint_order;
    }-*/;

}
