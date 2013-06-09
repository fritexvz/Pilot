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
package com.emitrom.pilot.maps.client.services.directions;

/**
 * Describes the type of location returned from a geocode.
 * 
 */
public enum DirectionsStatus {

  INVALID_REQUEST("INVALID_REQUEST"), MAX_WAYPOINTS_EXCEEDED("MAX_WAYPOINTS_EXCEEDED"), NOT_FOUND(
      "NOT_FOUND"), OK("OK"), OVER_QUERY_LIMIT("OVER_QUERY_LIMIT"), REQUEST_DENIED("REQUEST_DENIED"), UNKNOW_ERROR(
      "UNKNOW_ERROR"), ZERO_RESULTS("ZERO_RESULTS");

  private String value;

  public String getValue() {
    return value;
  }

  private DirectionsStatus(String status) {
    value = createPeer(status);
  }

  private static native String createPeer(String status) /*-{
		return $wnd.google.maps.DirectionsStatus[status];
  }-*/;

  public static native DirectionsStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.DirectionsStatus.INVALID_REQUEST:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::INVALID_REQUEST;

		case $wnd.google.maps.DirectionsStatus.MAX_WAYPOINTS_EXCEEDED:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::MAX_WAYPOINTS_EXCEEDED;

		case $wnd.google.maps.DirectionsStatus.NOT_FOUND:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::NOT_FOUND;

		case $wnd.google.maps.DirectionsStatus.OK:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::OK;

		case $wnd.google.maps.DirectionsStatus.OVER_QUERY_LIMIT:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::OVER_QUERY_LIMIT;

		case $wnd.google.maps.DirectionsStatus.REQUEST_DENIED:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::REQUEST_DENIED;

		case $wnd.google.maps.DirectionsStatus.UNKNOW_ERROR:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::UNKNOW_ERROR;

		case $wnd.google.maps.DirectionsStatus.ZERO_RESULTS:
			return @com.emitrom.pilot.maps.client.services.directions.DirectionsStatus::ZERO_RESULTS;

		}
  }-*/;

}
