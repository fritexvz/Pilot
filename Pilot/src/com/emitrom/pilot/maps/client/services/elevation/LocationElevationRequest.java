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
package com.emitrom.pilot.maps.client.services.elevation;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import java.util.ArrayList;

/**
 * An elevation request sent by the ElevationService containing the list of
 * discrete coordinates (LatLngs) for which to return elevation data
 * 
 */
public class LocationElevationRequest extends JsObject {

    public LocationElevationRequest() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * The discrete locations for which to retrieve elevations.
     * 
     * @param locations
     */
    public void setLocation(ArrayList<LatLng> locations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLng : locations) {
            values.push(latLng.getJsObj());
        }
        _setLocations(values);
    }

    public void setLocation(LatLng... locations) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (LatLng latLng : locations) {
            values.push(latLng.getJsObj());
        }
        _setLocations(values);
    }

    private native void _setLocations(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.locations = values;
    }-*/;

    public ArrayList<LatLng> getLocations() {
        ArrayList<LatLng> result = new ArrayList<LatLng>();
        JsArray<JavaScriptObject> array = _getLocations();
        for (int i = 0; i < array.length(); i++) {
            result.add(new LatLng(array.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getLocations()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.locations;
    }-*/;

}
