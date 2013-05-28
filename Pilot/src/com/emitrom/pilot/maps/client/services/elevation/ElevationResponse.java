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

import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.core.JsObject;

public class ElevationResponse extends JsObject {

    protected ElevationResponse() {

    }

    public ElevationResponse(LatLng location, double elevation) {
        jsObj = create(location.getJsObj(), elevation);
    }

    public native double getElevation() /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.elevation;
    }-*/;

    public native LatLng geLocation() /*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private static native JavaScriptObject create(JavaScriptObject location, double elevation) /*-{
		return new $wnd.google.maps.services.ElevationResponse(location,
				elevation);
    }-*/;

}
