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
package com.emitrom.pilot.maps.client.services.distancematrix;

import com.emitrom.pilot.maps.client.services.handlers.DistanceMatrixServiceHandler;
import com.emitrom.pilot.util.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A service for computing distances between multiple origins and destinations.
 * 
 */
public class DistanceMatrixService extends JsObject {

    /**
     * Creates a new instance of a DistanceMatrixService that sends distance
     * matrix queries to Google servers.
     */
    public DistanceMatrixService() {
        jsObj = create();
    }

    /**
     * Issues a distance matrix request.
     * 
     * @param request
     * @param callBack
     */
    public native void getDistanceMatrix(DistanceMatrixRequest request, DistanceMatrixServiceHandler callBack)/*-{
    	var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		$entry(jso
				.getDistanceMatrix(
						request.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()(),
						function(response, status) {
							var responseStatus = @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::fromValue(Ljava/lang/String;)(status);
							var responseObject = @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(response);
							callBack.@com.emitrom.pilot.maps.client.services.handlers.DistanceMatrixServiceHandler::onSuccess(Lcom/emitrom/pilot/maps/client/services/distancematrix/DistanceMatrixResponse;Lcom/emitrom/pilot/maps/client/services/distancematrix/DistanceMatrixStatus;)(responseObject, responseStatus);
						}));
    }-*/;

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.DistanceMatrixService();
    }-*/;

}
