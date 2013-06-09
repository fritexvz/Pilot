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
package com.emitrom.pilot.device.client.storage;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.device.client.core.handlers.storage.SQLTransactionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class SQLTransaction extends JsObject {

    SQLTransaction(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void executeSql(String sql)/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		peer.executeSql(sql);
    }-*/;

    public native void executeSql(String sql, SQLTransactionHandler handler)/*-{
		var peer = this.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()();
		peer
				.executeSql(
						sql,
						[],
						$entry(function(tx, res) {
							var transaction = @com.emitrom.pilot.device.client.storage.SQLTransaction::new(Lcom/google/gwt/core/client/JavaScriptObject;)(tx);
							var results = @com.emitrom.pilot.device.client.storage.SQLResultSet::new(Lcom/google/gwt/core/client/JavaScriptObject;)(res);
							handler.@com.emitrom.pilot.device.client.core.handlers.storage.SQLTransactionHandler::onSuccess(Lcom/emitrom/pilot/device/client/storage/SQLTransaction;Lcom/emitrom/pilot/device/client/storage/SQLResultSet;)(transaction,results);
						}),
						$entry(function(error) {
							var errorObject = @com.emitrom.pilot.device.client.storage.SQLError::new(Lcom/google/gwt/core/client/JavaScriptObject;)(error);
							handler.@com.emitrom.pilot.device.client.core.handlers.storage.SQLTransactionHandler::onError(Lcom/emitrom/pilot/device/client/storage/SQLError;)(errorObject);
						}));
    }-*/;

}
