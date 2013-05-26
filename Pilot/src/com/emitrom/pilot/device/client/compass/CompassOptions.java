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
package com.emitrom.pilot.device.client.compass;

import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * An optional parameter to customize the retrieval of the compass.
 */
public class CompassOptions extends JsObject {

    public CompassOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Sets how often to retrieve the compass heading, in milliseconds.
     * 
     * @param value
     */
    public void setFrequency(double value) {
        JsoHelper.setAttribute(jsObj, "frequency", value);
    }

    /**
     * Gets how often to retrieve the compass heading, in milliseconds.
     * Default value is 100.
     * 
     * @return double
     */
    public double getFrequency() {
        return JsoHelper.getAttributeAsDouble(jsObj, "frequency");
    }

    /**
     * Sets the change in degrees required to initiate a watchHeading success callback.
     * 
     * @param value
     */
    public void setFilter(double value) {
        JsoHelper.setAttribute(jsObj, "filter", value);
    }

    /**
     * Gets the change in degrees required to initiate a watchHeading success callback.
     * 
     * @return double
     */
    public double getFilter() {
        return JsoHelper.getAttributeAsDouble(jsObj, "filter");
    }
}
