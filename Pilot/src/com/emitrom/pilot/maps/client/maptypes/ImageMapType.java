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

package com.emitrom.pilot.maps.client.maptypes;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class implements the MapType interface and is provided for rendering
 * image tiles.
 * 
 */
public class ImageMapType extends MapType {

    public ImageMapType() {
        jsObj = create();
    }

    public ImageMapType(ImageMapTypeOptions options) {
        jsObj = create(options.getJsObj());
    }

    /**
     * Constructs an ImageMapType using the provided ImageMapTypeOptions
     * 
     * @param options
     * @return
     */
    private static native JavaScriptObject create(JavaScriptObject options)/*-{
		return new $wnd.google.maps.ImageMapType(options);
    }-*/;

    private static native JavaScriptObject create()/*-{
		return new $wnd.google.maps.ImageMapType();
    }-*/;

}
