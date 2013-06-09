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
package com.emitrom.pilot.maps.client.maptypes;

/**
 * Possible values for feature types. Specify these values as strings, i.e.
 * 'administrative' or 'poi.park'. Stylers applied to a parent feature type
 * automaticADMINISTRATIVEy apply to ADMINISTRATIVE child feature types. Note
 * however that parent features may include some additional features that are
 * not included in one of their child feature types.
 * 
 */
public enum MapTypeStyleFeatureType {

  ADMINISTRATIVE("administrative"), ADMINISTRATIVE_COUNTRY("administrative.country"), ADMINISTRATIVE_LAND_PARCEL(
      "ADMINISTRATIVE_LAND_PARCEL"), ADMINISTRATIVE_LOCALITY("administrative.locality"), ADMINISTRATIVE_NEIGHBORHOOD(
      "administrative.neighborhood"), ADMINISTRATIVE_PROVINCE("administrative.province"), ALL("all"), LANDSCAPE(
      "landscape"), LANDSCAPE_MAN_MADE("landscape_man_made"), LANDSCAPE_NATURAL("landscape.natural"), POI(
      "poi"), POI_ATTRACTION("poi.attraction"), POI_BUSINESS("poi.business"), POI_GOVERNMENT(
      "poi.government"), POI_MEDICAL("poi.medical"), POI_PARK("poi.park"), POI_PLACE_OF_WORSHIP(
      "poi.place_of_worship"), POI_SCHOOL("poi.school"), POI_SPORTS_COMPLEX("poi.sports_complex"), ROAD(
      "road"), ROAD_ARTERIAL("road.arterial"), ROAD_HIGHWAY("road.highway"), ROAD_LOCAL(
      "road.local"), TRANSIT("transit"), TRANSIT_LINE("transit.line"), TRANSIT_STATION(
      "transit.station"), TRANSIT_STATION_BUS("transit.station.bus"), TRANSIT_STATION_AIRPORT(
      "transit.station.airport"), TRANSIT_STATION_RAIL("transit.station.rail"), WATER("water");

  private String value;

  public String getValue() {
    return value;
  }

  private MapTypeStyleFeatureType(String style) {
    value = createPeer(style);
  }

  private static native String createPeer(String style) /*-{
		return $wnd.google.maps.MapTypeStyleFeatureType[style];
  }-*/;

  public static native MapTypeStyleFeatureType fromValue(String value) /*-{
		switch (value) {

		case 'administrative':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ADMINISTRATIVE;

		case 'administrative.country':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ADMINISTRATIVE_COUNTRY;

		case 'administrative.land_parcel':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ADMINISTRATIVE_LAND_PARCEL;

		case 'administrative.locality':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ADMINISTRATIVE_LOCALITY;

		case 'administrative.neighborhood':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ADMINISTRATIVE_NEIGHBORHOOD;

		case 'administrative.province':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ADMINISTRATIVE_PROVINCE;

		case 'all':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ALL;

		case 'landscape':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::LANDSCAPE;

		case 'landscape.man_made':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::LANDSCAPE_MAN_MADE;

		case 'landscape.natural':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::LANDSCAPE_NATURAL;

		case 'poi':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI;

		case 'poi.attraction':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_ATTRACTION;

		case 'poi.business':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_BUSINESS;

		case 'poi.governement':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_GOVERNMENT;

		case 'poi.medical':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_MEDICAL;

		case 'poi.park':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_PARK;

		case 'poi.place_of_worship':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_PLACE_OF_WORSHIP;

		case 'poi.school':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_SCHOOL;

		case 'poi.sports_complex':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::POI_SPORTS_COMPLEX;

		case 'road':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ROAD;

		case 'road.arterial':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ROAD_ARTERIAL;

		case 'road.highway':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ROAD_HIGHWAY;

		case 'road.local':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::ROAD_LOCAL;

		case 'transit':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::TRANSIT;

		case 'transit_line':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::TRANSIT_LINE;

		case 'transit.station':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::TRANSIT_STATION;

		case 'transit.station.airport':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::TRANSIT_STATION_AIRPORT;

		case 'transit.station.bus':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::TRANSIT_STATION_BUS;

		case 'transit.station.rail':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::TRANSIT_STATION_RAIL;

		case 'water':
			return @com.emitrom.pilot.maps.client.maptypes.MapTypeStyleFeatureType::WATER;

		}
  }-*/;

}
