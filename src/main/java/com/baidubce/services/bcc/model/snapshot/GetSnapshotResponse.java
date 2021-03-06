/*
 * Copyright (c) 2014 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bcc.model.snapshot;

import com.baidubce.model.AbstractBceResponse;
import com.baidubce.services.bcc.model.SnapshotModel;

/**
 * The response for GetSnapshotRequest.
 */
public class GetSnapshotResponse extends AbstractBceResponse {

    /**
     * The detail model of the snapshot.
     */
    private SnapshotModel snapshot;

    public SnapshotModel getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(SnapshotModel snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public String toString() {
        return "GetSnapshotResponse{"
                + "snapshot=" + snapshot
                + '}';
    }
}
