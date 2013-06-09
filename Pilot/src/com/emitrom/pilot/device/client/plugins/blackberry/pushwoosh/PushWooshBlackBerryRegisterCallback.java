package com.emitrom.pilot.device.client.plugins.blackberry.pushwoosh;

public interface PushWooshBlackBerryRegisterCallback {
	public static final int REGISTER_SUCCESS = 0;				//We have success registering the push notification
	public static final int REGISTER_ERR_NETWORK = 1;			//We have a network error
	public static final int REGISTER_ERR_SERVER = 2;			//We were rejected by the server
	public static final int REGISTER_ERR_INVALID_PARAMETERS = 3;//Invalid parameters were sent
	public static final int REGISTER_ERR_GENERAL = -1;			//Unspecified error occurred
	
	public void onError(int status);
	public void onSuccess(String text);
}
