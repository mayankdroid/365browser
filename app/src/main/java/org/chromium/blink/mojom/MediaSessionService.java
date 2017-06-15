
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/mediasession/media_session.mojom
//

package org.chromium.blink.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface MediaSessionService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaSessionService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaSessionService, MediaSessionService.Proxy> MANAGER = MediaSessionService_Internal.MANAGER;


    void setClient(
MediaSessionClient client);



    void setPlaybackState(
int state);



    void setMetadata(
MediaMetadata metadata);



    void enableAction(
int action);



    void disableAction(
int action);


}
