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
package com.emitrom.pilot.maps.client.streetview;

import java.util.ArrayList;

import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The representation of a panorama returned from the provider defined using
 * registerPanoProvider.
 * 
 * 
 */
public class StreetviewPanoramaData extends JsObject {

    public StreetviewPanoramaData() {
        jsObj = JsoHelper.createObject();
    }

    public StreetviewPanoramaData(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Specifies the copyright text for this panorama.
     * 
     * @return
     */
    public native void setCopyright(String value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.copyright = value;
    }-*/;

    public native String getCopyright()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.copyright;
    }-*/;

    /**
     * Specifies the navigational links to adjacent panoramas.
     * 
     * @param values
     */

    public void setLinks(ArrayList<StreetViewLink> links) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (StreetViewLink link : links) {
            values.push(link.getJsObj());
        }
        _setLinks(values);
    }

    public native void _setLinks(JsArray<JavaScriptObject> values)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.links = values;
    }-*/;

    public ArrayList<StreetViewLink> getLinks() {
        ArrayList<StreetViewLink> links = new ArrayList<StreetViewLink>();
        JsArray<JavaScriptObject> array = _getLinks();
        for (int i = 0; i < array.length(); i++) {
            links.add(new StreetViewLink(array.get(i)));
        }
        return links;
    }

    private native JsArray<JavaScriptObject> _getLinks()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return jso.getLinks();
    }-*/;

    /**
     * Specifies the location meta-data for this panorama.
     * 
     * @param value
     */
    public native void setLocation(StreetViewLocation value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.location = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		;
    }-*/;

    public native StreetViewLocation getLocation()/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		var obj = jso.location;
		var toReturn = @com.emitrom.pilot.maps.client.streetview.StreetViewLocation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Specifies the custom tiles for this panorama.
     * 
     * @param value
     */
    public native void setTiles(StreetViewTileData value)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.tiles = value.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
    }-*/;

    public native StreetViewTileData getTiles()/*-{
		return this.tiles;
    }-*/;

}
