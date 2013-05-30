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
package com.emitrom.pilot.maps.client.core;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A mutable MVC Array.
 */
public class MVCArray extends JsObject {

    public MVCArray() {
        jsObj = create();
    }

    public MVCArray(JavaScriptObject obj) {
        super(obj);
    }

    public MVCArray(JsArray<?> array) {
        jsObj = create(array);
    }

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.MVCArray();
    }-*/;

    private static native JavaScriptObject create(JsArray<?> array)/*-{
		return new $wnd.google.maps.MVCArray(array);
    }-*/;

    /**
     * Removes all elements from the array.
     */
    public final native void clear()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.clear();
    }-*/;

    /**
     * Returns a reference to the underlying Array. Warning: if the Array is
     * mutated, no events will be fired by this object.
     * 
     * @return
     */
    public final native JsArray<?> getArray()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getArray();
    }-*/;

    /**
     * Get an element at the specified index.
     * 
     * @param <T>
     * @param index
     * @return
     */
    public final native <T> T getAt(int index)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getAt(index);
    }-*/;

    /**
     * Returns the number of elements in this array.
     * 
     * @return
     */
    public final native int getLength()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getLength();
    }-*/;

    /**
     * Inserts an element at the specified index.
     * 
     * @param index
     * @param element
     */
    public final native void insertAt(int index, Object element)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.insertAt(index, element);
    }-*/;

    /**
     * Removes the last element of the array and returns that element.
     * 
     * @param <T>
     * @return
     */
    public final native <T> T pop()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.pop();
    }-*/;

    /**
     * Adds one element to the end of the array and returns the new length of
     * the array.
     * 
     * @param element
     */
    public final native void push(Object element)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.push(element);
    }-*/;
    
    
    /**
     * Adds one element to the end of the array and returns the new length of
     * the array.
     * 
     * @param element
     */
    public final native void push(JsObject element)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.push(element.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Removes an element from the specified index.
     * 
     * @param index
     */
    public final native void removeAt(int index)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.removeAt(index);
    }-*/;

    /**
     * Sets an element at the specified index.
     * 
     * @param index
     * @param element
     */
    public final native void setAt(int index, Object element)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setAt(index, element);
    }-*/;

}
