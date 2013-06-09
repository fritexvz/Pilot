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

package com.emitrom.pilot.maps.client.controls;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Options for the rendering of the map scale control.
 */
public class ZoomControlOptions extends JsObject {

    public ZoomControlOptions() {
        jsObj = JsoHelper.createObject();
    }

    public ZoomControlOptions(JavaScriptObject jso) {
        super(jso);
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
     * @param style
     */
    public final void setStyle(ZoomControlStyle style) {
        this.setStyle(style.getValue());
    }

    private void setStyle(String value) {
        JsoHelper.setAttribute(jsObj, "style", value);
    }

    /**
     * Style id. Used to select what style of map type control to display.
     * 
     */
    public ZoomControlStyle getStyle() {
        return ZoomControlStyle.fromValue(_getStyle());
    }

    private String _getStyle() {
        return JsoHelper.getAttribute(jsObj, "style");
    }

}
