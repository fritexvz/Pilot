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

package com.emitrom.pilot.maps.client.core;

import java.util.ArrayList;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.controls.MapTypeControlOptions;
import com.emitrom.pilot.maps.client.controls.OverviewMapControlOptions;
import com.emitrom.pilot.maps.client.controls.PanControlOptions;
import com.emitrom.pilot.maps.client.controls.RotateControlOptions;
import com.emitrom.pilot.maps.client.controls.ScaleControlOptions;
import com.emitrom.pilot.maps.client.controls.StreetViewControlOptions;
import com.emitrom.pilot.maps.client.controls.ZoomControlOptions;
import com.emitrom.pilot.maps.client.maptypes.MapTypeStyle;
import com.emitrom.pilot.maps.client.streetview.StreetViewPanorama;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * MapOptions as specified by the Google Documentation:
 * http://code.google.com/apis/maps/documentation/v3/reference.html
 * 
 * 
 */
public class GMapOptions extends JsObject {

    public GMapOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Color used for the background of the Map div. This color will be visible
     * when tiles have not yet loaded as the user pans. This option can only be
     * set when the map is initialized.
     * 
     * @param value
     */
    public void setBackgroundColor(String value) {
        JsoHelper.setAttribute(jsObj, "backGroundColor", value);
    }

    /**
     * Gets the color used for the background of the Map div. This color will be
     * visible when tiles have not yet loaded as the user pans. This option can
     * only be set when the map is initialized.
     * 
     * @param value
     */
    public String getBackgroundColor() {
        return JsoHelper.getAttribute(jsObj, "backGroundColor");
    }

    /**
     * The initial Map center. Required.
     * 
     * @param value
     */
    public void setCenter(LatLng value) {
        JsoHelper.setAttribute(jsObj, "center", value.getJsObj());
    }

    /**
     * Gets the initial Map center
     * 
     * @return
     */
    public native LatLng getCenter() /*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var center = jso.center;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(center);
		return toReturn;
    }-*/;

    /**
     * Enables/disables all default UI. May be overridden individually.
     * 
     * @param value
     */
    public void setDisableDefaultUI(boolean value) {
        JsoHelper.setAttribute(jsObj, "disableDefaultUI", value);

    }

    public boolean isDefaultUiDisabled() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "disableDefaultUI");
    }

    /**
     * Enables/disables zoom and center on double click. Enabled by default.
     * 
     * @param value
     */
    public native void setDisableDoubleClickZoom(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.disableDoubleClickZoom = value;
    }-*/;

    public native boolean isDoubleClickZoomDisabled()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.disableDoubleClickZoom;
    }-*/;

    /**
     * If false, prevents the map from being dragged. Dragging is enabled by
     * default.
     * 
     * @param value
     */
    public native void setDraggable(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.draggable = value;
    }-*/;

    public native boolean isDraggable()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.draggable;
    }-*/;

    /**
     * The name or url of the cursor to display on a draggable object.
     * 
     * @return
     */
    public native void setDraggableCursor(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.draggableCursor = value;
    }-*/;

    public native String getDraggableCursor()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.draggableCursor;
    }-*/;

    /**
     * The name or url of the cursor to display when an object is dragging.
     * 
     * @return
     */
    public native void setDraggingCursor(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.draggingCursor = value;
    }-*/;

    public native String getDraggingCursor()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.draggingCursor;
    }-*/;

    /**
     * The heading for aerial imagery in degrees measured clockwise from
     * cardinal direction North. Headings are snapped to the nearest available
     * angle for which imagery is available.
     * 
     * @param value
     */
    public native void setHeading(double value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.heading = value;
    }-*/;

    public native double getHeading()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.heading;
    }-*/;

    /**
     * If false, prevents the map from being controlled by the keyboard.
     * Keyboard shortcuts are enabled by default.
     * 
     * @param value
     */
    public native void setKeyboardShortcuts(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.keyboardShortcuts = value;
    }-*/;

    public native boolean hasKeyboardShortcuts()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.keyboardShortcuts;
    }-*/;

    public native void setMayTypeControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.mayTypeControl = value;
    }-*/;

    public native boolean hasMaptypeControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.maptypeControl;
    }-*/;

    /**
     * The initial display options for the Map type control.
     * 
     * @param options
     */
    public native void setMapTypeControlOptions(MapTypeControlOptions options)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.mapTypeControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native MapTypeControlOptions getMapTypeControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.mapTypeControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.MapTypeControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The initial Map mapTypeId. Required.
     * 
     * @param id
     */
    public void setMapTypeId(MapTypeId id) {
        setMapTypeId(id.getValue());
    }

    private native void setMapTypeId(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.mapTypeId = value;
    }-*/;

    public MapTypeId getMapTypeId() {
        return MapTypeId.fromValue(_getMapTypeId());
    }

    private native String _getMapTypeId()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.mapTypeId;
    }-*/;

    /**
     * The maximum zoom level which will be displayed on the map. If omitted, or
     * set to null, the maximum zoom from the current map type is used instead.
     * 
     * @param value
     */
    public native void setMaxZoom(double value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.maxZoom = value;
    }-*/;

    public native double getMaxZoom()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.maxZoom;
    }-*/;

    /**
     * The minimum zoom level which will be displayed on the map. If omitted, or
     * set to null, the maximum zoom from the current map type is used instead.
     * 
     * @param value
     */
    public native void setMinZoom(double value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.minZoom = value;
    }-*/;

    public native double getMinZoom()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.minZoom;
    }-*/;

    /**
     * If true, do not clear the contents of the Map div.
     * 
     * @param value
     */
    public native void setNoClear(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.noClear = value;
    }-*/;

    public native boolean isNoClear()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.noClear;
    }-*/;

    /**
     * The enabled/disabled state of the Overview Map control.
     * 
     * @param value
     */
    public native void setOverviewMapControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.overviewMapControl = value;
    }-*/;

    public native boolean hasOverviewMapControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.overviewMapControl;
    }-*/;

    /**
     * The display options for the Overview Map control.
     * 
     * @param options
     */
    public native void setOverviewMapControlOptions(OverviewMapControlOptions options)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.overviewMapControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native OverviewMapControlOptions getOverviewMapControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.overviewMapControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.OverviewMapControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The enabled/disabled state of the Pan control.
     * 
     * @param value
     */
    public native void setPanControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.panControl = value;
    }-*/;

    public native boolean hasPanControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.panControl;
    }-*/;

    /**
     * The display options for the Pan control.
     * 
     * @param options
     */
    public native void setPanControlOptions(PanControlOptions options)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.panControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
		;
    }-*/;

    public native PanControlOptions getPanControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.panControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.PanControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The enabled/disabled state The rotate options
     * 
     * @param value
     */
    public native void setRotateControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.rotateControl = value;
    }-*/;

    public native boolean hasRotateControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.rotateControl;
    }-*/;

    /**
     * The display options for the Rotate control.
     * 
     * @param options
     */
    public native void setRotateControlOptions(RotateControlOptions options)/*-{
		jso.rotateControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native RotateControlOptions getRotateControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.rotateControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.RotateControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * The enabled/disabled state The scale options
     * 
     * @param value
     */
    public native void setScaleControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.scaleControl = value;
    }-*/;

    public native boolean hasScaleControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.scaleControl;
    }-*/;

    /**
     * The display options for the Scale control.
     * 
     * @param options
     */
    public native void setScaleControlOptions(ScaleControlOptions options)/*-{
		jso.scaleControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native ScaleControlOptions getScaleControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.scaleControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.ScaleControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * If false, disables scrollwheel zooming on the map. The scrollwheel is
     * enabled by default.
     * 
     * @param value
     */
    public native void setScroolWheel(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.scroolWheel = value;
    }-*/;

    /**
     * A StreetViewPanorama to display when the Street View pegman is dropped on
     * the map. If no panorama is specified, a default StreetViewPanorama will
     * be displayed in the map's div when the pegman is dropped.
     * 
     * @param value
     */
    public native void setStreetView(StreetViewPanorama value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.streetView = value.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native StreetViewPanorama getStreetView()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.streetView;
		var toReturn = @com.emitrom.pilot.maps.client.streetview.StreetViewPanorama::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native boolean hasScrollWheel()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.scrollWheel;
    }-*/;

    /**
     * The initial enabled/disabled state of the Street View Pegman control. jso
     * control is part of the default UI, and should be set to false when
     * displaying a map type on which the Street View road overlay should not
     * appear (e.g. a non-Earth map type).
     * 
     * @param value
     */
    public native void setStreetViewControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.streetViewControl = value;
    }-*/;

    public native boolean hasStreetViewControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.streetViewControl;
    }-*/;

    /**
     * The display options for the Stree View Pegman control.
     * 
     * @param options
     */
    public native void setStreeViewControlOptions(StreetViewControlOptions options)/*-{
		jso.streetViewControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native StreetViewControlOptions getStreeViewControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.streetViewControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.StreetViewControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Styles to apply to each of the default map types. Note that styles will
     * apply only to the labels and geometry in Satellite/Hybrid and Terrain
     * modes.
     * 
     * @param values
     */

    public void setStyles(ArrayList<MapTypeStyle> styles) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (MapTypeStyle style : styles) {
            array.push(style.getJsObj());
        }
        _setStyles(array);
    }

    private native void _setStyles(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.styles = values;
    }-*/;

    public ArrayList<MapTypeStyle> getStyles() {
        ArrayList<MapTypeStyle> styles = new ArrayList<MapTypeStyle>();
        JsArray<JavaScriptObject> array = _getStyles();
        for (int i = 0; i < array.length(); i++) {
            styles.add(new MapTypeStyle(array.get(i)));
        }
        return styles;
    }

    private native JsArray<JavaScriptObject> _getStyles()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.styles;
    }-*/;

    /**
     * The angle of incidence of the map as measured in degrees from the
     * viewport plane to the map plane. The only currently supported values are
     * 0, indicating no angle of incidence (no tilt), and 45, indicating a tilt
     * of 45deg;. 45deg; imagery is only available for SATELLITE and HYBRID map
     * types, within some locations, and at some zoom levels.
     * 
     * @param value
     */
    public native void setTilt(double value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.tilt = value;
    }-*/;

    public native double getTilt()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.tilt;
    }-*/;

    /**
     * The initial Map zoom level. Required.
     * 
     * @return
     */
    public native double getZoom() /*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.zoom;
    }-*/;

    public native void setZoom(double value) /*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.zoom = value;
    }-*/;

    /**
     * The enabled/disabled state The zoom control
     * 
     * @param value
     */
    public native void setZoomControl(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.zoomControl = value;
    }-*/;

    public native boolean hasZoomControl()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.zoomControl;
    }-*/;

    /**
     * The display options for the Zoom control.
     * 
     * @param options
     */
    public native void setZoomControlOptions(ZoomControlOptions options)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.zoomControlOptions = options.@com.pilot.shared.client.JsObject::getJsObj()();
    }-*/;

    public native ZoomControlOptions getZoomControlOptions()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.zoomControlOptions;
		var toReturn = @com.emitrom.pilot.maps.client.controls.ZoomControlOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
