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

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A DirectionsWaypoint represents a location between origin and destination
 * through which the trip should be routed
 * 
 * @author Ekambi
 * 
 */
public class DirectionsWaypoints extends JsObject {

    public DirectionsWaypoints() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionsWaypoints(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Waypoint location. Can be an address string or LatLng. Optional.
     * 
     * @param value
     */
    public final native void setLocation(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.location = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    /**
     * Waypoint location. Can be an address string or LatLng. Optional.
     * 
     * @param value
     */
    public final native void setLocation(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.location = value;
    }-*/;

    public final native LatLng getLocation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * If true, indicates that this waypoint is a stop between the origin and
     * destination. This has the effect of splitting the route into two. This
     * value is true by default. Optional.
     * 
     * @param value
     */
    public final native void setStopOver(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.stopover = value;
    }-*/;

    public final native boolean isStopOver()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.stopover;
    }-*/;

}
