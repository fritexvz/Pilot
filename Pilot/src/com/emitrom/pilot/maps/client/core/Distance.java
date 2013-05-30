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
package com.emitrom.pilot.maps.client.core;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A representation of distance as a numeric value and a display string.
 * 
 */
public class Distance extends JsObject {

    public Distance() {
        jsObj = JsoHelper.createObject();
    }

    public Distance(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A string representation of the distance value, using the UnitSystem
     * specified in the request.
     * 
     * @param value
     */
    public final void setText(String value) {
        JsoHelper.setAttribute(jsObj, "text", value);
    }

    /**
     * A string representation of the distance value, using the UnitSystem
     * specified in the request.
     * 
     * @return
     */
    public final String getText() {
        return JsoHelper.getAttribute(jsObj, "text");
    }

    /**
     * Sets the distance in meters.
     * 
     * @param value
     */
    public final void setValue(double value) {
        JsoHelper.setAttribute(jsObj, "value", value);
    }

    /**
     * Return the distance in meters.
     * 
     */
    public double getValue() {
        return JsoHelper.getAttributeAsDouble(jsObj, "value");
    }

}
