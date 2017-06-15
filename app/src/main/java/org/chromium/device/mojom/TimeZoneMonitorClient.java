
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/time_zone_monitor.mojom
//

package org.chromium.device.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface TimeZoneMonitorClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends TimeZoneMonitorClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<TimeZoneMonitorClient, TimeZoneMonitorClient.Proxy> MANAGER = TimeZoneMonitorClient_Internal.MANAGER;


    void onTimeZoneChange(
String tzInfo);


}
