/*
 * Copyright 2016-2019 Baidu, Inc.
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

package com.baidubce.services.cdn.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.util.DateUtils;
import com.baidubce.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * The params of metric query
 * 
 */
public class GetStatMetricRequest extends AbstractBceRequest {

    private String metric;
    private String startTime;
    private String endTime;
    private Integer period = 300;
    private Integer keyType = 0;
    private List<String> key;
    private String groupBy = "key";
    private String prov;
    private String isp;
    private String level;
    private String protocol;
    private String extra;

    /**
     * 
     * @param metric
     * @return
     */
    public GetStatMetricRequest withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 
     * @param startTime
     * @return
     */
    public GetStatMetricRequest withStartTime(Date startTime) {
        this.startTime = DateUtils.formatAlternateIso8601Date(startTime);
        return this;
    }

    /**
     * 
     * @param endTime
     * @return
     */
    public GetStatMetricRequest withEndTime(Date endTime) {
        this.endTime = DateUtils.formatAlternateIso8601Date(endTime);
        return this;
    }

    /**
     * 
     * @param period
     * @return
     */
    public GetStatMetricRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 
     * @param keyType
     * @return
     */
    public GetStatMetricRequest withKeyType(Integer keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * 
     * @param key
     * @return
     */
    public GetStatMetricRequest withKey(List<String> key) {
        this.key = key;
        return this;
    }

    /**
     * 
     * @param key
     * @return
     */
    public GetStatMetricRequest withKey(String key) {
        if (null == this.key) {
            this.key = new ArrayList<String>();
        }
        this.key.add(key);
        return this;
    }

    /**
     * 
     * @param groupBy
     * @return
     */
    public GetStatMetricRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 
     * @param prov
     * @return
     */
    public GetStatMetricRequest withProv(String prov) {
        this.prov = GetStatMetricMapping.PROVINCE_MAP.inverse().get(prov);
        this.prov = StringUtils.isEmpty(this.prov) ? prov : this.prov;
        return this;
    }

    /**
     * 
     * @param isp
     * @return
     */
    public GetStatMetricRequest withIsp(String isp) {
        this.isp = GetStatMetricMapping.ISP_MAP.inverse().get(isp);
        this.isp = StringUtils.isEmpty(this.isp) ? isp : this.isp;
        return this;
    }

    /**
     * 
     * @param level
     * @return
     */
    public GetStatMetricRequest withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 
     * @param protocol
     * @return
     */
    public GetStatMetricRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 
     * @param extra
     * @return
     */
    public GetStatMetricRequest withExtra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * 
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * 
     * @return
     */
    public Integer getKeyType() {
        return keyType;
    }

    /**
     * 
     * @param keyType
     */
    public void setKeyType(Integer keyType) {
        this.keyType = keyType;
    }

    /**
     * 
     * @return
     */
    public List<String> getKey() {
        return key;
    }

    /**
     * 
     * @param key
     */
    public void setKey(List<String> key) {
        this.key = key;
    }

    /**
     * 
     * @return
     */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * 
     * @param groupBy
     */
    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * 
     * @return
     */
    public String getProv() {
        return prov;
    }

    /**
     * 
     * @param prov
     */
    public void setProv(String prov) {
        this.prov = prov;
    }

    /**
     * 
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * 
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * 
     * @return
     */
    public String getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * 
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * 
     * @return
     */
    public String getExtra() {
        return extra;
    }

    /**
     * 
     * @param extra
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * Parse this instance to map . When additional parameters need to be added
     * 
     * @param obj
     * @return
     * @throws Exception
     */
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            Field[] declaredFields = this.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(this));
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.baidubce.model.AbstractBceRequest#withRequestCredentials(com.baidubce.auth.BceCredentials)
     */
    @Override
    public GetStatMetricRequest withRequestCredentials(BceCredentials credentials) {
        super.setRequestCredentials(credentials);
        return this;
    }

    /**
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        try {
            return JsonUtils.toJsonPrettyString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

}
