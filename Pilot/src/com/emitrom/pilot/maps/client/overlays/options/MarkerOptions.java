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

package com.emitrom.pilot.maps.client.overlays.options;

import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.Animation;
import com.emitrom.pilot.maps.client.overlays.MarkerImage;
import com.emitrom.pilot.maps.client.overlays.MarkerShape;
import com.emitrom.pilot.maps.client.streetview.StreetViewPanorama;

public class MarkerOptions extends AbstractOption {

    public MarkerOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Which animation to play when marker is added to a map.
     * 
     * @return
     */
    public Animation getAnimation() {
        return Animation.fromValue(_getAnimation());
    }

    public native String _getAnimation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.animation;
    }-*/;

    public void setAnimation(Animation animation) {
        setAnimation(animation.getValue());
    }

    private native void setAnimation(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.animation = value;
    }-*/;

    /**
     * if true, the marker receives mouse and touch events. Default value is
     * true.
     * 
     * @return
     */
    public native boolean isClickable() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

    public native void setClickable(boolean value) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    /**
     * Mouse cursor to show on hover
     * 
     * @return
     */
    public native String getCursor()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.cursor;
    }-*/;

    public native void setCursor(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.cursor = value;
    }-*/;

    /**
     * If true, the marker can be dragged. Default value is false.
     * 
     * @return
     */
    public native boolean isDraggable() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.draggable;
    }-*/;

    public native void setDraggable(boolean value) /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.draggable = value;
    }-*/;

    /**
     * If true, the marker shadow will not be displayed.
     * 
     * @param value
     */
    public native void setFlat(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.flat = value;
    }-*/;

    public native boolean isFlat()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.flat;
    }-*/;

    public native void setIcon(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.icon = value;
    }-*/;

    public native void setIcon(MarkerImage value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.icon = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    /**
     * Icon for the foreground
     * 
     * @return
     */
    public native String getIcon()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.icon;
    }-*/;

    /**
     * Icon for the foreground
     * 
     * @return
     */
    public native MarkerImage getIconAsMarkerImage()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.icon;
		var toReturn = @com.emitrom.pilot.maps.client.overlays.MarkerImage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native StreetViewPanorama getMapAsStreeviewPanorama()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.map;
		var toReturn = @com.emitrom.pilot.maps.client.streetview.StreetViewPanorama::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setMap(StreetViewPanorama value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.map = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    public native boolean isOptimized()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.optimized;
    }-*/;

    /**
     * Optimization renders many markers as a single static element. Optimized
     * rendering is enabled by default. Disable optimized rendering for animated
     * GIFs or PNGs, or when each marker must be rendered as a separate DOM
     * element (advanced usage only).
     * 
     * @param value
     */
    public native void setOptimized(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.optimized = value;
    }-*/;

    public native LatLng getPosition()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.position;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Marker position. Required.
     * 
     * @param value
     */
    public native void setPosition(LatLng value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		this.position = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
    }-*/;

    public native boolean raiseOnDrag()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.raiseOnDrag;
    }-*/;

    /**
     * If false, disables raising and lowering the marker on drag. This option
     * is true by default.
     * 
     * @param value
     */
    public native void setRaiseOnDrag(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.raiseOnDrag = value;
    }-*/;

    public native String getShadow()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.shadow;
    }-*/;

    public native MarkerImage getShadowAsMarkerImage()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.shadow;
		var toReturn = @com.emitrom.pilot.maps.client.overlays.MarkerImage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Shadow image
     * 
     * @param value
     */
    public native void setShadow(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.shadow = value;
    }-*/;

    /**
     * Shadow image
     * 
     * @param value
     */
    public native void setShadow(MarkerImage value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		this.shadow = value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		;
    }-*/;

    public native void setShape(MarkerShape value)/*-{
		this.shape = value;
    }-*/;

    public native MarkerShape getShape()/*-{
		return this.shape;
    }-*/;

    public native String getTitle()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return this.title;
    }-*/;

    /**
     * Rollover text
     * 
     * @param value
     */
    public native void setTitle(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * If true, the marker is visible
     * 
     * @return
     */
    public native boolean isVisible()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.visible;
    }-*/;

    public native void setVisible(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.visible = value;
    }-*/;

    /**
     * All markers are displayed on the map in order of their zIndex, with
     * higher values displaying in front of markers with lower values. By
     * default, markers are displayed according to their vertical position on
     * screen, with lower markers appearing in front of markers further up the
     * screen.
     * 
     * @param value
     */
    public native void setZIndex(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    public native double getZIndex()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.zIndex;
    }-*/;

}
