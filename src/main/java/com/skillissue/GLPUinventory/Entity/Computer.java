package com.skillissue.GLPUinventory.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Computer {
    @Id
    @JsonProperty("Hostname")
    @Column(name = "hostname")
    private String hostname;

    @JsonProperty("OSName")
    @Column(name = "osName")
    private String osName;

    @JsonProperty("OSVersion")
    @Column(name = "osVersion")
    private String osVersion;

    @JsonProperty("BiosManufacturer")
    @Column(name = "biosManufacturer")
    private String gpu;

    @JsonProperty("BiosStatus")
    @Column(name = "biosStatus")
    private String biosStatus;
    
    @JsonProperty("CsDomain")
    @Column(name = "csDomain")
    private String domain;

    @JsonProperty("CsModel")
    @Column(name = "csModel")
    private String model;

    @JsonProperty("csProcessorName")
    @Column(name = "csProcessorName")
    private String processorName;

    @JsonProperty("totalRam_Gb")
    @Column(name = "totalRam_Gb")
    private String totalRam;

    @JsonProperty("diskTotalSize")
    @Column(name = "diskTotalSize")
    private String totalSize;

    @JsonProperty("diskFreeGb")
    @Column(name = "diskFreeGb")
    private String freeSpace;
    

    public Computer() {
    }

    


    public Computer(String hostname, String osName, String osVersion, String gpu, String biosStatus,
            String domain, String model, String processorName, String totalRam, String totalSize, String freeSpace) {
        this.hostname = hostname;
        this.osName = osName;
        this.osVersion = osVersion;
        this.gpu = gpu;
        this.biosStatus = biosStatus;
        this.domain = domain;
        this.model = model;
        this.processorName = processorName;
        this.totalRam = totalRam;
        this.totalSize = totalSize;
        this.freeSpace = freeSpace;
    }

    public String getHostname() {
        return hostname;
    }


    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


    public String getOsName() {
        return osName;
    }


    public void setOsName(String osName) {
        this.osName = osName;
    }


    public String getOsVersion() {
        return osVersion;
    }


    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }


    public String getGpu() {
        return gpu;
    }


    public void setGpu(String gpu) {
        this.gpu = gpu;
    }


    public String getBiosStatus() {
        return biosStatus;
    }


    public void setBiosStatus(String biosStatus) {
        this.biosStatus = biosStatus;
    }


    public String getDomain() {
        return domain;
    }


    public void setDomain(String domain) {
        this.domain = domain;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getProcessorName() {
        return processorName;
    }


    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }


    public String getTotalRam() {
        return totalRam;
    }


    public void setTotalRam(String totalRam) {
        this.totalRam = totalRam;
    }


    public String getTotalSize() {
        return totalSize;
    }


    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }


    public String getFreeSpace() {
        return freeSpace;
    }


    public void setFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
    }
    
    
    
    
}
