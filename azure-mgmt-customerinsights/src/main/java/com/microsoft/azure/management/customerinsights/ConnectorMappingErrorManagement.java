/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error mangement.
 */
public class ConnectorMappingErrorManagement {
    /**
     * The type of error management to use for the mapping. Possible values
     * include: 'RejectAndContinue', 'StopImport', 'RejectUntilLimit'.
     */
    @JsonProperty(value = "errorManagementType", required = true)
    private ErrorManagementTypes errorManagementType;

    /**
     * The error limit allowed while importing data.
     */
    @JsonProperty(value = "errorLimit")
    private Integer errorLimit;

    /**
     * Get the errorManagementType value.
     *
     * @return the errorManagementType value
     */
    public ErrorManagementTypes errorManagementType() {
        return this.errorManagementType;
    }

    /**
     * Set the errorManagementType value.
     *
     * @param errorManagementType the errorManagementType value to set
     * @return the ConnectorMappingErrorManagement object itself.
     */
    public ConnectorMappingErrorManagement withErrorManagementType(ErrorManagementTypes errorManagementType) {
        this.errorManagementType = errorManagementType;
        return this;
    }

    /**
     * Get the errorLimit value.
     *
     * @return the errorLimit value
     */
    public Integer errorLimit() {
        return this.errorLimit;
    }

    /**
     * Set the errorLimit value.
     *
     * @param errorLimit the errorLimit value to set
     * @return the ConnectorMappingErrorManagement object itself.
     */
    public ConnectorMappingErrorManagement withErrorLimit(Integer errorLimit) {
        this.errorLimit = errorLimit;
        return this;
    }

}