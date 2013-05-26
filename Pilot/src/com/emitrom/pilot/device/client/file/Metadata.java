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
package com.emitrom.pilot.device.client.file;

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;
import com.pilot.shared.client.JsObject;
import com.pilot.shared.client.JsoHelper;

/**
 * This class supplies information about the state of a file or directory.
 * 
 */
public class Metadata extends JsObject {

    Metadata(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * This is the time at which the file or directory was last modified
     * 
     * @return
     */
    public Date getModificationTime() {
        return JsoHelper.getAttributeAsDate(jsObj, "modificationTime");
    }
    
    /**
     * only the "com.apple.MobileBackup" extended attribute is supported.
     * Set the value to 1 to NOT enable the file to be backed up by iCloud. 
     * Set the value to 0 to re-enable the file to be backed up by iCloud.
     * 
     * @param value
     */
    public void setMobileBackup(boolean value) {
        // Set the value to 1 to NOT enable the file to be backed up by iCloud. 
        // Set the value to 0 to re-enable the file to be backed up by iCloud.
        JsoHelper.setAttribute(jsObj, "com.apple.MobileBackup", value? 0: 1);
    }
    
    /**
     * Gets Apple-only MobileBackup setting.
     * 
     * @return boolean
     */
    public boolean isMobileBackup() {
        return JsoHelper.getAttributeAsInt(jsObj, "com.apple.MobileBackup") == 0;
    }
}
