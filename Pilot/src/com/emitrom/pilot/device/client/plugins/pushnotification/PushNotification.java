package com.emitrom.pilot.device.client.plugins.pushnotification;

import com.emitrom.pilot.device.client.plugins.Plugin;

public class PushNotification implements Plugin {

    private static final PushNotification INSTANCE = new PushNotification();

    public static PushNotification get() {
        return INSTANCE;
    }

    private PushNotification() {
        init();
    }

    @Override
    public void init() {
        if (!pluginExists()) {
            throw new IllegalStateException(
                            "Can not find PushNotification plugin - did you include PushNotification.js.js?");
        }
    }

    private native boolean pluginExists()/*-{
		if (!$wnd.plugins)
			return false;
		if (!$wnd.plugins.pushNotification)
			return false;
		return true;
    }-*/;

    public native void register(PushNotificationRegisterConfig config, PushNotificationRegisterCallback callback)/*-{
		$wnd.plugins.pushNotification
				.register(
						function(s) {
							callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationRegisterCallback::onSuccess(Ljava/lang/String;)(s);
						},
						function(e) {
							callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationRegisterCallback::onError(Ljava/lang/String;)(e);
						},
						config.@com.pilot.shared.client.core.JsObject::getJsObj()());
    }-*/;

    public native void unregister(PushNotificationRegisterCallback callback)/*-{
		$wnd.plugins.pushNotification
				.register(
						function(s) {
							callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationRegisterCallback::onSuccess(Ljava/lang/String;)(s);
						},
						function(e) {
							callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationRegisterCallback::onError(Ljava/lang/String;)(e);
						});
    }-*/;

    /**
     * Set the badge count visible when the app is not running
     * 
     * @param badgeCount
     *            , an integer indicating what number should show up in the
     *            badge. Passing 0 will clear the badge.
     */
    public native void setApplicationBadgeNumber(PushNotificationRegisterCallback callback, int badgeCount)/*-{
		$wnd.plugins.pushNotification
				.setApplicationIconBadgeNumber(
						function(s) {
							callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationRegisterCallback::onSuccess(Ljava/lang/String;)(s);
						},
						function(e) {
							callback.@com.emitrom.pilot.device.client.plugins.pushnotification.PushNotificationRegisterCallback::onError(Ljava/lang/String;)(e);
						}, badgeCount);
    }-*/;

    /**
     * Set the badge count visible when the app is not running(IOS Only)
     * 
     * @param badgeCount
     *            , an integer indicating what number should show up in the
     *            badge. Passing 0 will clear the badge.
     */
    public native void setApplicationBadgeNumber(int badgeCount)/*-{
		$wnd.plugins.pushNotification.setApplicationIconBadgeNumber(
				function(s) {
				}, badgeCount);
    }-*/;

}
