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

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

public class Size extends JsObject {

    public Size() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Two-dimensonal size, where width is the distance on the x-axis, and
     * height is the distance on the y-axis.
     * 
     * @param width
     * @param height
     * @return
     */
    public Size(double width, double height) {
        jsObj = create(width, height);
    }

    public Size(double width, double height, String widthUnit) {
        jsObj = create(width, height, widthUnit);
    }

    public Size(JavaScriptObject jso) {
        super(jso);
    }

    /**
     * Compares two Sizes
     * 
     * @param other
     * @return
     */
    public final native boolean equals(Size other)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso
				.equals(other.@com.pilot.shared.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Converts to string representation.
     * 
     * @return
     */
    public final native String toStringValue()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.toString();
    }-*/;

    public final native void setWidth(double value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.width = value;
    }-*/;

    public final native double getHeight()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.height;
    }-*/;

    public final native void setHeight(double value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.height = value;
    }-*/;

    public final native double getWidth()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.width;
    }-*/;

    private static native JavaScriptObject create(double width, double height)/*-{
		return new $wnd.google.maps.Size(width, height);
    }-*/;

    private static native JavaScriptObject create(double width, double height, String widthUnit)/*-{
		return new $wnd.google.maps.Size(width, height, widthUnit);
    }-*/;

    public static native JavaScriptObject create(double width, double height, String widthUnit, String heightUnit)/*-{
		return new $wnd.google.maps.Size(width, height, widthUnit, heightUnit);
    }-*/;

}
