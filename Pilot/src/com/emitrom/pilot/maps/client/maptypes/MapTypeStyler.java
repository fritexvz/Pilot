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
package com.emitrom.pilot.maps.client.maptypes;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;

/**
 * A styler affects how a map's elements will be styled. Each MapTypeStyler
 * should contain one and only one key. If more than one key is specified in a
 * single MapTypeStyler, all but one will be ignored. For example: var rule =
 * {hue: '#ff0000'}.
 * 
 */
public class MapTypeStyler extends JsObject {

    public MapTypeStyler() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Gamma. Modifies the gamma by raising the lightness to the given power.
     * Valid values: Floating point numbers, [0.01, 10], with 1.0 representing
     * no change.
     * 
     * @param value
     */
    public native void setGamma(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.gamma = value;
    }-*/;

    public native double getGamma()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.gamma;
    }-*/;

    /**
     * Sets the hue of the feature to match the hue of the color supplied. Note
     * that the saturation and lightness of the feature is conserved, which
     * means that the feature will not match the color supplied exactly. Valid
     * values: An RGB hex string, i.e. '#ff0000'.
     * 
     * @param value
     */
    public native void setHue(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.hue = value;
    }-*/;

    public native String getHue()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.hue;
    }-*/;

    /**
     * Inverts lightness. A value of true will invert the lightness of the
     * feature while preserving the hue and saturation.
     * 
     * @param value
     */
    public native void setInvertLightness(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.invert_lightness = value;
    }-*/;

    public native boolean invertLightness()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.invert_lightness;
    }-*/;

    /**
     * Lightness. Shifts lightness of colors by a percentage of the original
     * value if decreasing and a percentage of the remaining value if
     * increasing. Valid values: [-100, 100].
     * 
     * @param value
     */
    public native void setLightness(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.lightness = value;
    }-*/;

    public native double getLightness()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.lightness;
    }-*/;

    /**
     * Saturation. Shifts the saturation of colors by a percentage of the
     * original value if decreasing and a percentage of the remaining value if
     * increasing. Valid values: [-100, 100].
     * 
     * @param value
     */
    public native void setSaturation(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.saturation = value;
    }-*/;

    public native double getSaturation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.saturation;
    }-*/;

    /**
     * Visibility: Valid values: 'on', 'off' or 'simplified'.
     * 
     * @param value
     */
    public native void setVisibility(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.visibility = value;
    }-*/;

    public native String getVisibility()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.visibility;
    }-*/;

}
