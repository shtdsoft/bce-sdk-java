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
package com.baidubce.services.nat.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The request for updating nat.
 */
public class ModifyNatRequest extends AbstractBceRequest {

    /**
     * The id of nat to be updated.
     */
    @JsonIgnore
    private String natId;

    /**
     * The new value for nat's name.
     */
    private String name;

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
     * Configure natId for the request.
     * @param natId The id of the nat.
     * @return ModifyNatRequest with specific natId
     */
    public ModifyNatRequest withNatId(String natId) {
        this.natId = natId;
        return this;
    }

    /**
     * Configure name for the request.
     * @param name The name of the nat.
     * @return ModifyNatRequest with specific name
     */
    public ModifyNatRequest withName(String name) {
        this.name = name;
        return this;
    }

    public String getNatId() {
        return natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    @Override
    public AbstractBceRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}
