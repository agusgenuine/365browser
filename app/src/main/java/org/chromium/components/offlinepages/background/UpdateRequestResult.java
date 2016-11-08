
// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_pages/background/request_queue.h

package org.chromium.components.offlinepages.background;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UpdateRequestResult {
  @IntDef({
      SUCCESS, STORE_FAILURE, REQUEST_DOES_NOT_EXIST
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface UpdateRequestResultEnum {}
  public static final int SUCCESS = 0;
  public static final int STORE_FAILURE = 1;
  public static final int REQUEST_DOES_NOT_EXIST = 2;
}
