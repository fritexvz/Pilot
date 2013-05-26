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
package com.emitrom.pilot.maps.client.overlays;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * This object defines the marker shape to use in determination of a marker's
 * clickable region. The shape consists of two properties type and coord which
 * define the general type of marker and coordinates specific to that type of
 * marker
 */
public class MarkerShape extends JsObject {

    public MarkerShape() {
        jsObj = JsoHelper.createObject();
    }

    public MarkerShape(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * The format of this attribute depends on the value of the type and follows
     * the w3 AREA coords specification found at
     * <b>http://www.w3.org/TR/REC-html40/struct/objects.html#adef-coords</b>.
     * The coords attribute is an array of integers that specify the pixel
     * position of the shape relative to the top-left corner of the target
     * image. The coordinates depend on the value of type as follows: - circle:
     * coords is [x1,y1,r] where x1,y2 are the coordinates of the center of the
     * circle, and r is the radius of the circle. - poly: coords is
     * [x1,y1,x2,y2...xn,yn] where each x,y pair contains the coordinates of one
     * vertex of the polygon. - rect: coords is [x1,y1,x2,y2] where x1,y1 are
     * the coordinates of the upper-left corner of the rectangle and x2,y2 are
     * the coordinates of the lower-right coordinates of the rectangle.
     * 
     * @param values
     */
    public void setCoords(double[] coords) {
        JsArrayNumber values = JsArrayNumber.createArray().cast();
        for (double i : coords) {
            values.push(i);
        }
        setCoords(values);
    }

    private native void setCoords(JsArrayNumber values)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.coords = values;
    }-*/;

    public double[] getCoords() {
        JsArrayNumber values = _getCoords();
        double[] coords = new double[values.length()];
        for (int i = 0; i < values.length(); i++) {
            coords[i] = values.get(i);
        }
        return coords;
    }

    private native JsArrayNumber _getCoords()/*-{
		return this.coords;
    }-*/;

    /**
     * Describes the shape's type and can be circle, poly or rect.
     * 
     * @param value
     */
    public native void setType(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.type = value;
    }-*/;

    public native String getType()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.type;
    }-*/;

}
