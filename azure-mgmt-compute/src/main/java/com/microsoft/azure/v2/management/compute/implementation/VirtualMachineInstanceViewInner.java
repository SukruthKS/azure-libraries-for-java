/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.compute.BootDiagnosticsInstanceView;
import com.microsoft.azure.v2.management.compute.DiskInstanceView;
import com.microsoft.azure.v2.management.compute.InstanceViewStatus;
import com.microsoft.azure.v2.management.compute.MaintenanceRedeployStatus;
import com.microsoft.azure.v2.management.compute.VirtualMachineAgentInstanceView;
import com.microsoft.azure.v2.management.compute.VirtualMachineExtensionInstanceView;
import java.util.List;

/**
 * The instance view of a virtual machine.
 */
public final class VirtualMachineInstanceViewInner {
    /**
     * Specifies the update domain of the virtual machine.
     */
    @JsonProperty(value = "platformUpdateDomain")
    private Integer platformUpdateDomain;

    /**
     * Specifies the fault domain of the virtual machine.
     */
    @JsonProperty(value = "platformFaultDomain")
    private Integer platformFaultDomain;

    /**
     * The computer name assigned to the virtual machine.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /**
     * The Operating System running on the virtual machine.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /**
     * The version of Operating System running on the virtual machine.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * The Remote desktop certificate thumbprint.
     */
    @JsonProperty(value = "rdpThumbPrint")
    private String rdpThumbPrint;

    /**
     * The VM Agent running on the virtual machine.
     */
    @JsonProperty(value = "vmAgent")
    private VirtualMachineAgentInstanceView vmAgent;

    /**
     * The Maintenance Operation status on the virtual machine.
     */
    @JsonProperty(value = "maintenanceRedeployStatus")
    private MaintenanceRedeployStatus maintenanceRedeployStatus;

    /**
     * The virtual machine disk information.
     */
    @JsonProperty(value = "disks")
    private List<DiskInstanceView> disks;

    /**
     * The extensions information.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineExtensionInstanceView> extensions;

    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; For
     * Linux Virtual Machines, you can easily view the output of your console
     * log. &lt;br&gt;&lt;br&gt; For both Windows and Linux virtual machines,
     * Azure also enables you to see a screenshot of the VM from the
     * hypervisor.
     */
    @JsonProperty(value = "bootDiagnostics")
    private BootDiagnosticsInstanceView bootDiagnostics;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the platformUpdateDomain value.
     *
     * @return the platformUpdateDomain value.
     */
    public Integer platformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Set the platformUpdateDomain value.
     *
     * @param platformUpdateDomain the platformUpdateDomain value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withPlatformUpdateDomain(Integer platformUpdateDomain) {
        this.platformUpdateDomain = platformUpdateDomain;
        return this;
    }

    /**
     * Get the platformFaultDomain value.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain value.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get the computerName value.
     *
     * @return the computerName value.
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set the computerName value.
     *
     * @param computerName the computerName value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get the osName value.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName value.
     *
     * @param osName the osName value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the osVersion value.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion value.
     *
     * @param osVersion the osVersion value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the rdpThumbPrint value.
     *
     * @return the rdpThumbPrint value.
     */
    public String rdpThumbPrint() {
        return this.rdpThumbPrint;
    }

    /**
     * Set the rdpThumbPrint value.
     *
     * @param rdpThumbPrint the rdpThumbPrint value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withRdpThumbPrint(String rdpThumbPrint) {
        this.rdpThumbPrint = rdpThumbPrint;
        return this;
    }

    /**
     * Get the vmAgent value.
     *
     * @return the vmAgent value.
     */
    public VirtualMachineAgentInstanceView vmAgent() {
        return this.vmAgent;
    }

    /**
     * Set the vmAgent value.
     *
     * @param vmAgent the vmAgent value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withVmAgent(VirtualMachineAgentInstanceView vmAgent) {
        this.vmAgent = vmAgent;
        return this;
    }

    /**
     * Get the maintenanceRedeployStatus value.
     *
     * @return the maintenanceRedeployStatus value.
     */
    public MaintenanceRedeployStatus maintenanceRedeployStatus() {
        return this.maintenanceRedeployStatus;
    }

    /**
     * Set the maintenanceRedeployStatus value.
     *
     * @param maintenanceRedeployStatus the maintenanceRedeployStatus value to
     * set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withMaintenanceRedeployStatus(MaintenanceRedeployStatus maintenanceRedeployStatus) {
        this.maintenanceRedeployStatus = maintenanceRedeployStatus;
        return this;
    }

    /**
     * Get the disks value.
     *
     * @return the disks value.
     */
    public List<DiskInstanceView> disks() {
        return this.disks;
    }

    /**
     * Set the disks value.
     *
     * @param disks the disks value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withDisks(List<DiskInstanceView> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * Get the extensions value.
     *
     * @return the extensions value.
     */
    public List<VirtualMachineExtensionInstanceView> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions value.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withExtensions(List<VirtualMachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the bootDiagnostics value.
     *
     * @return the bootDiagnostics value.
     */
    public BootDiagnosticsInstanceView bootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics value.
     *
     * @param bootDiagnostics the bootDiagnostics value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withBootDiagnostics(BootDiagnosticsInstanceView bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
        return this;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set.
     * @return the VirtualMachineInstanceViewInner object itself.
     */
    public VirtualMachineInstanceViewInner withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }
}