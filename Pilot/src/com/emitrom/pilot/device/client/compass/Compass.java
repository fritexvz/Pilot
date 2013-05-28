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
package com.emitrom.pilot.device.client.compass;

import com.emitrom.pilot.device.client.core.Module;
import com.emitrom.pilot.device.client.core.ModuleFactory;
import com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler;

/**
 * Obtains the direction that the device is pointing.
 * 
 * @see <a href=http://docs.phonegap.com/en/2.7.0/cordova_compass_compass.md.html>
 * http://docs.phonegap.com/en/2.7.0/cordova_compass_compass.md.html</a>
 */
public class Compass extends Module {

    private static Compass instance = null;

    /**
     * Gets the unique Compass instance.
     * 
     * @return Compass
     */
    public static Compass get() {
        if (instance == null) {
            instance = new Compass();
        }
        return instance;
    }

    private Compass() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = ModuleFactory.createNativeCompass();
    }

    /**
     * Gets the current compass heading.
     * 
     * @param callBack
     */
    public native void getCurrentHeading(CompassHandler callBack)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		peer
				.getCurrentHeading(
						$entry(function(heading) {
							var headingObject = @com.emitrom.pilot.device.client.compass.CompassHeading::new(Lcom/google/gwt/core/client/JavaScriptObject;)(heading);
							callBack.@com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler::onSuccess(Lcom/emitrom/pilot/device/client/compass/CompassHeading;)(headingObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.compass.CompassError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.CaptureHandler::onError(Lcom/emitrom/pilot/device/client/capture/CaptureError;)(errorObject);
						}));

    }-*/;

    /**
     * Gets the current compass heading, with the specified CompassOptions.
     * 
     * frequency: How often to retrieve the compass heading in milliseconds.
     * (Default: 100) filter: The change in degrees required to initiate a
     * watchHeading success callback.
     * 
     * Note: filter is not supported in Windows Phone 7 nor in Android.
     * 
     * @param callBack
     * @param options
     */
    public native void getCurrentHeading(CompassHandler callBack, CompassOptions options)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		peer
				.getCurrentHeading(
						$entry(function(heading) {
							var headingObject = @com.emitrom.pilot.device.client.compass.CompassHeading::new(Lcom/google/gwt/core/client/JavaScriptObject;)(heading);
							callBack.@com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler::onSuccess(Lcom/emitrom/pilot/device/client/compass/CompassHeading;)(headingObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.compass.CompassError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.CaptureHandler::onError(Lcom/emitrom/pilot/device/client/capture/CaptureError;)(errorObject);
						}),
						options.@com.pilot.shared.client.core.JsObject::getJsObj()());

    }-*/;

    /**
     * Gets the device's current heading at a regular interval. Each time the
     * heading is retrieved, the callback function is executed.
     * 
     * The returned watch ID references references the compass watch interval.
     * The watch ID can be used with the clearWatch method to stop watching the
     * compass.
     * 
     * @param callBack
     * @return int
     */
    public native int watchHeading(CompassHandler callBack)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();

		return peer
				.watchHeading(
						$entry(function(heading) {
							var headingObject = @com.emitrom.pilot.device.client.compass.CompassHeading::new(Lcom/google/gwt/core/client/JavaScriptObject;)(heading);
							callBack.@com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler::onSuccess(Lcom/emitrom/pilot/device/client/compass/CompassHeading;)(headingObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.compass.CompassError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.CaptureHandler::onError(Lcom/emitrom/pilot/device/client/capture/CaptureError;)(errorObject);
						}));

    }-*/;

    /**
     * Gets the device's current heading at a regular interval. Each time the
     * heading is retrieved, the callback function is executed. Specify the
     * interval in milliseconds via the frequency parameter in the
     * CompassOptions object.
     * 
     * The returned watch ID references references the compass watch interval.
     * The watch ID can be used with the clearWatch method to stop watching the
     * compass.
     * 
     * @param callBack
     * @param options
     * @return int
     */
    public native int watchHeading(CompassHandler callBack, CompassOptions options)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();

		return peer
				.watchHeading(
						$entry(function(heading) {
							var headingObject = @com.emitrom.pilot.device.client.compass.CompassHeading::new(Lcom/google/gwt/core/client/JavaScriptObject;)(heading);
							callBack.@com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler::onSuccess(Lcom/emitrom/pilot/device/client/compass/CompassHeading;)(headingObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.compass.CompassError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.CaptureHandler::onError(Lcom/emitrom/pilot/device/client/capture/CaptureError;)(errorObject);
						}),
						options.@com.pilot.shared.client.core.JsObject::getJsObj()());

    }-*/;

    /**
     * Stops watching the compass referenced by the watch ID parameter.
     * 
     * @param watchId
     */
    public native void clearWatch(int watchId)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		peer.clearWatch(watchId);
    }-*/;

    public native int watchHeadingFilter(CompassHandler callBack)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return peer
				.watchHeadingFilter(
						$entry(function(heading) {
							var headingObject = @com.emitrom.pilot.device.client.compass.CompassHeading::new(Lcom/google/gwt/core/client/JavaScriptObject;)(heading);
							callBack.@com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler::onSuccess(Lcom/emitrom/pilot/device/client/compass/CompassHeading;)(headingObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.compass.CompassError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.CaptureHandler::onError(Lcom/emitrom/pilot/device/client/capture/CaptureError;)(errorObject);
						}));

    }-*/;

    public native int watchHeadingFilter(CompassHandler callBack, CompassOptions options)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return peer
				.watchHeadingFilter(
						$entry(function(heading) {
							var headingObject = @com.emitrom.pilot.device.client.compass.CompassHeading::new(Lcom/google/gwt/core/client/JavaScriptObject;)(heading);
							callBack.@com.emitrom.pilot.device.client.core.handlers.compass.CompassHandler::onSuccess(Lcom/emitrom/pilot/device/client/compass/CompassHeading;)(headingObject);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.compass.CompassError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							callBack.@com.emitrom.pilot.device.client.core.handlers.capture.CaptureHandler::onError(Lcom/emitrom/pilot/device/client/capture/CaptureError;)(errorObject);
						}),
						options.@com.pilot.shared.client.core.JsObject::getJsObj()());

    }-*/;

    public native void clearWatchFilter(int watchId)/*-{
		var peer = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		peer.clearWatchFilter(watchId);
    }-*/;

}
