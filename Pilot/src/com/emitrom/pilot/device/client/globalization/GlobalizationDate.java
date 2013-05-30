/*
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
package com.emitrom.pilot.device.client.globalization;

import com.emitrom.pilot.core.shared.client.core.JsObject;
import com.emitrom.pilot.core.shared.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class GlobalizationDate extends JsObject {

    GlobalizationDate(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Gets the this date as a localized string.
     * 
     * @return String
     */
    public String asString() {
        return JsoHelper.getAttribute(jsObj, "value");
    }
    
    /**
     * Gets the date and time pattern for formatting and parsing dates. 
     * The patterns follow Unicode Technical Standard #35.
     * 
     * @see <a href=http://unicode.org/reports/tr35/tr35-4.html>
     * http://unicode.org/reports/tr35/tr35-4.html</a>
     * 
     * @return String
     */
    public String getPattern() {
        return JsoHelper.getAttribute(jsObj, "pattern");
    }
    
    /**
     * Gets the abbreviated name of the time zone on the client.
     * 
     * @return String
     */
    public String getTimezone() {
        return JsoHelper.getAttribute(jsObj, "timezone");
    }
    
    /**
     * Gets the current difference in seconds between the client's time zone and coordinated universal time.
     * 
     * @return double
     */
    public double getUtcOffset() {
        return JsoHelper.getAttributeAsDouble(jsObj, "utc_offset");
    }
    
    /**
     * Gets the current daylight saving time offset in seconds between the client's non-daylight saving's 
     * time zone and the client's daylight saving's time zone.
     * 
     * @return double
     */
    public double getDstOffset() {
        return JsoHelper.getAttributeAsDouble(jsObj, "dst_offset");
    }
    
    /**
     * Gets the four digit year.
     * 
     * @return int
     */
    public int getYear() {
        return JsoHelper.getAttributeAsInt(jsObj, "year");
    }
    
    /**
     * Gets the month from (0 - 11)
     * 
     * @return int
     */
    public int getMonth() {
        return JsoHelper.getAttributeAsInt(jsObj, "month");
    }
    
    /**
     * Gets the day from (1 - 31)
     * 
     * @return int
     */
    public int getDay() {
        return JsoHelper.getAttributeAsInt(jsObj, "day");
    }
    
    /**
     * The hour from (0 - 23)
     * 
     * @return int
     */
    public int getHour() {
        return JsoHelper.getAttributeAsInt(jsObj, "hour");
    }
    
    /**
     * Gets the minute from (0 - 59)
     * 
     * @return int
     */
    public int getMinute() {
        return JsoHelper.getAttributeAsInt(jsObj, "minute");
    }
    
    /**
     * Gets the second from (0 - 59)
     * 
     * @return int
     */
    public int getSecond() {
        return JsoHelper.getAttributeAsInt(jsObj, "second");
    }
    
    /**
     * Gets the milliseconds (from 0 - 999), not available on all platforms
     * 
     * @return int
     */
    public int getMillis() {
        return JsoHelper.getAttributeAsInt(jsObj, "millisecond");
    }
    
    /**
     * Is DST in effect.
     * 
     * @return boolean
     */
    public boolean isDayLightSavingsTime() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "dst");
    }
}
