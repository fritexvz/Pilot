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
package com.emitrom.pilot.device.client.compass;

public enum CompassErrorCode {

    COMPASS_INTERNAL_ERROR(0), COMPASS_NOT_SUPPORTED(1);

    @SuppressWarnings("unused")
    private int value;

    private CompassErrorCode(int status) {
        this.value = status;
    }

    public static CompassErrorCode fromValue(int code) {
        CompassErrorCode[] values = CompassErrorCode.values();
        
        if (code < 0 || code > values.length - 1) {
            return COMPASS_INTERNAL_ERROR;
        }
        
        return values[code];
    }

}
