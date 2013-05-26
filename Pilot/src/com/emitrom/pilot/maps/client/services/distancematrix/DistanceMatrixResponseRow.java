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
package com.emitrom.pilot.maps.client.services.distancematrix;

import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * A row of the response to a DistanceMatrixService request, consisting of a
 * sequence of com.emitrom.gwt4.touch.maps.client.services.distancematrix.
 * DistanceMatrixResponseElements, one for each corresponding destination
 * address.
 * 
 */
public class DistanceMatrixResponseRow extends JsObject {

    public DistanceMatrixResponseRow() {
        jsObj = JsoHelper.createObject();
    }

    public DistanceMatrixResponseRow(JavaScriptObject obj) {
        jsObj = obj;
    }

    public ArrayList<DistanceMatrixResponseElement> getElements() {
        ArrayList<DistanceMatrixResponseElement> elements = new ArrayList<DistanceMatrixResponseElement>();
        JsArray<JavaScriptObject> array = _getElements();
        for (int i = 0; i < array.length(); i++) {
            elements.add(new DistanceMatrixResponseElement(array.get(i)));
        }
        return elements;
    }

    private native JsArray<JavaScriptObject> _getElements()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.elements;
    }-*/;

}
