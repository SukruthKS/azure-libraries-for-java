/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container group diagnostic information.
 */
public class ContainerGroupDiagnostics {
    /**
     * Container group log analytics information.
     */
    @JsonProperty(value = "logAnalytics")
    private LogAnalytics logAnalytics;

    /**
     * Get the logAnalytics value.
     *
     * @return the logAnalytics value
     */
    public LogAnalytics logAnalytics() {
        return this.logAnalytics;
    }

    /**
     * Set the logAnalytics value.
     *
     * @param logAnalytics the logAnalytics value to set
     * @return the ContainerGroupDiagnostics object itself.
     */
    public ContainerGroupDiagnostics withLogAnalytics(LogAnalytics logAnalytics) {
        this.logAnalytics = logAnalytics;
        return this;
    }

}