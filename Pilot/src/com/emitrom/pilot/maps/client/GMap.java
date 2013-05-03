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
package com.emitrom.pilot.maps.client;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.core.MapTypeId;
import com.emitrom.pilot.maps.client.events.GMapEvent;
import com.emitrom.pilot.maps.client.events.handlers.DragEndHandler;
import com.emitrom.pilot.maps.client.events.handlers.MapTapHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class GMap extends MVCObject {

	/**
	 * Create a new Panel.
	 */

	public GMap(JavaScriptObject jsObj) {
		super(jsObj);
	}

	/**
	 * 
	 * @param zoom
	 */
	public final native void setZoom(double value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.setZoom(value);
	}-*/;

	public final native void setCenter(LatLng latLgn)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var latln = latLgn.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.setCenter(latln);
	}-*/;

	public final native LatLng getCenter()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.getCenter();
		return @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * 
	 * @param id
	 */
	public final void setMapType(MapTypeId id) {
		_setMapType(id.getValue());
	}

	private final native void _setMapType(String id)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.setMapTypeId(id);
	}-*/;

	public final MapTypeId getMapType() {
		return MapTypeId.fromValue(_getMapType());
	}

	private final native String _getMapType()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.getMapTypeId();
	}-*/;

	public void addTapHandler(MapTapHandler handler) {
		addEventListener(this.getJsObj(), GMapEvent.TAP, handler);
	}

	private static native void addEventListener(JavaScriptObject target,
			String event, MapTapHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.emitrom.pilot.maps.client.events.handlers.MapTapHandler::onTap(Lcom/emitrom/pilot/maps/client/events/InteractionEvent;)(e);
						});
	}-*/;

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

}
