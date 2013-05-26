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
package com.emitrom.pilot.device.client.geolocation;

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * A set of properties that describe the geographic coordinates of a position.
 * 
 */
public class Coordinates extends JsObject {

    Coordinates(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Latitude in decimal degrees
     * 
     * @return
     */
    public double getLatitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "latitude");
    }

    /**
     * Longitude in decimal degrees
     * 
     * @return
     */
    public double getLongitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "longitude");
    }

    /**
     * Height of the position in meters above the ellipsoid.
     * 
     * @return
     */
    public double getAltitude() {
        return JsoHelper.getAttributeAsDouble(jsObj, "altitude");
    }

    /**
     * Accuracy level of the latitude and longitude coordinates in meters.
     * 
     * @return
     */
    public double getAccuracy() {
        return JsoHelper.getAttributeAsDouble(jsObj, "accuracy");
    }

    /**
     * Accuracy level of the altitude coordinate in meters
     * 
     * @return
     */
    public double getAltitudeAccuracy() {
        return JsoHelper.getAttributeAsDouble(jsObj, "altitudeAccuracy");
    }

    /**
     * Direction of travel, specified in degrees counting clockwise relative to
     * the true north
     * 
     * @return
     */
    public double getHeading() {
        return JsoHelper.getAttributeAsDouble(jsObj, "heading");
    }

    /**
     * Current ground speed of the device, specified in meters per second.
     * 
     * @return
     */
    public double getSpeed() {
        return JsoHelper.getAttributeAsDouble(jsObj, "speed");
    }
}
