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

import com.emitrom.pilot.maps.client.GMap;
import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.Animation;
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.events.GMapEvent;
import com.emitrom.pilot.maps.client.events.handlers.DragEndHandler;
import com.emitrom.pilot.maps.client.events.handlers.DragHandler;
import com.emitrom.pilot.maps.client.events.handlers.TapHandler;
import com.emitrom.pilot.maps.client.overlays.options.MarkerOptions;
import com.emitrom.pilot.maps.client.streetview.StreetViewPanorama;
import com.google.gwt.core.client.JavaScriptObject;

public class Marker extends MVCObject {

	/**
	 * The maximum default z-index that the API will assign to a marker. You may
	 * set a higher z-index to bring a marker to the front.
	 */
	public static final double MAX_ZINDEX = MAX_Z_INDEX();

	public Marker() {
		jsObj = create();
	}

	public Marker(GMap map) {
		this();
		this.setMap(map);
		this.setPosition(map.getCenter());
	}

	public Marker(GMap map, LatLng position) {
		this(map);
		setPosition(position);
	}

	protected Marker(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public native void setTitle(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setTitle(value);
	}-*/;

	public native String getTitle()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getTitle();
	}-*/;

	public void setMap(GMap map) {
		setMap(map.getJsObj());
	}

	public void setPosition(LatLng latLgn) {
		setPosition(latLgn.getJsObj());
	}

	public final Animation getAnimation() {
		return Animation.fromValue(_getAnimation());
	}

	public final native String _getAnimation()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getAnimation();
	}-*/;

	public final native boolean isClickable()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getClickable();
	}-*/;

	public final native String getCursor()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getCursor();
	}-*/;

	public final native boolean isDraggable()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getDraggable();
	}-*/;

	public final native boolean isFlat()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getFlat();
	}-*/;

	public final native String getIcon()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getIcon();
	}-*/;

	public final native MarkerImage getIconAsMarkerImage()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getIcon();
		var toReturn = @com.emitrom.pilot.maps.client.overlays.MarkerImage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public final native StreetViewPanorama getMapAsStreeviewPanorama()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getMap();
		var toReturn = @com.emitrom.pilot.maps.client.streetview.StreetViewPanorama::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public final native LatLng getPosition()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getPosition();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public final native String getShadow()/*-{
		return this.getShadow();
	}-*/;

	public final native MarkerImage getShadowAsMarkerImage()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		var obj = jso.getShadow();
		var toReturn = @com.emitrom.pilot.maps.client.overlays.MarkerImage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
	}-*/;

	public final native MarkerShape getShape()/*-{
		return this.getShape();
	}-*/;

	public final native boolean isVisible() /*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getVisible();
	}-*/;

	public final native double getZIndex()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getZIndex();
	}-*/;

	/**
	 * Start an animation. Any ongoing animation will be cancelled. Currently
	 * supported animations are: BOUNCE, DROP. Passing in null will cause any
	 * animation to stop.
	 * 
	 * @param animation
	 */
	public final void setAnimation(Animation animation) {
		setAnimation(animation.getValue());
	}

	private final native void setAnimation(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setAnimation(value);
	}-*/;

	public final native void setVisible(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setVisible(value);
	}-*/;

	public final native void setClickable(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setClickable(value);
	}-*/;

	public final native void setCursor(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setCursor(value);
	}-*/;

	public final native void setDraggable(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setDraggable(value);
	}-*/;

	public final native void setFlat(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setFlat(value);
	}-*/;

	public final native void setIcon(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setIcon(value);
	}-*/;

	public final native void setIcon(MarkerImage value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.setIcon(value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
	}-*/;

	/**
	 * Renders the marker on the specified panorama. If map is set to null, the
	 * marker will be removed.
	 * 
	 * @param value
	 */
	public final native void setMap(StreetViewPanorama value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.setMap(value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
	}-*/;

	public final native void setOptions(MarkerOptions options)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.setOptions(options.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
	}-*/;

	public final native void setShadow(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setShadow(value);
	}-*/;

	public final native void setShadow(MarkerImage value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.setShadow(value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
	}-*/;

	public final native void setZIndex(double value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setZIndex(value);
	}-*/;

	public final native void setShape(MarkerShape value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.setShape(value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
	}-*/;

	public void addTapHandler(TapHandler handler) {
		addEventListener(this.getJsObj(), GMapEvent.TAP, handler);
	}

	public void addDragEndHandler(DragEndHandler handler) {
		addEventListener(this.getJsObj(), GMapEvent.DRAG_END, handler);
	}

	public void addDragHandler(DragHandler handler) {
		addEventListener(this.getJsObj(), GMapEvent.DRAG, handler);
	}

	private static native void addEventListener(JavaScriptObject target,
			String event, DragEndHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.emitrom.pilot.maps.client.events.handlers.DragEndHandler::onDragEnd(Lcom/emitrom/pilot/maps/client/events/InteractionEvent;)(e);
						});
	}-*/;

	private static native void addEventListener(JavaScriptObject target,
			String event, DragHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.emitrom.pilot.maps.client.events.handlers.DragHandler::onDrag(Lcom/emitrom/pilot/maps/client/events/InteractionEvent;)(e);
						});
	}-*/;

	private static native void addEventListener(JavaScriptObject target,
			String event, TapHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.emitrom.pilot.maps.client.events.handlers.TapHandler::onTap(Lcom/emitrom/pilot/maps/client/events/InteractionEvent;)(e);
						});
	}-*/;

	private native void setMap(JavaScriptObject value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setMap(value);
	}-*/;

	private native void setPosition(JavaScriptObject value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setPosition(value);
	}-*/;

	private native JavaScriptObject create()/*-{
		return new $wnd.google.maps.Marker();
	}-*/;

	private static native double MAX_Z_INDEX() /*-{
		return $wnd.google.maps.Marker.MAX_ZINDEX;
	}-*/;

}
