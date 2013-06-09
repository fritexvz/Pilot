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
package com.emitrom.pilot.maps.client.services.directions;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.Distance;
import com.emitrom.pilot.maps.client.core.Duration;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import java.util.ArrayList;

/**
 * A single leg consisting of a set of steps in a DirectionsResult. Some fields
 * in the leg may not be returned for all requests. (This object was formerly
 * known as "DirectionsRoute".) Note that though this result is "JSON-like," it
 * is not strictly JSON, as it directly and indirectly includes LatLng objects
 * 
 * 
 */
public class DirectionsLeg extends JsObject {

    public DirectionsLeg() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionsLeg(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The total distance covered by this leg. This property may be undefined as
     * the distance may be unknown.
     * 
     * @param value
     */
    public native void setDistance(Distance value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.distance = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    public native Distance getDistance()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.distance;
		var toReturn = @com.emitrom.pilot.maps.client.core.Distance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The total duration of this leg. This property may be undefined as the
     * duration may be unknown.
     * 
     * @param value
     */
    public native void setDuration(Duration value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		this.duration = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    public native Duration getDuration()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.duration;
		var toReturn = @com.emitrom.pilot.maps.client.core.Duration::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The address of the destination of this leg.
     * 
     * @param value
     */
    public native void setEndAddress(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.end_address = value;
    }-*/;

    public native String getEndAddress()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.end_address;
    }-*/;

    /**
     * The DirectionsService calculates directions between locations by using
     * the nearest transportation option (usually a road) at the start and end
     * locations. end_location indicates the actual geocoded destination, which
     * may be different than the end_location of the last step if, for example,
     * the road is not near the destination of this leg.
     * 
     * @param value
     */
    public native void setEndLocation(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.end_location = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		;
    }-*/;

    public native LatLng getEndLocation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.end_location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The address of the origin of this leg.
     * 
     * @param value
     */
    public native void setStartAddress(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.start_address = value;
    }-*/;

    public native String getStartAddress()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.start_address;
    }-*/;

    /**
     * The DirectionsService calculates directions between locations by using
     * the nearest transportation option (usually a road) at the start and end
     * locations. start_location indicates the actual geocoded origin, which may
     * be different than the start_location of the first step if, for example,
     * the road is not near the origin of this leg.
     * 
     * @param value
     */
    public native void setStartLocation(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.start_location = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		;
    }-*/;

    public native LatLng getStartLocation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.start_location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * An array of DirectionsSteps, each of which contains information about the
     * individual steps in this leg.
     * 
     * @param steps
     */
    public void setSteps(ArrayList<DirectionsStep> steps) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsStep step : steps) {
            values.push(step.getJsObj());
        }
        _setSteps(values);
    }

    public void setSteps(DirectionsStep... steps) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DirectionsStep step : steps) {
            values.push(step.getJsObj());
        }
        _setSteps(values);
    }

    private native void _setSteps(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.steps = values;
    }-*/;

    public ArrayList<DirectionsStep> getSteps() {
        ArrayList<DirectionsStep> steps = new ArrayList<DirectionsStep>();
        JsArray<JavaScriptObject> array = _getSteps();
        for (int i = 0; i < array.length(); i++) {
            steps.add(new DirectionsStep(array.get(i)));
        }
        return steps;
    }

    private native JsArray<JavaScriptObject> _getSteps()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.steps;
    }-*/;

    /**
     * An array of waypoints along this leg that were not specified in the
     * original request, either as a result of a user dragging the polyline or
     * selecting an alternate route.
     * 
     * @param points
     */
    public void setViaWayPoints(ArrayList<LatLng> points) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : points) {
            values.push(latLgn.getJsObj());
        }
        _setViaWaypoints(values);
    }

    public void setViaWayPoints(LatLng... points) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLgn : points) {
            values.push(latLgn.getJsObj());
        }
        _setViaWaypoints(values);
    }

    private native void _setViaWaypoints(JsArray<JavaScriptObject> values)/*-{
		this.via_waypoints = values;
    }-*/;

    public ArrayList<LatLng> getViaPoints() {
        ArrayList<LatLng> points = new ArrayList<LatLng>();
        JsArray<JavaScriptObject> array = _getViaWayPpoints();
        for (int i = 0; i < array.length(); i++) {
            points.add(new LatLng(array.get(i)));
        }
        return points;
    }

    public native JsArray<JavaScriptObject> _getViaWayPpoints()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.via_waypoints;
    }-*/;

}
