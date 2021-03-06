/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a overridable value that can be passed to a task template.
 */
public class SetValue {
    /**
     * The name of the overridable value.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The overridable value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Flag to indicate whether the value represents a secret or not.
     */
    @JsonProperty(value = "isSecret")
    private Boolean isSecret;

    /**
     * Get the name of the overridable value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the overridable value.
     *
     * @param name the name value to set
     * @return the SetValue object itself.
     */
    public SetValue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the overridable value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the overridable value.
     *
     * @param value the value value to set
     * @return the SetValue object itself.
     */
    public SetValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get flag to indicate whether the value represents a secret or not.
     *
     * @return the isSecret value
     */
    public Boolean isSecret() {
        return this.isSecret;
    }

    /**
     * Set flag to indicate whether the value represents a secret or not.
     *
     * @param isSecret the isSecret value to set
     * @return the SetValue object itself.
     */
    public SetValue withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

}
