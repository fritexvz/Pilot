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
package com.emitrom.pilot.maps.client.services;

/**
 * Describes the type of location returned from a geocode.
 * 
 */
public enum TravelMode {

  BICYCLING("BICYCLING"), DRIVING("DRIVING"), WALKING("WALKING");

  private String value;

  public String getValue() {
    return value;
  }

  private TravelMode(String mode) {
    value = createPeer(mode);
  }

  private static native String createPeer(String mode) /*-{
		return $wnd.google.maps.TravelMode[mode];
  }-*/;

  public static native TravelMode fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.TravelMode.BICYCLING:
			return @com.emitrom.pilot.maps.client.services.TravelMode::BICYCLING;

		case $wnd.google.maps.TravelMode.DRIVING:
			return @com.emitrom.pilot.maps.client.services.TravelMode::DRIVING;

		case $wnd.google.maps.TravelMode.WALKING:
			return @com.emitrom.pilot.maps.client.services.TravelMode::WALKING;
		}
  }-*/;

}
