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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import java.util.ArrayList;

/**
 * The directions response retrieved from the directions server. You can render
 * these using a DirectionsRenderer or parse this object and render it yourself.
 * You must display the warnings and copyrights as noted in the Maps API terms
 * of service. Note that though this result is "JSON-like," it is not strictly
 * JSON, as it indirectly includes LatLng objects.
 * 
 * 
 */
public class DirectionsResult extends JsObject {

    public DirectionsResult() {
        jsObj = JsoHelper.createObject();
    }

    public DirectionsResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * An array of DirectionsRoutes, each of which contains information about
     * the legs and steps of which it is composed. There will only be one route
     * unless the DirectionsRequest was made with provideRouteAlternatives set
     * to true. (This property was formerly known as "trips".)
     * 
     * @return
     */
    public ArrayList<DirectionsRoute> getRoutes() {
        ArrayList<DirectionsRoute> routes = new ArrayList<DirectionsRoute>();
        JsArray<JavaScriptObject> array = _getRoutes();
        for (int i = 0; i < array.length(); i++) {
            routes.add(new DirectionsRoute(array.get(i)));
        }
        return routes;
    }

    private final native JsArray<JavaScriptObject> _getRoutes()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.routes;
    }-*/;

}
