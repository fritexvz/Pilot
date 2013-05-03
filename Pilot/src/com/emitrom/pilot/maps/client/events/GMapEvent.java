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

package com.emitrom.pilot.maps.client.events;

public class GMapEvent extends Event {

  public final static String BOUNDS_CHANGED = "bounds_changed";
  public final static String CENTER_CHANGED = "center_changed";
  public final static String TAP = "click";
  public final static String TAP_DOWN = "mousedown";
  public final static String TAP_UP = "mouseover";
  public final static String DBL_TAP = "dblclick";
  public final static String DRAG = "drag";
  public final static String DRAG_END = "dragend";
  public final static String DRAG_START = "dragstart";
  public final static String HEADING_CHANGED = "heading_changed";
  public final static String IDLE = "idle";
  public final static String MAP_TYPE_ID_CHANGED = "maptypeid_changed";
  public final static String PROJECTION_CHANGED = "projection_changed";
  public final static String RESIZE = "resize";
  public final static String TILES_LOADED = "tilesloaded";
  public final static String TILT_CHANGED = "tilt_changed";
  public final static String ZOOM_CHANGED = "zoom_changed";
  public final static String ANIMATION_CHANGED = "animation_changed";
  public final static String CLICKABLE_CHANGED = "clickable_changed";
  public final static String DGRAGGABLE_CHANGED = "draggable_changed";
  public final static String FLAT_CHANGED = "flat_changed";
  public final static String ICON_CHANGED = "icon_changed";
  public final static String SHADOW_CHANGED = "shadow_changed";
  public final static String SHAPE_CHANGED = "shape_changed";
  public final static String TITLE_CHANGED = "title_changed";
  public final static String VISIBLE_CHANGED = "visible_changed";
  public final static String ZINDEX_CHANGED = "zindex_changed";
  public final static String CLOSE_CLICK = "closeclick";
  public final static String CONTENT_CHANGED = "content_changed";
  public final static String DOM_READY = "domready";
  public final static String POSITION_CHANGED = "position_changed";
  public final static String DIRECTION_CHANGED = "direction_changed";
  public final static String DEFAULT_VIEWPORT_CHANGED = "defaultviewport_changed";
  public final static String LINKS_CHANGED = "links_ckanged";
  public final static String PANO_CHANGED = "pano_changed";
  public final static String POV_CHANGED = "pov_changed";

  protected GMapEvent() {

  }

}
