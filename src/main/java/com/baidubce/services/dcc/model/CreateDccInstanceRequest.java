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
package com.baidubce.services.dcc.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.services.bcc.model.Billing;
import com.baidubce.services.bcc.model.CreateCdsModel;
import com.baidubce.services.bcc.model.volume.EphemeralDisk;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * The request of creating dcc instance
 */
public class CreateDccInstanceRequest extends AbstractBceRequest {
    /**
     * An ASCII string whose length is less than 64.
     * <p>
     * The request will be idempotent if clientToken is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     * BCE API doc</a>
     */
    @JsonIgnore
    private String clientToken;

    /**
     * Specified image id for creating dcc
     */
    private String imageId;

    /**
     * The billing information
     */
    private Billing billing;

    /**
     * Specified the instance type for creating dcc
     */
    private String instanceType;

    /**
     * Specified the virtual cpu count for dcc
     */
    private int cpuCount;

    /**
     * Specified the memory capacity for dcc
     */
    private int memoryCapacityInGB;

    /**
     * Specified the size of root disk
     */
    private int rootDiskSizeInGb;

    /**
     * Specified the type of root disk
     */
    private String rootDiskStorageType;

    /**
     * Specified the size of local disk
     */
    private int localDiskSizeInGB;

    /**
     * The optional parameter to specify the ephemeral disk list
     *
     * When creating the storage optimized instance, one ephemeral disk must be created together.
     *
     * When creating the gpu instance, one ephemeral disk must be created together, the optional ephemeral disk size
     * see <a href = "https://cloud.baidu.com/doc/BCC/API.html#.5E.9B.3F.DF.1D.60.51.F5.A2.B0.FC.3D.24.64.A0.8C">
     *     The optional ephemeral disk size for gpu instance</a>
     *
     * When creating the fpga instance, one ephemeral disk must be created together, the optional ephemeral disk size
     * see <a href = "https://cloud.baidu.com/doc/BCC/API.html#.84.A3.73.8E.D2.2E.66.28.54.10.BF.38.C3.94.F7.9A">
     *     The optional ephemeral disk size for gpu instance</a>
     *
     */
    private List<EphemeralDisk> ephemeralDisks;

    /**
     * The optional list of volume detail info to create.
     */
    private List<CreateCdsModel> createCdsList;

    /**
     * Specified the capacity of network
     */
    private int networkCapacityInMbps;

    /**
     * Specified the internet charge type
     */
    private String internetChargeType;

    /**
     * Specified the dedicated host id
     */
    private String dedicatedHostId;

    /**
     * Specified the purchase count
     */
    private int purchaseCount;

    /**
     * Specified the name of dcc
     */
    private String name;

    /**
     * Specified the password of dcc
     */
    private String adminPass;

    /**
     * Specified the zone name
     */
    private String zoneName;

    /**
     * Specified the subnet id
     */
    private String subnetId;

    /**
     * Specified the security group id
     */
    private String securityGroupId;

    /**
     * Specified the gpu card type
     */
    private String gpuCard;

    /**
     * Specified the fgpa card type
     */
    private String fpgaCard;

    /**
     * Specified the card count
     */
    private String cardCount;

    @Override
    public AbstractBceRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public int getMemoryCapacityInGB() {
        return memoryCapacityInGB;
    }

    public void setMemoryCapacityInGB(int memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
    }

    public int getRootDiskSizeInGb() {
        return rootDiskSizeInGb;
    }

    public void setRootDiskSizeInGb(int rootDiskSizeInGb) {
        this.rootDiskSizeInGb = rootDiskSizeInGb;
    }

    public String getRootDiskStorageType() {
        return rootDiskStorageType;
    }

    public void setRootDiskStorageType(String rootDiskStorageType) {
        this.rootDiskStorageType = rootDiskStorageType;
    }

    public int getLocalDiskSizeInGB() {
        return localDiskSizeInGB;
    }

    public void setLocalDiskSizeInGB(int localDiskSizeInGB) {
        this.localDiskSizeInGB = localDiskSizeInGB;
    }

    public List<EphemeralDisk> getEphemeralDisks() {
        return ephemeralDisks;
    }

    public void setEphemeralDisks(List<EphemeralDisk> ephemeralDisks) {
        this.ephemeralDisks = ephemeralDisks;
    }

    public List<CreateCdsModel> getCreateCdsList() {
        return createCdsList;
    }

    public void setCreateCdsList(List<CreateCdsModel> createCdsList) {
        this.createCdsList = createCdsList;
    }

    public int getNetworkCapacityInMbps() {
        return networkCapacityInMbps;
    }

    public void setNetworkCapacityInMbps(int networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
    }

    public String getInternetChargeType() {
        return internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getGpuCard() {
        return gpuCard;
    }

    public void setGpuCard(String gpuCard) {
        this.gpuCard = gpuCard;
    }

    public String getFpgaCard() {
        return fpgaCard;
    }

    public void setFpgaCard(String fpgaCard) {
        this.fpgaCard = fpgaCard;
    }

    public String getCardCount() {
        return cardCount;
    }

    public void setCardCount(String cardCount) {
        this.cardCount = cardCount;
    }
}
