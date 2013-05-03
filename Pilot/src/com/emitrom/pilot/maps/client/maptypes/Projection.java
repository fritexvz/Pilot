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

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.geom.Point;
import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class Projection extends JsObject {

    public Projection() {
        jsObj = JsoHelper.createObject();
    }

    public Projection(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Translates from the LatLng cylinder to the Point plane. This interface
     * specifies a function which implements translation from given LatLng
     * values to world coordinates on the map projection. The Maps API calls
     * this method when it needs to plot locations on screen. Projection objects
     * must implement this method.
     * 
     * @param latLgn
     * @param point
     * @return
     */
    public native Point fromLatLgnToPoint(LatLng latLgn, Point point)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso
				.fromLatLgnToPoint(
						latLgn.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()(),
						point.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());

		var toReturn = @com.emitrom.pilot.maps.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * This interface specifies a function which implements translation from
     * world coordinates on a map projection to LatLng values. The Maps API
     * calls this method when it needs to translate actions on screen to
     * positions on the map. Projection objects must implement this method.
     * 
     * @param point
     * @return
     */
    public native LatLng fromPointToLatLgn(Point point)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso
				.fromPointToLatLgn(point.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * This interface specifies a function which implements translation from
     * world coordinates on a map projection to LatLng values. The Maps API
     * calls this method when it needs to translate actions on screen to
     * positions on the map. Projection objects must implement this method.
     * 
     * @param point
     * @return
     */
    public native LatLng fromPointToLatLgn(Point point, boolean noWRap)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso
				.fromPointToLatLgn(
						point.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()(),
						noWrap);
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
