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
package com.emitrom.pilot.device.client.file;

import com.emitrom.pilot.device.client.core.handlers.file.DirectoryReaderHandler;
import com.emitrom.pilot.util.client.core.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object that lists files and directories in a directory.
 */
public class DirectoryReader extends JsObject {

    DirectoryReader(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Read the entries in this directory.
     * 
     * @param handler
     */
    public native void readEntries(DirectoryReaderHandler handler)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer
				.readEntries(
						$entry(function(entries) {
							var entryList = @com.emitrom.pilot.device.client.file.EntryBase::fromJsArray(Lcom/google/gwt/core/client/JsArray;)(entries);
							handler.@com.emitrom.pilot.device.client.core.handlers.file.DirectoryReaderHandler::onSuccess(Ljava/util/List;)(entryList);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.file.FileError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.file.DirectoryReaderHandler::onError(Lcom/emitrom/pilot/device/client/file/FileError;)(error);
						}));
    }-*/;

}
