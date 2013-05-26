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

import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * Displays the panorama for a given LatLng or panorama ID. A StreetViewPanorama
 * object provides a Street View "viewer" which can be stand-alone within a
 * separate <div> or bound to a Map.
 * 
 */
public class StreetViewPanorama extends JsObject {

    public StreetViewPanorama() {
        jsObj = JsoHelper.createObject();
    }

    public StreetViewPanorama(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Creates a panorama.
     * 
     * @param node
     * @return
     */
    public StreetViewPanorama(Element node) {
        jsObj = create(node);
    }

    /**
     * Creates a panorama with the passed StreetViewPanoramaOptions.
     * 
     * @param node
     * @param options
     * @return
     */
    public StreetViewPanorama(Element node, StreetViewPanoramaOptions options) {
        jsObj = create(node, options.getJsObj());
    }

    /**
     * Returns the set of navigation links for the Street View panorama.
     * 
     * @return
     */

    public ArrayList<StreetViewLink> getLinks() {
        ArrayList<StreetViewLink> links = new ArrayList<StreetViewLink>();
        JsArray<JavaScriptObject> array = _getLinks();
        for (int i = 0; i < array.length(); i++) {
            links.add(new StreetViewLink(array.get(i)));
        }
        return links;
    }

    private final native JsArray<JavaScriptObject> _getLinks()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.getLinks();
    }-*/;

    /**
     * Returns the current panorama ID for the Street View panorama. This id is
     * stable within the browser's current session only.
     * 
     * @return
     */
    public final native String getPano()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.getPano();
    }-*/;

    /**
     * Returns the current LatLng position for the Street View panorama.
     * 
     * @return
     */
    public final native LatLng getPosition()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.getPosition();
		var toReturn = @com.emitrom.pilot.maps.client.base.LatLng::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns the current point of view for the Street View panorama.
     * 
     * @return
     */
    public final native StreetViewPov getPov()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = jso.getPov();
		var toReturn = @com.emitrom.pilot.maps.client.streetview.StreetViewPov::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns true if the panorama is visible. It does not specify whether
     * Street View imagery is available at the specified position.
     * 
     * @return
     */
    public final native boolean isVisible()/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return jso.getVisible();
    }-*/;

    /**
     * Sets the current panorama ID for the Street View panorama.
     * 
     * @param value
     */
    public final native void setPano(String value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.setPano(value);
    }-*/;

    /**
     * Sets the current LatLng position for the Street View panorama.
     * 
     * @param position
     */
    public final native void setPosition(LatLng position)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		this
				.setPosition(position.@com.pilot.shared.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets the point of view for the Street View panorama.
     * 
     * @param pov
     */
    public final native void setPov(StreetViewPov pov)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		this
				.setPov(pov.@com.pilot.shared.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Sets to true to make the panorama visible. If set to false, the panorama
     * will be hidden whether it is embedded in the map or in its own <div>
     * 
     * @param value
     */
    public final native void setVisible(boolean value)/*-{
		var jso = this.@com.pilot.shared.client.JsObject::getJsObj()();
		jso.setVisible(value);
    }-*/;

    private static native JavaScriptObject create(Element node)/*-{
		return new $wnd.google.maps.StreeViewPanorama(node);
    }-*/;

    private static native JavaScriptObject create(Element node, JavaScriptObject options)/*-{
		return new $wnd.google.maps.StreeViewPanorama(node, options);
    }-*/;

}
