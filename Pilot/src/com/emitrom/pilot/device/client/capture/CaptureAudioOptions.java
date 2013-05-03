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
package com.emitrom.pilot.device.client.capture;

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;

/**
 * Encapsulates audio capture configuration options.
 */
public class CaptureAudioOptions extends JsObject {

    public CaptureAudioOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Sets the maximum number of audio clips the device user can record in a single
     * capture operation. The value must be greater than or equal to 1 (defaults
     * to 1).
     * 
     * @param value
     */
    public void seLimit(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("Limit must be greater than or equal to 1");
        }
        
        JsoHelper.setAttribute(jsObj, "limit", value);
    }

    /**
     * Gets the maximum number of audio clips the device user can record in a 
     * single capture operation.
     * 
     * @return int
     */
    public int getLimit() {
        return JsoHelper.getAttributeAsInt(jsObj, "limit");
    }

    /**
     * Sets the maximum duration of an audio sound clip, in seconds.
     * 
     * @param value 
     */
    public void setDuration(int value) {
        JsoHelper.setAttribute(jsObj, "duration", value);
    }

    /**
     * Gets the maximum duration of an audio sound clip, in seconds.
     * 
     * @return int
     */
    public int getDuration() {
        return JsoHelper.getAttributeAsInt(jsObj, "duration");
    }

    /**
     * Sets the audio mode.
     */
    public void setMode(ConfigurationData value) {
        // not supported
        // TODO check this
    }

    /**
     * Gets the audio mode.  Returns null since this is not supported
     * in all platforms.
     * 
     * @return ConfigurationData
     */
    public ConfigurationData getMode() {
        return null;
    }
}
