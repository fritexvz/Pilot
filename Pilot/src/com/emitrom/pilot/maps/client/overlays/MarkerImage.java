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

import com.emitrom.pilot.maps.client.geom.Point;
import com.emitrom.pilot.maps.client.geom.Size;
import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A structure representing a Marker icon or shadow image.
 * 
 */
public class MarkerImage extends JsObject {

    public MarkerImage() {
        jsObj = JsoHelper.createObject();
    }

    public MarkerImage(JavaScriptObject obj) {
        super(obj);
    }

    public MarkerImage(String url) {
        jsObj = create(url);
    }

    public MarkerImage(String url, Size size) {
        jsObj = create(url, size.getJsObj());
    }

    public MarkerImage(String url, Size size, Point origin) {
        jsObj = create(url, size.getJsObj(), origin.getJsObj());
    }

    public MarkerImage(String url, Size size, Point origin, Point anchor) {
        jsObj = create(url, size.getJsObj(), origin.getJsObj(), anchor.getJsObj());
    }

    public MarkerImage(String url, Size size, Point origin, Point anchor, Size scaleSize) {
        jsObj = create(url, size.getJsObj(), origin.getJsObj(), anchor.getJsObj(), scaleSize.getJsObj());
    }

    public final native Point getAnchor()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.anchor;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The position at which to anchor an image in correspondance to the
     * location of the marker on the map. By default, the anchor is located
     * along the center point of the bottom of the image.
     * 
     * @param value
     */
    public final native void setAnchor(Point value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		this.anchor = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
    }-*/;

    /**
     * The position of the image within a sprite, if any. By default, the origin
     * is located at the top left corner of the image (0, 0).
     * 
     * @param value
     */
    public final native void setOrigin(Point value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		this.origin = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
    }-*/;

    public final native Point getOrigin()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.origin;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The size of the entire image after scaling, if any. Use this property to
     * stretch/shrink an image or a sprite.
     * 
     * @param value
     */
    public final native void setScaledSize(Size value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		this.scaledSize = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
    }-*/;

    public final native Size getScaledSize()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.scaledSize;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The display size of the sprite or image. When using sprites, you must
     * specify the sprite size. If the size is not provided, it will be set when
     * the image loads.
     * 
     * @param value
     */
    public final native void setSize(Size value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		this.size = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
    }-*/;

    public final native Size getSize()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.size;
		var toReturn = @com.emitrom.pilot.maps.client.geom.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The URL of the image or sprite sheet.
     * 
     * @param value
     */
    public final native void setUrl(String value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.url = value;
    }-*/;

    public final native String getUrl()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.url;
    }-*/;

    private static native JavaScriptObject create(String url) /*-{
		return new $wnd.google.maps.MarkerImage(url);
    }-*/;

    private static native JavaScriptObject create(String url, JavaScriptObject size) /*-{
		return new $wnd.google.maps.MarkerImage(url, size);
    }-*/;

    private static native JavaScriptObject create(String url, JavaScriptObject size, JavaScriptObject origin) /*-{
		return new $wnd.google.maps.MarkerImage(url, size, origin);
    }-*/;

    private static native JavaScriptObject create(String url, JavaScriptObject size, JavaScriptObject origin,
                    JavaScriptObject anchor) /*-{
		return new $wnd.google.maps.MarkerImage(url, size, origin, anchor);
    }-*/;

    private static native JavaScriptObject create(String url, JavaScriptObject javaScriptObject,
                    JavaScriptObject origin, JavaScriptObject anchor, JavaScriptObject scaledSize) /*-{
		return new $wnd.google.maps.MarkerImage(url, size, origin, anchor,
				scaledSize);
    }-*/;

}
