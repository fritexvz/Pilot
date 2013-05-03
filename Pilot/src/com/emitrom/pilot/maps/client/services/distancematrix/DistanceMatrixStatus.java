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
package com.emitrom.pilot.maps.client.services.distancematrix;

/**
 * The status returned by the distancematrix on the completion of a call to
 * <code>geocode()</code>.
 */

public enum DistanceMatrixStatus {

    INVALID_REQUEST("INVALID_REQUEST"), ERROR("ERROR"), OK("OK"), OVER_QUERY_LIMIT("OVER_QUERY_LIMIT"), REQUEST_DENIED(
                    "REQUEST_DENIED"), UNKNOW_ERROR("UNKNOW_ERROR"), MAX_DIMENSIONS_EXCEEDED("MAX_DIMENSIONS_EXCEEDED"), MAX_ELEMENTS_EXCEEDED(
                    "MAX_ELEMEENTS_EXCEEDED");

    private String value;

    public String getValue() {
        return value;
    }

    private DistanceMatrixStatus(String status) {
        value = createPeer(status);
    }

    private static native String createPeer(String status) /*-{
		return $wnd.google.maps.DistanceMatrixStatus[status];
    }-*/;

    public static native DistanceMatrixStatus fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.DistanceMatrixStatus.INVALID_REQUEST:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::INVALID_REQUEST;

		case $wnd.google.maps.DistanceMatrixStatus.ERROR:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::ERROR;

		case $wnd.google.maps.DistanceMatrixStatus.OK:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::OK;

		case $wnd.google.maps.DistanceMatrixStatus.OVER_QUERY_LIMIT:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::OVER_QUERY_LIMIT;

		case $wnd.google.maps.DistanceMatrixStatus.REQUEST_DENIED:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::REQUEST_DENIED;

		case $wnd.google.maps.DistanceMatrixStatus.UNKNOW_ERROR:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::UNKNOW_ERROR;

		case $wnd.google.maps.DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::MAX_DIMENSIONS_EXCEEDED;

		case $wnd.google.maps.DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED:
			return @com.emitrom.pilot.maps.client.services.distancematrix.DistanceMatrixStatus::MAX_ELEMENTS_EXCEEDED;

		}
    }-*/;

}
