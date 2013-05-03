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
package com.emitrom.pilot.maps.client.geom;

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class Point extends JsObject {

    public Point(JavaScriptObject obj) {
        super(obj);
    }

    public Point() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * A point on a two-dimensional plane.
     * 
     * @param x
     * @param y
     * @return
     */
    public Point(double x, double y) {
        jsObj = create(x, y);
    }

    private static native JavaScriptObject create(double x, double y)/*-{
		return new $wnd.google.maps.Point(x, y);
    }-*/;

    /**
     * Compares two Points
     * 
     * @param other
     * @return
     */
    public final native boolean equals(Point other)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso
				.equals(other.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Converts to string representation.
     * 
     * @return
     */
    public final native String toStringValue()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.toString();
    }-*/;

    public final native void setX(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.x = value;
    }-*/;

    public final native double getX()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.x;
    }-*/;

    public final native void setY(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.y = value;
    }-*/;

    public final native double getY()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.y;
    }-*/;

}
