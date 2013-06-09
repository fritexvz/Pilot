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
package com.emitrom.pilot.maps.client.services.maxzoom;

/**
 * A MaxZoom result in JSON format retrieved from the MaxZoomService.
 */

public enum MaxZoomStatus {

  ERROR("ERROR"), OK("OK");
  private String value;

  public String getValue() {
    return value;
  }

  private MaxZoomStatus(String status) {
    value = createPeer(status);
  }

  private static native String createPeer(String status) /*-{
		return $wnd.google.maps.MaxZoomStatus[status];
  }-*/;

  public static native MaxZoomStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.MaxZoomStatus.ERROR:
			return @com.emitrom.pilot.maps.client.services.maxzoom.MaxZoomStatus::ERROR;

		case $wnd.google.maps.MaxZoomStatus.OK:
			return @com.emitrom.pilot.maps.client.services.maxzoom.MaxZoomStatus::OK;

		}
  }-*/;

}
