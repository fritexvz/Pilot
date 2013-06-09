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
package com.emitrom.pilot.maps.client.services;

import java.util.ArrayList;

import com.emitrom.pilot.maps.client.services.directions.DirectionsResult;
import com.emitrom.pilot.maps.client.services.elevation.ElevationResult;
import com.emitrom.pilot.maps.client.services.geocoder.GeocoderResult;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class ServicesUtil {

    private ServicesUtil() {

    }

    public static ArrayList<DirectionsResult> createDirectionResultList(JsArray<JavaScriptObject> array) {
        ArrayList<DirectionsResult> result = new ArrayList<DirectionsResult>();
        for (int i = 0; i < array.length(); i++) {
            result.add(new DirectionsResult(array.get(i)));
        }
        return result;
    }

    public static ArrayList<ElevationResult> createElevationResultList(JsArray<JavaScriptObject> array) {
        ArrayList<ElevationResult> result = new ArrayList<ElevationResult>();
        for (int i = 0; i < array.length(); i++) {
            result.add(new ElevationResult(array.get(i)));
        }
        return result;
    }

    public static ArrayList<GeocoderResult> creatGeocoderResultList(JsArray<JavaScriptObject> array) {
        ArrayList<GeocoderResult> result = new ArrayList<GeocoderResult>();
        for (int i = 0; i < array.length(); i++) {
            result.add(new GeocoderResult(array.get(i)));
        }
        return result;
    }

}
