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

import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.pilot.shared.client.core.JsObject;
import com.pilot.shared.client.core.JsoHelper;

/**
 * The response to a DistanceMatrixService request, consisting of the formatted
 * origin and destination addresses, and a sequence of
 * DistanceMatrixResponseRows, one for each corresponding origin address.
 * 
 */
public class DistanceMatrixResponse extends JsObject {

    public DistanceMatrixResponse() {
        jsObj = JsoHelper.createObject();
    }

    public DistanceMatrixResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The formatted destination addresses.
     * 
     * @return
     */
    public String[] getDestinationAdresses(){
    	JsArrayString values = _getDestinationAdresses();
    	String[] destinationAdresses = new String[values.length()];
    	for(int i = 0; i < values.length(); i++){
    		destinationAdresses[i] = values.get(i);
    	}
    	return destinationAdresses;
    }
    
    private native JsArrayString _getDestinationAdresses()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.destinationAddresses;
    }-*/;

    /**
     * The formatted origin addresses.
     * 
     * @return
     */
    public String[] getOriginAddresses(){
    	JsArrayString values = _getOriginAddresses();
    	String[] originAdresses = new String[values.length()];
    	for(int i = 0; i < values.length(); i++){
    		originAdresses[i] = values.get(i);
    	}
    	return originAdresses;
    }
    private native JsArrayString _getOriginAddresses()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.originAddresses;
    }-*/;

    /**
     * The rows of the matrix, corresponding to the origin addresses.
     * 
     * @return
     */

    public ArrayList<DistanceMatrixResponseRow> getRows() {
        ArrayList<DistanceMatrixResponseRow> rows = new ArrayList<DistanceMatrixResponseRow>();
        JsArray<JavaScriptObject> array = _getRows();
        for (int i = 0; i < array.length(); i++) {
            rows.add(new DistanceMatrixResponseRow(array.get(i)));
        }
        return rows;
    }

    private native JsArray<JavaScriptObject> _getRows()/*-{
		var jso = this.@com.pilot.shared.client.core.JsObject::getJsObj()();
		return jso.rows;
    }-*/;
    


}
