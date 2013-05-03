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
package com.emitrom.pilot.maps.client.services.elevation;

/**
 * The status returned by the ElevationService upon completion of an elevation
 * request.
 */

public enum ElevationStatus {

    INVALID_REQUEST("INVALID_REQUEST"), ERROR("ERROR"), OVER_QUERY_LIMIT("OVER_QUERY_LIMIT"), REQUEST_DENIED(
                    "REQUEST_DENIED"), UNKNOW_ERROR("UNKNOW_ERROR");

    private String value;

    public String getValue() {
        return value;
    }

    private ElevationStatus(String status) {
        value = createPeer(status);
    }

    private static native String createPeer(String status) /*-{
		return $wnd.google.maps.ElevationStatus[status];
    }-*/;

    public static native ElevationStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.ElevationStatus.INVALID_REQUEST:
			return @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::INVALID_REQUEST;

		case $wnd.google.maps.ElevationStatus.ERROR:
			return @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::ERROR;

		case $wnd.google.maps.ElevationStatus.OVER_QUERY_LIMIT:
			return @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::OVER_QUERY_LIMIT;

		case $wnd.google.maps.ElevationStatus.REQUEST_DENIED:
			return @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::REQUEST_DENIED;

		case $wnd.google.maps.ElevationStatus.UNKNOW_ERROR:
			return @com.emitrom.pilot.maps.client.services.elevation.ElevationStatus::UNKNOW_ERROR;

		}
    }-*/;

}
