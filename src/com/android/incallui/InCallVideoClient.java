/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.incallui;

import android.telecomm.CallCameraCapabilities;
import android.telecomm.VideoCallProfile;
import android.telecomm.CallVideoClient;

/**
 * Implements the InCall-UI Call Video client.
 */
public class InCallVideoClient extends CallVideoClient {
    @Override
    public void onReceiveSessionModifyRequest(VideoCallProfile videoCallProfile) {

    }

    @Override
    public void onReceiveSessionModifyResponse(int status, VideoCallProfile requestedProfile,
            VideoCallProfile responseProfile) {

    }

    @Override
    public void onHandleCallSessionEvent(int event) {

    }

    @Override
    public void onUpdatePeerDimensions(int width, int height) {

    }

    @Override
    public void onUpdateCallDataUsage(int dataUsage) {

    }

    @Override
    public void onHandleCameraCapabilitiesChange(CallCameraCapabilities callCameraCapabilities) {

    }
}