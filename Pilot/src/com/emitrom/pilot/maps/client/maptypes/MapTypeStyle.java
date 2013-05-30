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

import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

/**
 * The MapTypeStyle is a collection of selectors and stylers that define how the
 * map should be styled. Selectors specify what map elements should be affected
 * and stylers specify how those elements should be modified.
 * 
 */
public class MapTypeStyle extends JsObject {

    public MapTypeStyle() {
        jsObj = JsoHelper.createObject();
    }

    public MapTypeStyle(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Selects the element type to which a styler should be applied. An element
     * type distinguishes between the different representations of a feature.
     * Optional; if elementType is not specified, the value is assumed to be
     * 'all'.
     * 
     * @param element
     */
    public void setElementType(MapTypeStyleElementType type) {
        setElementType(type.getValue());
    }

    private native void setElementType(String element)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.elementType = element;
    }-*/;

    public MapTypeStyleElementType getElementType() {
        return MapTypeStyleElementType.fromValue(_getElementType());
    }

    private native String _getElementType()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.elementType;
    }-*/;

    /**
     * Selects the feature, or group of features, to which a styler should be
     * applied. Optional; if featureType is not specified, the value is assumed
     * to be 'all'.
     * 
     * @param value
     */
    public void setFeatureType(MapTypeStyleFeatureType type) {
        setFeatureType(type.getValue());
    }

    private native void setFeatureType(String value)/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		jso.featureType = value;
    }-*/;

    public MapTypeStyleFeatureType getFeatureType() {
        return MapTypeStyleFeatureType.fromValue(_getFeatureType());
    }

    private native String _getFeatureType()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.featureType;
    }-*/;

    public void setStyles(ArrayList<MapTypeStyler> stylers) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (MapTypeStyler styler : stylers) {
            array.push(styler.getJsObj());
        }
        _setStylers(array);
    }

    private native void _setStylers(JsArray<JavaScriptObject> values)/*-{
		this.stylers = values;
    }-*/;

}
