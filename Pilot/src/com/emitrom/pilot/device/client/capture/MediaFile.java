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
package com.emitrom.pilot.device.client.capture;

import java.util.ArrayList;
import java.util.Date;

import com.emitrom.pilot.device.client.core.handlers.capture.MediaFileFormatDataHandler;
import com.emitrom.pilot.util.client.core.JsObject;
import com.emitrom.pilot.util.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Encapsulates properties of a media capture file.
 */
public class MediaFile extends JsObject {

    private MediaFile(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The name of the file, without path information
     * 
     * @return
     */
    public String getName() {
        return JsoHelper.getAttribute(jsObj, "name");
    }

    /**
     * The full path of the file, including the name.
     * 
     * @return
     */
    public String getFullPath() {
        return JsoHelper.getAttribute(jsObj, "fullPath");
    }

    /**
     * The mime type
     * 
     * @return
     */
    public String getType() {
        return JsoHelper.getAttribute(jsObj, "type");
    }

    /**
     * The date and time that the file was last modified
     * 
     * @return
     */
    public native Date getLastModifiedDate()/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		return peer.lastModifiedDate;
    }-*/;

    /**
     * The size of the file, in bytes.
     * 
     * @return
     */
    public double getSize() {
        return JsoHelper.getAttributeAsDouble(jsObj, "size");
    }

    /**
     * Retrieves the format information of the media file
     * 
     * @param callBack
     */
    public native void getFormatData(MediaFileFormatDataHandler callBack)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer
				.getFormatData(
						$entry(function(data) {
							var object = @com.emitrom.pilot.device.client.capture.MediaFileData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.MediaFileFormatDataHandler::onSuccess(Lcom/emitrom/pilot/device/client/capture/MediaFileData;)(object);
						}),
						$entry(function() {
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.MediaFileFormatDataHandler::onError()();
						}));
    }-*/;

    private static ArrayList<MediaFile> fromJsArray(JsArray<JavaScriptObject> jsArray) {
        ArrayList<MediaFile> list = new ArrayList<MediaFile>();
        for (int i = 0; i < jsArray.length(); i++) {
            list.add(new MediaFile(jsArray.get(i)));
        }
        return list;
    }

}
