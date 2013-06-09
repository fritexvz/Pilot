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
package com.emitrom.pilot.maps.client.services.streetview;

/**
 * The status returned by the streetviewService upon completion of an streetview
 * request.
 */

public enum StreetViewStatus {

  OK("OK"), ERROR("ERROR"), ZERO_RESULTS("ZERO_RESULTS"), UNKNOW_ERROR("UNKNOW_ERROR");

  private String value;

  public String getValue() {
    return value;
  }

  private StreetViewStatus(String status) {
    value = createPeer(status);
  }

  private static native String createPeer(String status) /*-{
		return $wnd.google.maps.StreetViewStatus[status];
  }-*/;

  public static native StreetViewStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.StreetViewStatus.OK:
			return @com.emitrom.pilot.maps.client.services.streetview.StreetViewStatus::OK;

		case $wnd.google.maps.StreetViewStatus.ZERO_RESULTS:
			return @com.emitrom.pilot.maps.client.services.streetview.StreetViewStatus::ZERO_RESULTS;

		case $wnd.google.maps.StreetViewStatus.UNKNOW_ERROR:
			return @com.emitrom.pilot.maps.client.services.streetview.StreetViewStatus::UNKNOW_ERROR;

		}
  }-*/;

}
