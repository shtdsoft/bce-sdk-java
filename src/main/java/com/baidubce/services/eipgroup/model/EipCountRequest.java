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
package com.baidubce.services.eipgroup.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The request for adding eip group count.
 */
public class EipCountRequest extends AbstractBceRequest {

    /**
     * An ASCII string whose length is less than 64.
     *
     * The request will be idempotent if clientToken is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     *     BCE API doc</a>
     */
    @JsonIgnore
    private String clientToken;

    /**
     * The id of eip group.
     */
    @JsonIgnore
    private String id;

    /**
     * The eipAddCount of eip group.
     */
    private int eipAddCount;


    @Override
    public AbstractBceRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    /**
     * Configure id for the request.
     *
     * @param id The id of BandwidthInMbpsRequest
     * @return BandwidthInMbpsRequest with specific id
     */
    public EipCountRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Configure eipAddCount for the request.
     *
     * @param eipAddCount The bandwidthInMbps of EipCountRequest
     * @return EipCountRequest with specific eipAddCount
     */
    public EipCountRequest withEipAddCount(int eipAddCount) {
        this.eipAddCount = eipAddCount;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEipAddCount() {
        return eipAddCount;
    }

    public void setEipAddCount(int eipAddCount) {
        this.eipAddCount = eipAddCount;
    }
}
