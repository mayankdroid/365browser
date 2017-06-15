
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ntp_tiles/tile_visual_type.h

package org.chromium.chrome.browser.suggestions;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    TileVisualType.NONE, TileVisualType.ICON_REAL, TileVisualType.ICON_COLOR,
    TileVisualType.ICON_DEFAULT, TileVisualType.THUMBNAIL, TileVisualType.THUMBNAIL_FAILED,
    TileVisualType.LAST_RECORDED_TILE_TYPE, TileVisualType.UNKNOWN_TILE_TYPE,
    TileVisualType.TILE_TYPE_MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface TileVisualType {
  /**
   * The icon or thumbnail hasn't loaded yet.
   */
  int NONE = 0;
  /**
   * The item displays a site's actual favicon or touch icon.
   */
  int ICON_REAL = 1;
  /**
   * The item displays a color derived from the site's favicon or touch icon.
   */
  int ICON_COLOR = 2;
  /**
   * The item displays a default gray box in place of an icon.
   */
  int ICON_DEFAULT = 3;
  /**
   * Deleted: THUMBNAIL_LOCAL = 4 Deleted: THUMBNAIL_SERVER = 5 Deleted: THUMBNAIL_DEFAULT = 6 The
   * item displays a thumbnail of the page. Used on desktop.
   */
  int THUMBNAIL = 7;
  /**
   * The item wants to display a thumbnail of the page, but it failed to load. Used on desktop.
   */
  int THUMBNAIL_FAILED = 8;
  /**
   * The maximum tile type value that gets recorded in UMA.
   */
  int LAST_RECORDED_TILE_TYPE = 8;
  /**
   * The tile type has not been determined yet. Used on iOS, until we can detect when all tiles have
   * loaded.
   */
  int UNKNOWN_TILE_TYPE = 9;
  int TILE_TYPE_MAX = 9;
}
