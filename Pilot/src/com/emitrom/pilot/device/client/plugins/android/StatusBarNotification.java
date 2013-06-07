package com.emitrom.pilot.device.client.plugins.android;

import com.emitrom.pilot.device.client.core.Device;
import com.emitrom.pilot.device.client.plugins.Plugin;

/**
 * Java binding for Statusbarnotification
 * 
 * @see <a href=
 *      'https://github.com/phonegap/phonegap-plugins/tree/master/Android/StatusBarNotification'>https://github.com/phonegap/phonegap-plugins/tree/master/Android/StatusBarNotific
 *      a t i o n < / a >
 * 
 */
public class StatusBarNotification implements Plugin {

    public static final String FLAG_AUTO_CANCEL = "16";
    public static final String FLAG_NO_CLEAR = "32";

    private static final StatusBarNotification INSTANCE = new StatusBarNotification();

    public static StatusBarNotification get() {
        return INSTANCE;
    }

    private StatusBarNotification() {
        init();
    }

    @Override
    public void init() {
        if (!Device.pluginExists("statusbarnotification")) {
            throw new IllegalStateException(
                            "Can not find PushNotification plugin - did you include statusbarnotification.js?");
        }

    }

    public native void display(String title, String message)/*-{
		$wnd.plugins.statusBarNotification.notify(title, message);
    }-*/;

    public void display(String message) {
        display("", message);
    }

}
