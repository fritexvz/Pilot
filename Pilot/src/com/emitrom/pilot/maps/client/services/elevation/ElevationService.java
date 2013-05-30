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
package com.emitrom.pilot.maps.client.services.elevation;

import com.emitrom.pilot.maps.client.services.handlers.ElevationServiceHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.core.JsObject;

/**
 * Defines a service class that talks directly to Google servers for requesting
 * elevation data
 * 
 */
public class ElevationService extends JsObject {

    public ElevationService() {
        jsObj = create();
    }

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.ElevationService();
    }-*/;

    /**
     * Makes an elevation request along a path, where the elevation data are
     * returned as distance-based samples along that path.
     * 
     * @param request
     * @param callBack
     */
    public native void getElevationAlongPath(PathElevationRequest request, ElevationServiceHandler callBack)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		$entry(jso
				.getElevationAlongPath(
						request.@com.pilot.shared.client.core.JsObject::getJsObj()(),
						function(results, status) {
							var elevationStatus = @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::fromValue(Ljava/lang/String;)(status);
							var values = @com.emitrom.pilot.maps.client.services.ServicesUtil::createElevationResultList(Lcom/google/gwt/core/client/JsArray;)(request);
							callBack.@com.emitrom.pilot.maps.client.services.handlers.ElevationServiceHandler::onSuccess(Ljava/util/ArrayList;Lcom/emitrom/pilot/maps/client/services/elevation/ElevationStatus;)(values,elevationStatus);
						}));
    }-*/;

    /**
     * Makes an elevation request for a list of discrete locations.
     * 
     * @param request
     * @param callBack
     */
    public native void getElevationForLocations(LocationElevationRequest request, ElevationServiceHandler callBack)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		$entry(jso
				.getElevationForLocations(
						request.@com.pilot.shared.client.core.JsObject::getJsObj()(),
						function(results, status) {
							var elevationStatus = @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::fromValue(Ljava/lang/String;)(status);
							var values = @com.emitrom.pilot.maps.client.services.ServicesUtil::createElevationResultList(Lcom/google/gwt/core/client/JsArray;)(request);
							callBack.@com.emitrom.pilot.maps.client.services.handlers.ElevationServiceHandler::onSuccess(Ljava/util/ArrayList;Lcom/emitrom/pilot/maps/client/services/elevation/ElevationStatus;)(values,elevationStatus);
						}));
    }-*/;

}
