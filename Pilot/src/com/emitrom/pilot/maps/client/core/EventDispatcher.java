/**
 * Copyright (c) 2012 Emitrom LLC. All rights reserved. For licensing questions,
 * please contact us at licensing@emitrom.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.emitrom.pilot.maps.client.core;

import com.emitrom.pilot.core.shared.client.core.Function;
import com.emitrom.pilot.maps.client.events.handlers.MapEventHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class EventDispatcher {

    private EventDispatcher() {

    }

    /**
     * Adds the given listener function to the given event name for the given
     * object instance.
     * 
     * @param target
     * @param event
     * @param handler
     */
    public static native void addEventListener(JavaScriptObject target, String event, Function handler)/*-{
		$wnd.google.maps.event.addListener(target, event, function() {
			handler.@com.emitrom.pilot.core.shared.client.core.Function::execute()();
		});
    }-*/;

    /**
     * Adds the given listener function once to the given event name for the
     * given object instance.
     * 
     * @param target
     * @param event
     * @param handler
     */
    public static native void addEventListenerOnce(JavaScriptObject target, String event, Function handler)/*-{
		$wnd.google.maps.event.addListenerOnce(target, event, function() {
			handler.@com.emitrom.pilot.core.shared.client.core.Function::execute()();
		});
    }-*/;

    /**
     * Removes all listeners for all events for the given instance.
     * 
     * @param target
     */
    public static native void clearInstanceListeners(Object target)/*-{
		$wnd.google.maps.event.clearInstanceListeners(target);
    }-*/;

    public static native void clearListeners(Object target, String eventName)/*-{
		$wnd.google.maps.event.clearListeners(target, eventName);
    }-*/;

    /**
     * Triggers the given event. All arguments after eventName are passed as
     * arguments to the listeners.
     * 
     * @param target
     * @param eventName
     * @param args
     */
    public static native void trigger(Object target, String eventName, Object... args)/*-{
		$wnd.google.maps.event.trigger.apply(target, eventName, args);
    }-*/;

    public static native void addEventListener(JavaScriptObject target, String event, MapEventHandler handler)/*-{
		$wnd.google.maps.event
				.addListener(
						target,
						event,
						function(e) {
							handler.@com.emitrom.pilot.maps.client.events.handlers.MapEventHandler::onEvent(Lcom/emitrom/pilot/maps/client/events/InteractionEvent;)(e);
						});
    }-*/;

    public static native void addEventListenerOnce(JavaScriptObject target, String event, MapEventHandler handler)/*-{
		$wnd.google.maps.event
				.addListenerOnce(
						target,
						event,
						function(e) {
							handler.@com.emitrom.pilot.maps.client.events.handlers.MapEventHandler::onEvent(Lcom/emitrom/pilot/maps/client/events/InteractionEvent;)(e);
						});
    }-*/;

}
