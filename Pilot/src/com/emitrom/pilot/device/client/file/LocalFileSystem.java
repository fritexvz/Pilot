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

import com.emitrom.pilot.device.client.core.handlers.file.LocalFileSystemHandler;
import com.emitrom.pilot.device.client.core.handlers.file.LocalFileSystemURIHandler;

/**
 * This object provides a way to obtain root file systems.
 * 
 */
public class LocalFileSystem {

    private LocalFileSystem() {

    }

    /**
     * Requests a filesystem.
     * 
     * @param type
     * @param callBack
     */
    public static void requestFileSystem(LocalFileSystemType type, LocalFileSystemHandler callBack) {
        _requestFileSystem(type.getValue(), callBack);
    }

    private static native void _requestFileSystem(int type, LocalFileSystemHandler handler)/*-{
		$wnd
				.requestFileSystem(
						type,
						0,
						$entry(function(fs) {
							var fileSystem = @com.emitrom.pilot.device.client.file.FileSystem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(fs);
							handler.@com.emitrom.pilot.device.client.core.handlers.file.LocalFileSystemHandler::onSuccess(Lcom/emitrom/pilot/device/client/file/FileSystem;)(fileSystem);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.file.FileError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.file.LocalFileSystemHandler::onError(Lcom/emitrom/pilot/device/client/file/FileError;)(errorObject);
						}));
    }-*/;

    /**
     * Retrieve a FileEntry using local URI
     * 
     * @param type
     * @param handler
     */
    public static native void resolveLocalFileSystemURI(int type, LocalFileSystemURIHandler handler)/*-{
		$wnd
				.resolveLocalFileSystemURI(
						type,
						0,
						$entry(function(entry) {
							var fileEntry = @com.emitrom.pilot.device.client.file.EntryBase::new(Lcom/google/gwt/core/client/JavaScriptObject;)(entry);
							handler.@com.emitrom.pilot.device.client.core.handlers.file.LocalFileSystemURIHandler::onSuccess(Lcom/emitrom/pilot/device/client/file/EntryBase;)(fileEntry);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.file.FileError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.file.LocalFileSystemURIHandler::onError(Lcom/emitrom/pilot/device/client/file/FileError;)(errorObject);
						}));
    }-*/;

}
