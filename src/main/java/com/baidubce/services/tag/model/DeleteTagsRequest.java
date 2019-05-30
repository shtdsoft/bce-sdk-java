/*
 * Copyright (c) 2018 Baidu.com, Inc. All Rights Reserved
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.tag.model;

import java.util.List;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

public class DeleteTagsRequest extends AbstractBceRequest {
    /**
     * List of tag to be deleted
     */
    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * Configure list of tag for the request
     *
     * @param tags List of tag to be deleted.
     * @return DeleteTagsRequest with tags.
     */
    public DeleteTagsRequest withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Configure request credential for the request.
     *
     * @param credentials a valid instance of BceCredentials.
     * @return DeleteTagsRequest with credentials.
     */
    @Override
    public DeleteTagsRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    @Override
    public String toString() {
        return "DeleteTagsRequest{"
                + "tags=" + tags
                + " }";
    }
}
