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
package com.emitrom.pilot.maps.client.geom;

import java.util.ArrayList;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Utilities for polyline encoding and decoding.
 */
public class Encoding {

    private Encoding() {

    }

    /**
     * Decodes an encoded path string into a sequence of LatLngs.
     * 
     * @param value
     * @return
     */
    public static ArrayList<LatLng> decodePath(String value) {
        JsArray<JavaScriptObject> array = _decodePath(value);
        ArrayList<LatLng> toReturn = new ArrayList<LatLng>();
        for (int i = 0; i < array.length(); i++) {
            toReturn.add(LatLng.instance(array.get(i)));
        }
        return toReturn;
    }

    /**
     * Encodes a sequence of LatLngs into an encoded path string.
     * 
     * @param values
     * @return
     */
    public static String encodePath(ArrayList<LatLng> values) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return encodePath(array);
    }

    private static native JsArray<JavaScriptObject> _decodePath(String value)/*-{
		return $wnd.google.maps.geometry.encoding.decodepath(value);
    }-*/;

    private static native String encodePath(JsArray<JavaScriptObject> values)/*-{
		return $wnd.google.maps.geometry.encoding.encodePath(values);
    }-*/;

}
