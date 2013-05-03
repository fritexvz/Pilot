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
package com.emitrom.pilot.maps.client.services.elevation;

import java.util.ArrayList;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * An elevation query sent by the ElevationService containing the path along
 * which to return sampled data. This request defines a continuous path along
 * the earth along which elevation samples should be taken at evenly-spaced
 * distances. All paths from vertex to vertex use segments of the great circle
 * between those two points
 * 
 */
public class PathElevationRequest extends JsObject {

    public PathElevationRequest() {
        jsObj = JsoHelper.createObject();
    }

    public PathElevationRequest(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The path along which to collect elevation values.
     * 
     * @param values
     */

    public void setPath(ArrayList<LatLng> locations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLng : locations) {
            values.push(latLng.getJsObj());
        }
        _setPath(values);
    }

    public void setPath(LatLng... locations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLng : locations) {
            values.push(latLng.getJsObj());
        }
        _setPath(values);
    }

    private native void _setPath(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.path = values;
    }-*/;

    public ArrayList<LatLng> getPath() {
        ArrayList<LatLng> result = new ArrayList<LatLng>();
        JsArray<JavaScriptObject> array = _getPath();
        for (int i = 0; i < array.length(); i++) {
            result.add(new LatLng(array.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getPath()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.path;
    }-*/;

    /**
     * Required. The number of equidistant points along the given path for which
     * to retrieve elevation data, including the endpoints. The number of
     * samples must be a value between 2 and 1024.
     * 
     * @param value
     */
    public final native void setSamples(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.samples = value;
    }-*/;

    public final native double getSamples()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.samples;
    }-*/;

}
