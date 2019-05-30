/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.dugo.project;

import com.baidubce.model.AbstractBceResponse;

import java.util.List;

/**
 * Response for project list query
 */
public class GetProjectListResponse extends AbstractBceResponse {
    private Meta meta;
    private List<ProjectInfoVo> data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<ProjectInfoVo> getData() {
        return data;
    }

    public void setData(List<ProjectInfoVo> data) {
        this.data = data;
    }

    public static class Meta {
        private long total;
        private long totalQuota;
        private long usedQuota;

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public long getTotalQuota() {
            return totalQuota;
        }

        public void setTotalQuota(long totalQuota) {
            this.totalQuota = totalQuota;
        }

        public long getUsedQuota() {
            return usedQuota;
        }

        public void setUsedQuota(long usedQuota) {
            this.usedQuota = usedQuota;
        }
    }

    public static class ProjectInfoVo {
        private String id;
        private String name;
        private Integer type;
        private String region;
        private String protocol;
        private Integer totalQuota;
        private Integer usedQuota;
        private List<String> address;
        private Boolean otaEnabled;
        private String otaId;
        private String otaSecret;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getTotalQuota() {
            return totalQuota;
        }

        public void setTotalQuota(Integer totalQuota) {
            this.totalQuota = totalQuota;
        }

        public Integer getUsedQuota() {
            return usedQuota;
        }

        public void setUsedQuota(Integer usedQuota) {
            this.usedQuota = usedQuota;
        }

        public List<String> getAddress() {
            return address;
        }

        public void setAddress(List<String> address) {
            this.address = address;
        }

        public Boolean getOtaEnabled() {
            return otaEnabled;
        }

        public void setOtaEnabled(Boolean otaEnabled) {
            this.otaEnabled = otaEnabled;
        }

        public String getOtaId() {
            return otaId;
        }

        public void setOtaId(String otaId) {
            this.otaId = otaId;
        }

        public String getOtaSecret() {
            return otaSecret;
        }

        public void setOtaSecret(String otaSecret) {
            this.otaSecret = otaSecret;
        }
    }
}
