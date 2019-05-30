/*
 * Copyright (c) 2019 Baidu.com, Inc. All Rights Reserved
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
package com.baidubce.services.bbc.model.instance;

import com.baidubce.model.AbstractBceResponse;

import java.util.List;

/**
 * The response for bbc flavor raid
 */
public class GetBbcFlavorRaidResponse extends AbstractBceResponse {

    /**
     * The id of flavor
     */
    private String flavorId;

    /**
     * The detail of flavor raid
     */
    private List<RaidModel> raids;

    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public List<RaidModel> getRaids() {
        return raids;
    }

    public void setRaids(List<RaidModel> raids) {
        this.raids = raids;
    }
}
