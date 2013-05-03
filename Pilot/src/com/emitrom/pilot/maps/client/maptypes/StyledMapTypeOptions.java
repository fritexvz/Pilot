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

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;

public class StyledMapTypeOptions extends JsObject {

    public StyledMapTypeOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Alt text to display when this MapType's button is hovered over in the
     * MapTypeControl.
     * 
     * @param value
     */
    public native void setAlt(String value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.alt = value;
    }-*/;

    public native String getAlt()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.alt;
    }-*/;

    /**
     * The maximum zoom level for the map when displaying this MapType.
     * 
     * @param value
     */
    public native void setMaxZoom(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.maxZoom = value;
    }-*/;

    public native double getMaxZoom()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.maxZoom;
    }-*/;

    /**
     * The minimum zoom level for the map when displaying this MapType.
     * Optional.
     * 
     * @param value
     */
    public native void setMinZoom(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.minZoom = value;
    }-*/;

    public native double getMinZoom()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.minZoom;
    }-*/;

    /**
     * Name to display in the MapTypeControl.
     * 
     * @param value
     */
    public native void setName(String value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.name = value;
    }-*/;

    public native String getName()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.name;
    }-*/;

}
