
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/browser/invalidate_type.h

package org.chromium.content_public.browser;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    InvalidateTypes.URL, InvalidateTypes.TAB, InvalidateTypes.LOAD, InvalidateTypes.TITLE,
    InvalidateTypes.ALL
})
@Retention(RetentionPolicy.SOURCE)
public @interface InvalidateTypes {
  int URL = 1 << 0;
  int TAB = 1 << 1;
  /**
   * state changed.
   */
  int LOAD = 1 << 2;
  int TITLE = 1 << 3;
  int ALL = (1 << 4) - 1;
}
