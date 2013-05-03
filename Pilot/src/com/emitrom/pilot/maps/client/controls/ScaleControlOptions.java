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

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the map scale control.
 */
public class ScaleControlOptions extends JsObject {

    public ScaleControlOptions() {
        jsObj = JsoHelper.createObject();
    }

    public ScaleControlOptions(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Position id. Used to specify the position of the control on the map. The
     * default position is TOP_RIGHT.
     * 
     * @return
     */
    public ControlPosition getPosition() {
        return ControlPosition.fromValue(_getPosition());
    }

    private String _getPosition() {
        return JsoHelper.getAttribute(jsObj, "position");
    }

    public final void setPosition(ControlPosition position) {
        this.setPosition(position.getValue());
    }

    private void setPosition(String value) {
        JsoHelper.setAttribute(jsObj, "position", value);
    }

    /**
     * Style id. Used to select what style of map type control to display.
     * 
     * @param value
     */
    public final void setStyle(ScaleControlStyle style) {
        this.setStyle(style.getValue());
    }

    private void setStyle(String value) {
        JsoHelper.setAttribute(jsObj, "style", value);
    }

    /**
     * Style id. Used to select what style of map type control to display.
     * 
     * @param value
     */
    public ScaleControlStyle getStyle() {
        return ScaleControlStyle.fromValue(_getStyle());
    }

    private String _getStyle() {
        return JsoHelper.getAttribute(jsObj, "style");
    }
}
