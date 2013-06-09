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
package com.emitrom.pilot.util.client.core;

/**
 * Utility class
 */
public class Util {

    private Util() {

    }

    /**
     * Convenient method to detect if the application is running in the browser
     * Useful when Mobile web app are running inside a webview of a native
     * mobile application like Apache Cordova or Titanium
     * 
     * @return true if we are running in the regular browser
     */
    public native static boolean isWebMode()/*-{
		return ((typeof ($wnd) != 'undefined') || (typeof (window) != 'undefined'));
    }-*/;

}
