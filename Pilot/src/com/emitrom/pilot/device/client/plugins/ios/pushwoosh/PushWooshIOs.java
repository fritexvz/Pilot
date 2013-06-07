package com.emitrom.pilot.device.client.plugins.ios.pushwoosh;

import com.emitrom.pilot.device.client.core.Device;
import com.emitrom.pilot.device.client.plugins.Plugin;

public class PushWooshIOs implements Plugin {

    private static final PushWooshIOs INSTANCE = new PushWooshIOs();

    public static PushWooshIOs get() {
        return INSTANCE;
    }

    private PushWooshIOs() {
        init();
    }

    @Override
    public void init() {
        if (!Device.pluginExists("pushNotification")) {
            throw new IllegalStateException(
                            "Can not find PushNotification plugin - did you include PushNotification.js?");
        }
    }

    public native void onDeviceReady()/*-{
		$wnd.plugins.pushNotification.onDeviceReady();
    }-*/;

    public native void registerDevice(PushWooshIOsRegistration registrationConfig, PushWooshIOsEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.registerDevice(
						registrationConfig.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()(),
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.ios.pushwoosh.PushWooshIOsEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.ios.pushwoosh.PushWooshIOsEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void cancelAllLocalNotifications()/*-{
		$wnd.plugins.pushNotification.cancelAllLocalNotifications();
    }-*/;

    public native void setApplicationIconBadgeNumber(int value)/*-{
		$wnd.plugins.pushNotification.setApplicationIconBadgeNumber(value);
    }-*/;

    public native void sendLocation(double latitue, double longitude)/*-{
		$wnd.plugins.pushNotification.sendLocation({
			'lat' : latitude,
			'long' : longitude
		}, function(status) {
		}, function(status) {
		});
    }-*/;

    public native void addNotificationHandler(PushWooshIOsNotificationHandler handler)/*-{
		$wnd.plugins.pushNotification
				.addEventListener(
						'push-notification',
						function(event) {
							var e = @com.emitrom.pilot.device.client.plugins.ios.pushwoosh.PushWooshIOsEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
							handler.@com.emitrom.pilot.device.client.plugins.ios.pushwoosh.PushWooshIOsNotificationHandler::onNotification(Lcom/emitrom/pilot/device/client/plugins/ios/pushwoosh/PushWooshIOsEvent;)(e);
						});
    }-*/;

}
