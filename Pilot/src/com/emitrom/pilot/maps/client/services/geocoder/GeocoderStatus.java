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
package com.emitrom.pilot.maps.client.services.geocoder;

/**
 * The status returned by the Geocoder on the completion of a call to
 * <code>geocode()</code>.
 */

public enum GeocoderStatus {

    INVALID_REQUEST("INVALID_REQUEST"), ERROR("ERROR"), OK("OK"), OVER_QUERY_LIMIT("OVER_QUERY_LIMIT"), REQUEST_DENIED(
                    "REQUEST_DENIED"), UNKNOW_ERROR("UNKNOW_ERROR"), ZERO_RESULTS("ZERO_RESULTS");

    private String value;

    public String getValue() {
        return value;
    }

    private GeocoderStatus(String status) {
        value = createPeer(status);
    }

    private static native String createPeer(String status) /*-{
		return $wnd.google.maps.GeocoderStatus[status];
    }-*/;

    public static native GeocoderStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.GeocoderStatus.INVALID_REQUEST:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::INVALID_REQUEST;

		case $wnd.google.maps.GeocoderStatus.ERROR:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::ERROR;

		case $wnd.google.maps.GeocoderStatus.OK:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::OK;

		case $wnd.google.maps.GeocoderStatus.OVER_QUERY_LIMIT:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::OVER_QUERY_LIMIT;

		case $wnd.google.maps.GeocoderStatus.REQUEST_DENIED:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::REQUEST_DENIED;

		case $wnd.google.maps.GeocoderStatus.UNKNOW_ERROR:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::UNKNOW_ERROR;

		case $wnd.google.maps.GeocoderStatus.ZERO_RESULTS:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderStatus::ZERO_RESULTS;

		}
    }-*/;

}
