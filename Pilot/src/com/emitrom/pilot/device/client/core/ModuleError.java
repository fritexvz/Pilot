/*
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
package com.emitrom.pilot.device.client.core;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.emitrom.pilot.util.client.core.Attributes;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Generic error that contains a message.
 */
public class ModuleError extends JsObject {
    protected ModuleError(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the error message.
     * 
     * @return String
     */
    public String getMessage() {
        return JsoHelper.getAttribute(jsObj, Attributes.MESSAGE.getValue());
    }
}
