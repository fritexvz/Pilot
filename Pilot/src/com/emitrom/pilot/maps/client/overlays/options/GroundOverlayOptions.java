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

import com.emitrom.pilot.util.client.core.JsoHelper;

public class GroundOverlayOptions extends AbstractOption {

    public GroundOverlayOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * If true, the ground overlay can receive click events.
     * 
     * @param value
     */
    public native void setClickable(boolean value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.clickable = value;
    }-*/;

    public native boolean isClickable()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.clickable;
    }-*/;

}
