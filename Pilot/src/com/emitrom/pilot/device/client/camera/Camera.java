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
package com.emitrom.pilot.device.client.camera;

import com.emitrom.pilot.device.client.core.Module;
import com.emitrom.pilot.device.client.core.ModuleFactory;
import com.emitrom.pilot.device.client.core.handlers.camera.CameraCleanUpHandler;
import com.emitrom.pilot.device.client.core.handlers.camera.CameraPictureHandler;

/**
 * The camera module provides access to the device's default camera application
 * 
 * @see <a htef=http://docs.phonegap.com/en/2.2.0/cordova_camera_camera.md.html>
 * http://docs.phonegap.com/en/2.2.0/cordova_camera_camera.md.html</a>
 */
public class Camera extends Module {

    private static Camera instance = null;

    private Camera() {
        createPeer();
    }
    
    /**
     * Gets the single instance of the camera.
     * 
     * @return Camera
     */
    public static Camera get() {
        if (instance == null) {
            instance = new Camera();
        }
        return instance;
    }

    /**
     * Takes a photo using the camera or retrieves a photo from the device's album. 
     * 
     * @param callback
     */
    public native void getPicture(CameraPictureHandler callBack)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer
				.getPicture(
						$entry(function(data) {
							callBack.@com.emitrom.pilot.device.client.core.handlers.camera.CameraPictureHandler::onSuccess(Ljava/lang/String;)(data);
						}),
						$entry(function(message) {
							callBack.@com.emitrom.pilot.device.client.core.handlers.camera.CameraPictureHandler::onError(Ljava/lang/String;)(message);
						}));
    }-*/;

    /**
     * Takes a photo using the camera or retrieves a photo from the device's album.
     * 
     * @param callback
     * @param options
     */
    public native void getPicture(CameraPictureHandler callBack, CameraOptions options)/*-{
		var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
		peer
				.getPicture(
						$entry(function(data) {
							callBack.@com.emitrom.pilot.device.client.core.handlers.camera.CameraPictureHandler::onSuccess(Ljava/lang/String;)(data);
						}),
						$entry(function(message) {
							callBack.@com.emitrom.pilot.device.client.core.handlers.camera.CameraPictureHandler::onError(Ljava/lang/String;)(message);
						}),
						options.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * Cleans up the image files stored in the temporary storage location, when the function camera.getPicture is used with 
     * <code>Camera.sourceType = Camera.PictureSourceType.CAMERA and Camera.destinationType = Camera.DestinationType.FILE_URI</code>
     * 
     * Supported by iOS only.
     * 
     * @param callBack
     */
    public native void cleanUp(CameraCleanUpHandler callBack)/*-{
        var peer = this.@com.emitrom.pilot.util.client.core.JsObject::getJsObj()();
        peer
                .cleanup(
                        $entry(function() {
                            callBack.@com.emitrom.pilot.device.client.core.handlers.camera.CameraCleanUpHandler::onSuccess()();
                        }),
                        $entry(function(message) {
                            callBack.@com.emitrom.pilot.device.client.core.handlers.camera.CameraCleanUpHandler::onError(Ljava/lang/String;)(message);
                        }));
    }-*/;
    
    @Override
    public void createPeer() {
        jsObj = ModuleFactory.createNativeCamera();
    }
}
