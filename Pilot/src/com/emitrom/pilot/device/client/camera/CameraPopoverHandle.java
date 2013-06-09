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

package com.emitrom.pilot.device.client.camera;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;

/**
 * A handle to the popover dialog created by camera.getPicture.
 *
 * Supported platforms:
 * iOS
 */
public class CameraPopoverHandle extends JsObject
{

    /**
     * Constructor.
     */
    public CameraPopoverHandle()
    {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Set the position of the popover.
     * 
     * @param value
     */
    public native void setPosition(CameraPopoverOptions value)/*-{
        var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
        peer
                .setPosition(value.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
    }-*/;
}
