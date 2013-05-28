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
package com.emitrom.pilot.maps.client.services.streetview;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.emitrom.pilot.maps.client.services.handlers.StreetViewServiceHandler;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

/**
 * A StreetViewService object performs searches for Street View data.
 * 
 */
public class StreetViewService extends JsObject {

    public StreetViewService() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Retrieves the data for the given pano id and passes it to the provided
     * callback as a StreetViewPanoramaData object. Pano ids are unique per
     * panorama and stable for the lifetime of a session, but are liable to
     * change between sessions.
     */
    public native void getPanoramaById(String pano, StreetViewServiceHandler callBack)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		$entry(jso
				.getPanoramaById(
						pano.@com.pilot.shared.client.core.JsObject::getJsObj()(),
						function(data, status) {
							var streetViewStatus = @com.emitrom.pilot.maps.client.services.streetview.StreetViewStatus::fromValue(Ljava/lang/String;)(status);
							var dataObject = @com.emitrom.pilot.maps.client.streetview.StreetviewPanoramaData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
							callBack.@com.emitrom.pilot.maps.client.services.handlers.StreetViewServiceHandler::onSuccess(Lcom/emitrom/pilot/maps/client/streetview/StreetviewPanoramaData;Lcom/emitrom/pilot/maps/client/services/streetview/StreetViewStatus;)(dataObject,streetViewStatus);
						}));
    }-*/;

    /**
     * Retrieves the StreetViewPanoramaData for a panorama within a given radius
     * of the given LatLng. The StreetViewPanoramaData is passed to the provided
     * callback. If the radius is less than 50 meters, the nearest panorama will
     * be returned.
     * 
     * @param latLgn
     * @param radius
     * @param callBack
     */
    public native void getPanoramaByLocation(LatLng latLgn, double radius, StreetViewServiceHandler callBack)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		$entry(jso
				.getPanoramaByLocation(
						latLgn.@com.pilot.shared.client.core.JsObject::getJsObj()(),
						radius,
						function(data, status) {
							var streetViewStatus = @com.emitrom.pilot.maps.client.services.streetview.StreetViewStatus::fromValue(Ljava/lang/String;)(status);
							var dataObject = @com.emitrom.pilot.maps.client.streetview.StreetviewPanoramaData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
							callBack.@com.emitrom.pilot.maps.client.services.handlers.StreetViewServiceHandler::onSuccess(Lcom/emitrom/pilot/maps/client/streetview/StreetviewPanoramaData;Lcom/emitrom/pilot/maps/client/services/streetview/StreetViewStatus;)(dataObject,streetViewStatus);
						}));
    }-*/;

}
