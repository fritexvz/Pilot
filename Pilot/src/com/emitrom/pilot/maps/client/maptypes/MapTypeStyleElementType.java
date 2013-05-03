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
package com.emitrom.pilot.maps.client.maptypes;

/**
 * Each MapTypeStyleElementType distinguishes between the different
 * representations of a feature.
 * 
 */
public enum MapTypeStyleElementType {

  ALL("all"), GEOMETRY("geometry"), LABELS("labels");

  private String value;

  public String getValue() {
    return value;
  }

  private MapTypeStyleElementType(String style) {
    value = createPeer(style);
  }

  private static native String createPeer(String style) /*-{
		return $wnd.google.maps.MapTypeStyleElementType[style];
  }-*/;

  public static native MapTypeStyleElementType fromValue(String value) /*-{
		switch (value) {

		case $wnd.google.maps.MapTypeStyleElementType.all:
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleElementType::ALL;

		case $wnd.google.maps.MapTypeStyleElementType.geometry:
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleElementType::GEOMETRY;

		case $wnd.google.maps.MapTypeStyleElementType.labels:
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleElementType::LABELS;
		}
  }-*/;

}
