/**
 Copyright (c) 2013 Emitrom LLC. All rights reserved.
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
package com.emitrom.pilot.maps.client.services.directions;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.maps.client.services.handlers.DirectionsServiceHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A service for computing directions between two or more places.
 */
public class DirectionsService extends JsObject {

    /**
     * Creates a new instance of a DirectionsService that sends directions
     * queries to Google servers.
     * 
     * @return
     */
    public DirectionsService() {
        jsObj = create();
    }

    /**
     * 
     * Issue a directions search request.
     */

    public final native void route(DirectionsRequest request, DirectionsServiceHandler callBack)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso
				.route(
						request,
						function(request, status) {
							var directionsStatus = @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::fromValue(Ljava/lang/String;)(status);
							var values = @com.emitrom.pilot.maps.client.services.ServicesUtil::createDirectionResultList(Lcom/google/gwt/core/client/JsArray;)(request);
							callBack.@com.emitrom.pilot.maps.client.services.handlers.DirectionsServiceHandler::onSuccess(Ljava/util/ArrayList;Lcom/emitrom/pilot/maps/client/services/directions/DirectionsStatus;)(values,directionStatus);
						});
    }-*/;

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.DirectionsService();
    }-*/;

}
