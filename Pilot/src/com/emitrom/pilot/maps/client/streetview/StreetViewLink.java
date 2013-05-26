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
package com.emitrom.pilot.maps.client.streetview;

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * A collection of references to adjacent Street View panos.
 * 
 */
public class StreetViewLink extends JsObject {

    public StreetViewLink() {
        jsObj = JsoHelper.createObject();
    }

    public StreetViewLink(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * A localized string describing the link.
     * 
     * @param value
     */
    public native void setDescription(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.description = value;
    }-*/;

    public native String getDescription()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.description;
    }-*/;

    /**
     * The heading of the link.
     * 
     * @param value
     */
    public native void setHeading(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.heading = value;
    }-*/;

    public native String getHeading()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.heading;
    }-*/;

    /**
     * A unique identifier for the panorama. This id is stable within a session
     * but unstable across sessions.
     * 
     * @param value
     */
    public native void setPano(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.pano = value;
    }-*/;

    public native String getPano()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.pano;
    }-*/;

    /**
     * Color of the link
     * 
     * @param value
     */
    public native void setRoadColor(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.roadColor = value;
    }-*/;

    public native String getRoadColor()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.roadColor;
    }-*/;

    /**
     * Opacity of the link
     * 
     * @param value
     */
    public native void setRoadOpacity(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.roadOpacity = value;
    }-*/;

    public native String getRoadOpacitiy()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.roadOpacitiy;
    }-*/;

}
