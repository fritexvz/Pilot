package com.emitrom.pilot.device.client.plugins.ios.pushwoosh;

import com.emitrom.pilot.core.shared.client.core.JsoHelper;

public class PushWooshIOsRegistration extends PushWooshIOsObject {

    private PushWooshIOsRegistration() {
        jsObj = JsoHelper.createObject();
    }

    public PushWooshIOsRegistration(String pwAppId, String appName) {
        this();
        this.setPwAppId(pwAppId);
        this.setAppName(appName);
    }

    public void setPwAppId(String value) {
        JsoHelper.setAttribute(jsObj, "pw_appid", value);
    }

    public void setAppName(String value) {
        JsoHelper.setAttribute(jsObj, "appname", value);
    }

    public void setAlert(boolean value) {
        JsoHelper.setAttribute(jsObj, "alert", value);
    }

    public void setBadge(boolean value) {
        JsoHelper.setAttribute(jsObj, "badge", value);
    }

    public void setSound(boolean value) {
        JsoHelper.setAttribute(jsObj, "sound", value);
    }

}
