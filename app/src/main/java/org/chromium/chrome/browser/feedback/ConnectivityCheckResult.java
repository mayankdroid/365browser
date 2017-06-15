
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/feedback/connectivity_checker.cc

package org.chromium.chrome.browser.feedback;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ConnectivityCheckResult.UNKNOWN, ConnectivityCheckResult.CONNECTED,
    ConnectivityCheckResult.NOT_CONNECTED, ConnectivityCheckResult.TIMEOUT,
    ConnectivityCheckResult.ERROR, ConnectivityCheckResult.END
})
@Retention(RetentionPolicy.SOURCE)
public @interface ConnectivityCheckResult {
  int UNKNOWN = 0;
  int CONNECTED = 1;
  int NOT_CONNECTED = 2;
  int TIMEOUT = 3;
  int ERROR = 4;
  int END = 5;
}
