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
package com.emitrom.pilot.maps.client.geom;

import java.util.ArrayList;

import com.emitrom.pilot.maps.client.base.LatLng;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Utility functions for computing geodesic angles, distances and areas. The
 * default radius is Earth's radius of 6378137 meters.
 */
public class Spherical {

    private Spherical() {

    }

    /**
     * Computes the area of the given loop. Loops must be closed.
     * 
     * @param values
     * @return
     */

    public static double computeArea(ArrayList<LatLng> values) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return computeArea(array);
    }

    private static native double computeArea(JsArray<JavaScriptObject> values)/*-{
		return $wnd.google.maps.geometry.spherical.computeArea(values);
    }-*/;

    /**
     * Computes the area of the given loop. Loops must be closed.
     * 
     * @param values
     * @return
     */
    public static double computeArea(ArrayList<LatLng> values, double radius) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return computeArea(array, radius);
    }

    public static native double computeArea(JsArray<JavaScriptObject> values, double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computeArea(values, radius);
    }-*/;

    /**
     * Computes the distance between two LatLngs.
     * 
     * @param values
     * @return
     */
    public static double computeDistanceBetween(LatLng from, LatLng to) {
        return computeDistanceBetween(from.getJsObj(), to.getJsObj());
    }

    private static native double computeDistanceBetween(JavaScriptObject from, JavaScriptObject to)/*-{
		return $wnd.google.maps.geometry.spherical.computeDistanceBetween(from,
				to);
    }-*/;

    /**
     * Computes the distance between two LatLngs.
     * 
     * @return
     */
    public static double computeDistanceBetween(LatLng from, LatLng to, double radius) {
        return computeDistanceBetween(from.getJsObj(), to.getJsObj(), radius);
    }

    private static native double computeDistanceBetween(JavaScriptObject from, JavaScriptObject to, double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computeDistanceBetween(from,
				to, radius);
    }-*/;

    /**
     * Computes the heading from one LatLng to another LatLng.
     * 
     * @return
     */
    public static double computeHeading(LatLng from, LatLng to) {
        return computeHeading(from.getJsObj(), to.getJsObj());
    }

    private static native double computeHeading(JavaScriptObject from, JavaScriptObject to)/*-{
		return $wnd.google.maps.geometry.spherical.computeHeading(from, to);
    }-*/;

    /**
     * Computes the length of the given path.
     * 
     * @param values
     * @return
     */
    public static double computeLength(ArrayList<LatLng> values) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return computeLength(array);
    }

    private static native double computeLength(JsArray<JavaScriptObject> values)/*-{
		return $wnd.google.maps.geometry.spherical.computeLength(values);
    }-*/;

    /**
     * Computes the length of the given path.
     * 
     * @param values
     * @return
     */
    public static double computeLength(ArrayList<LatLng> values, double radius) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return computeLength(array, radius);
    }

    private static native double computeLength(JsArray<JavaScriptObject> values, double radius)/*-{
		return $wnd.google.maps.geometry.spherical
				.computeLength(values, radius);
    }-*/;

    /**
     * Computes the LatLng produced by starting from a given LatLng and heading
     * a given distance.
     * 
     * @param from
     * @param distance
     * @param heading
     * @return
     */

    public static LatLng computeOffset(LatLng from, double distance, double heading) {
        return LatLng.instance(computeOffset(from.getJsObj(), distance, heading));

    }

    private static native JavaScriptObject computeOffset(JavaScriptObject from, double distance, double heading)/*-{
		return $wnd.google.maps.geometry.spherical.computeOffset(from,
				distance, heading);
    }-*/;

    /**
     * Computes the LatLng produced by starting from a given LatLng and heading
     * a given distance.
     * 
     * @param from
     * @param distance
     * @param heading
     * @return
     */
    public static LatLng computeOffset(LatLng from, double distance, double heading, double radius) {
        return LatLng.instance(computeOffset(from.getJsObj(), distance, heading, radius));

    }

    private static native JavaScriptObject computeOffset(JavaScriptObject from, double distance, double heading,
                    double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computeOffset(from,
				distance, heading, radius);
    }-*/;

    /**
     * Computes the signed area of the given loop. Loops must be closed. The
     * signed area may be used to determine the orientation of a loop.
     * 
     * @param values
     * @return
     */
    public static double computeSignedArea(ArrayList<LatLng> values) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return computeSignedArea(array);
    }

    private static native double computeSignedArea(JsArray<JavaScriptObject> values)/*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(values);
    }-*/;

    /**
     * Computes the signed area of the given loop. Loops must be closed. The
     * signed area may be used to determine the orientation of a loop.
     * 
     * @param values
     * @return
     */
    public static double computeSignedArea(ArrayList<LatLng> values, double radius) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (LatLng latLgn : values) {
            array.push(latLgn.getJsObj());
        }
        return computeSignedArea(array, radius);
    }

    private static native double computeSignedArea(JsArray<JavaScriptObject> values, double radius)/*-{
		return $wnd.google.maps.geometry.spherical.computeSignedArea(values,
				radius);
    }-*/;

    /**
     * Travels a fraction of the way from one LatLng to another LatLng.
     * 
     * @param from
     * @param to
     * @param fraction
     * @return
     */
    public static double interpolate(LatLng from, LatLng to, double fraction) {
        return interpolate(from.getJsObj(), to.getJsObj(), fraction);
    }

    private static native double interpolate(JavaScriptObject from, JavaScriptObject to, double fraction)/*-{
		return $wnd.google.maps.geometry.spherical.interpolate(from, to,
				fraction);
    }-*/;
}
