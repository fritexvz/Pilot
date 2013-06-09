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
package com.emitrom.pilot.maps.client.core;

import com.emitrom.pilot.maps.client.GMap;

/**
 * Internally used. Do not rely of the existense of this class
 */
public class AbstractLayer extends MVCObject {

    protected AbstractLayer() {

    }

    /**
     * Returns the map on which this layer is displayed.
     * 
     * @return
     */
    public final native GMap getMap()/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		return jso.getMap();
    }-*/;

    /**
     * Renders the layer on the specified map. If map is set to null, the layer
     * will be removed.
     * 
     * @param map
     */
    public final native void setMap(GMap map)/*-{
		var jso = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		jso.setMap(map);
    }-*/;

}
