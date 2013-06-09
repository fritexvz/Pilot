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
package com.emitrom.pilot.device.client.accelerometer;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.util.client.core.Attributes;

/**
 * An optional parameter to customize the retrieval of the accelerometer.
 */
public class AccelerometerOptions extends JsObject {

    public AccelerometerOptions() {
        jsObj = JsoHelper.createObject();
    }

    public AccelerometerOptions(double frequency) {
        this();
        setFrequency(frequency);
    }

    /**
     * How often to retrieve the Acceleration in milliseconds. (Default: 10000)
     * 
     * @param value
     */
    public void setFrequency(double value) {
        JsoHelper.setAttribute(jsObj, Attributes.FREQUENCY.getValue(), value);
    }

}
