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
package com.emitrom.pilot.maps.client.services.elevation;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The result of an ElevationService request, consisting of the set of elevation
 * coordinates and their elevation values. Note that a single request may
 * produce multiple ElevationResults.
 * 
 */
public class ElevationResult extends JsObject {

    public ElevationResult() {
        jsObj = JsoHelper.createObject();
    }

    public ElevationResult(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The location of this elevation result.
     * 
     * @param values
     */

    public final native void setLocation(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.location = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
    }-*/;

    public native LatLng geLocation() /*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The elevation of this point on Earth, in meters above sea level.
     * 
     * @param value
     */
    public final native void setElevation(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.elevation = value;
    }-*/;

    public final native double getElevation()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.elevation;
    }-*/;

}
