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
package com.emitrom.pilot.maps.client.controls;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the Street View pegman control on the map
 */
public class StreetViewControlOptions extends JsObject {

    public StreetViewControlOptions() {
        jsObj = JsoHelper.createObject();
    }

    public StreetViewControlOptions(JavaScriptObject jso) {
        super(jso);
    }

    /**
     * Position id. Used to specify the position of the control on the map. The
     * default position is embedded within the navigation (zoom and pan)
     * controls. If this position is empty or the same as that specified in the
     * zoomControlOptions or panControlOptions, the Street View control will be
     * displayed as part of the navigation controls. Otherwise, it will be
     * displayed separately.
     * 
     */

    public ControlPosition getPosition() {
        return ControlPosition.fromValue(_getPosition());
    }

    private String _getPosition() {
        return JsoHelper.getAttribute(jsObj, "position");
    }

    /**
     * Position id. Used to specify the position of the control on the map. The
     * default position is embedded within the navigation (zoom and pan)
     * controls. If this position is empty or the same as that specified in the
     * zoomControlOptions or panControlOptions, the Street View control will be
     * displayed as part of the navigation controls. Otherwise, it will be
     * displayed separately.
     * 
     * @param position
     */
    public void setPosition(ControlPosition position) {
        this.setPosition(position.getValue());
    }

    private void setPosition(String value) {
        JsoHelper.setAttribute(jsObj, "position", value);
    }
}
