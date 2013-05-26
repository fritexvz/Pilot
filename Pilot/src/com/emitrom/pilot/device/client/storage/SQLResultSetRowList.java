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
package com.emitrom.pilot.device.client.storage;

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;

/**
 * When the executeSql method of a SQLTransaction is called it will invoke it's
 * callback with a SQLResultSet.
 * 
 */
public class SQLResultSetRowList extends JsObject {

    SQLResultSetRowList(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the number of rows returned by the SQL query
     * 
     * @return
     */
    public native int getLength()/*-{
		var peer = this.@com.pilot.shared.client.JsObject::getJsObj()();
		return peer.length;
    }-*/;

    /**
     * returns the row at the specified index. object.
     * 
     * @return
     */
    public native SQLResultSetRow getItem(int index)/*-{
		var peer = this.@com.pilot.shared.client.JsObject::getJsObj()();
		var obj = peer.item(index);
		var toReturn = @com.emitrom.pilot.device.client.storage.SQLResultSetRow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;
}
