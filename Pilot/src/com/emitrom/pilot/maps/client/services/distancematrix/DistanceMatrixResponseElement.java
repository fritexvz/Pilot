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
package com.emitrom.pilot.maps.client.services.distancematrix;

import com.emitrom.pilot.maps.client.core.Distance;
import com.emitrom.pilot.maps.client.core.Duration;
import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * A single element of a response to a DistanceMatrixService request, which
 * contains the duration and distance from one origin to one destination.
 */
public class DistanceMatrixResponseElement extends JsObject {

    public DistanceMatrixResponseElement() {
        jsObj = JsoHelper.createObject();
    }

    public DistanceMatrixResponseElement(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The distance for this origin-destination pairing. This property may be
     * undefined as the distance may be unknown.
     * 
     * @return
     */
    public native Distance getDistance()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.distance;
		var toReturn = @com.emitrom.pilot.maps.client.core.Distance::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The duration for this origin-destination pairing. This property may be
     * undefined as the duration may be unknown.
     * 
     * @return
     */
    public native Duration getDuration()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.duration;
		var toReturn = @com.emitrom.pilot.maps.client.core.Duration::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The status of this particular origin-destination pairing.
     */
    public DistanceMatrixElementStatus getStatus() {
        return DistanceMatrixElementStatus.fromValue(_getStatus());
    }

    private native String _getStatus()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.status;
    }-*/;

}
