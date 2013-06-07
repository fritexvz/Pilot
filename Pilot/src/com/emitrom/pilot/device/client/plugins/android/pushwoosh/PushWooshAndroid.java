package com.emitrom.pilot.device.client.plugins.android.pushwoosh;

import com.emitrom.pilot.device.client.core.Device;
import com.emitrom.pilot.device.client.plugins.Plugin;

public class PushWooshAndroid implements Plugin {

    private static final PushWooshAndroid INSTANCE = new PushWooshAndroid();

    public static PushWooshAndroid get() {
        return INSTANCE;
    }

    private PushWooshAndroid() {
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

    /**
     * register for push notifications and retreive a deviceToken
     * 
     * @param projectId
     * @param appId
     */
    public native void registerDevice(String id, String applicationId, PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.registerDevice(
						{
							'projectId' : id,
							'appId' : applicationId
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void unregisterDevice(PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.unregisterDevice(
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void setTags(PushWooshAndroidObject tags, PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.setTags(
						tags.@com.emitrom.pilot.core.shared.client.core.JsObject::getJsObj()(),
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void startGeoPushes(PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.startGeoPushes(

						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void startGeoPushes()/*-{
		$wnd.plugins.pushNotification.startGeoPushes(function(status) {
		}, function(status) {
		});
    }-*/;

    public native void stopGeoPushes(PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.stopGeoPushes(

						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void stopGeoPushes()/*-{
		$wnd.plugins.pushNotification.stopGeoPushes(function(status) {
		}, function(status) {
		});
    }-*/;

    public native void setMultiNotificationMode(PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.setMultiNotificationMode(

						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void setMultiNotificationMode()/*-{
		$wnd.plugins.pushNotification.setMultiNotificationMode(
				function(status) {
				}, function(status) {
				});
    }-*/;

    public native void setSingleNotificationMode(PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.setSingleNotificationMode(

						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});
    }-*/;

    public native void setSingleNotificationMode()/*-{
		$wnd.plugins.pushNotification.setSingleNotificationMode(
				function(status) {
				}, function(status) {
				});
    }-*/;

    public native void setSoundType(int type, PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.setSoundType(
						type,
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});

    }-*/;

    public native void setSoundType(int type)/*-{
		$wnd.plugins.pushNotification.setSoundType(type, function(status) {
		}, function(status) {
		});
    }-*/;

    public native void setVibrateType(int type, PushWooshAndroidEventHandler callback)/*-{
		$wnd.plugins.pushNotification
				.setVibrateType(
						type,
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onSuccess(Ljava/lang/String;)(status);
						},
						function(status) {
							callback.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEventHandler::onError(Ljava/lang/String;)(status);
						});

    }-*/;

    public native void setVibrateType(int type)/*-{
		$wnd.plugins.pushNotification.setVibrateType(type, function(status) {
		}, function(status) {
		});
    }-*/;

    public native void setLightScreenOnNotification(boolean value)/*-{
		$wnd.plugins.pushNotification.setLightScreenOnNotification(value,
				function(status) {
				}, function(status) {
				});
    }-*/;

    public native void sendLocation(double latitue, double longitude)/*-{
		$wnd.plugins.pushNotification.sendLocation({
			'lat' : latitude,
			'long' : longitude
		}, function(status) {
		}, function(status) {
		});
    }-*/;

    public native void addNotificationHandler(PushWooshAndroidNotificationHandler handler)/*-{
		$wnd.plugins.pushNotification
				.addEventListener(
						'push-notification',
						function(event) {
							var e = @com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
							handler.@com.emitrom.pilot.device.client.plugins.android.pushwoosh.PushWooshAndroidNotificationHandler::onNotification(Lcom/emitrom/pilot/device/client/plugins/android/pushwoosh/PushWooshAndroidEvent;)(e);
						});
    }-*/;

}
