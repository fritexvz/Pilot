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

import com.emitrom.pilot.maps.client.core.MVCObject;
import com.emitrom.pilot.maps.client.core.MapTypeId;
import com.emitrom.pilot.util.client.core.JsoHelper;

public class MapTypeRegistry extends MVCObject {

    /**
     * The MapTypeRegistry holds the collection of custom map types available to
     * the map for its use. The API consults this registry when providing the
     * list of available map types within controls, for example
     * 
     * @return
     */
    public MapTypeRegistry() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Sets the registry to associate the passed string identifier with the
     * passed MapType.
     * 
     * @param id
     * @param mapType
     */
    public void set(MapTypeId id, MapType mapType) {
        set(id.getValue(), mapType);
    }

    private native void set(String id, String mapType)/*-{
		var jso = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		jso.set(id, mapType);
    }-*/;

}
