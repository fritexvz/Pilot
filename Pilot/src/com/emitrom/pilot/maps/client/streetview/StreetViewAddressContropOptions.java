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
package com.emitrom.pilot.maps.client.streetview;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.maps.client.controls.ControlPosition;

/**
 * Options for the rendering of the Street View address control.
 */
public class StreetViewAddressContropOptions extends JsObject {

    public StreetViewAddressContropOptions() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Position id. This id is used to specify the position of the control on
     * the map. The default position is ControlPosition.TOP_LEFT.
     * 
     * @param controlPosition
     */
    public void setControlPosition(ControlPosition controlPosition) {
        setControlPosition(controlPosition.getValue());
    }

    private native void setControlPosition(String value)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.controlPosition = value;
    }-*/;

}
