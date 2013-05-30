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
package com.emitrom.pilot.maps.client.maptypes;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import java.util.ArrayList;

/**
 * Creates a MapType with a custom style
 * 
 */
public class StyledMapType extends JsObject {

    private static StyledMapType create(ArrayList<MapTypeStyle> mapTypeStyles, ArrayList<StyledMapTypeOptions> options) {
        JsArray<JavaScriptObject> styles = JsArray.createArray().cast();
        JsArray<JavaScriptObject> opts = JsArray.createArray().cast();
        for (MapTypeStyle style : mapTypeStyles) {
            styles.push(style.getJsObj());
        }
        for (StyledMapTypeOptions option : options) {
            opts.push(option.getJsObj());
        }
        return instance(create(styles, opts));

    }

    private StyledMapType(JavaScriptObject obj) {
        jsObj = obj;
    }

    private static StyledMapType instance(JavaScriptObject obj) {
        return new StyledMapType(obj);
    }

    /**
     * Creates a styled MapType with the specified options. The StyledMapType
     * takes an array of MapTypeStyles, where each MapTypeStyle is applied to
     * the map consecutively. A later MapTypeStyle that applies the same
     * MapTypeStylers to the same selectors as an earlier MapTypeStyle will
     * override the earlier MapTypeStyle.
     * 
     * @param styles
     * @param options
     * @return
     */

    private static native JavaScriptObject create(JsArray<JavaScriptObject> styles, JsArray<JavaScriptObject> options)/*-{
		return new $wnd.google.maps.StyledMapType(styles, options);
    }-*/;

}
