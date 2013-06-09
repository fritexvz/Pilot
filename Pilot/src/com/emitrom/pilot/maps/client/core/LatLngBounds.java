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

package com.emitrom.pilot.maps.client.core;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A <b>LatLngBounds</b> instance represents a rectangle in geographical
 * coordinates, including one that crosses the 180 degrees longitudinal
 * meridian.
 * 
 */
public class LatLngBounds extends JsObject {

    public LatLngBounds() {
        jsObj = JsoHelper.createObject();
    }

    public LatLngBounds(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Constructs a rectangle from the points at its south-west and north-east
     * corners.
     * 
     * @param sw
     * @param nw
     * @return
     */
    public LatLngBounds(LatLng sw, LatLng nw) {
        jsObj = create(sw.getJsObj(), nw.getJsObj());
    }

    /**
     * Returns true if the given lat/lng is in jso bounds.
     * 
     * @param other
     * @return
     */
    public final native boolean contains(LatLngBounds other) /*-{
		return jso.contains(other);
    }-*/;

    /**
     * Returns true if jso bounds approximately equals the given bounds.
     * 
     * @param other
     * @return
     */
    public final native boolean isEqualTo(LatLngBounds other) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso
				.equals(other.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Extends jso bounds to contain the given point.
     * 
     * @param point
     */
    public final native LatLng extend(LatLng point) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso
				.extend(point.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Computes the center of jso LatLngBounds
     * 
     * @return
     */
    public final native LatLng getCenter() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getCenter();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns the north-east corner of jso bounds.
     * 
     * @return
     */
    public final native LatLng getNorthEast() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getNorthEast();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns the south-west corner of jso bounds.
     * 
     * @return
     */
    public final native LatLng getSouthWest() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getSouthWest();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns true if jso bounds shares any points with jso bounds.
     * 
     * @param other
     * @return
     */
    public final native boolean intersects(LatLngBounds other) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso
				.intersects(other.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns if the bounds are empty.
     * 
     * @return
     */
    public final native boolean isEmpty() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.isEmpty();
    }-*/;

    /**
     * Converts the given map bounds to a lat/lng span.
     * 
     * @param other
     * @return
     */
    public final native LatLng toSpan(LatLngBounds other) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso
				.toSpan(other.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Extends jso bounds to contain the union of jso and the given bounds.
     * 
     * @param other
     */
    public final native void union(LatLngBounds other) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.union(other.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Returns a string of the form "lat,lng" for jso LatLng. We round the
     * lat/lng values to 6 decimal places by default.
     * 
     * @return
     */
    public final native String toUrlValue() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.toUrlValue();
    }-*/;

    /**
     * Returns a string of the form "lat,lng" for jso LatLng. We round the
     * lat/lng values to 6 decimal places by default.
     * 
     * @param precision
     * @return
     */
    public final native String toUrlValue(double precision) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.toUrlValue(precision);
    }-*/;

    /**
     * Converts to string representation.
     * 
     * @return
     */
    public final native String toStringValue()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.toString();
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject sw, JavaScriptObject ne) /*-{
		return new $wnd.runtime.com.google.maps.LatLngBounds(sw, ne);
    }-*/;

}
