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
package com.emitrom.pilot.maps.client.services.geocoder;

/**
 * Describes the type of location returned from a geocode.
 * 
 */
public enum GeocoderLocationType {

  APPPROXIMATE("APPPROXIMATE"), GEOMETRIC_CENTER("GEOMETRIC_CENTER"), RANGE_INTERPOLATED(
      "RANGE_INTERPOLATED"), ROOFTOP("ROOFTOP");

  private String value;

  public String getValue() {
    return value;
  }

  private GeocoderLocationType(String style) {
    value = createPeer(style);
  }

  private static native String createPeer(String style) /*-{
		return $wnd.google.maps.GeocoderLocationType[style];
  }-*/;

  public static native GeocoderLocationType fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.GeocoderLocationType.APPPROXIMATE:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderLocationType::APPPROXIMATE;

		case $wnd.google.maps.GeocoderLocationType.GEOMETRIC_CENTER:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderLocationType::GEOMETRIC_CENTER;

		case $wnd.google.maps.GeocoderLocationType.RANGE_INTERPOLATED:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderLocationType::RANGE_INTERPOLATED;

		case $wnd.google.maps.GeocoderLocationType.ROOFTOP:
			return @com.emitrom.pilot.maps.client.services.geocoder.GeocoderLocationType::ROOFTOP;

		}
  }-*/;

}
