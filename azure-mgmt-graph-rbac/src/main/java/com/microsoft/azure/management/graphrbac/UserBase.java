/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UserBase model.
 */
public class UserBase {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * This must be specified if you are using a federated domain for the
     * user's userPrincipalName (UPN) property when creating a new user
     * account. It is used to associate an on-premises Active Directory user
     * account with their Azure AD user object.
     */
    @JsonProperty(value = "immutableId")
    private String immutableId;

    /**
     * A two letter country code (ISO standard 3166). Required for users that
     * will be assigned licenses due to legal requirement to check for
     * availability of services in countries. Examples include: "US", "JP", and
     * "GB".
     */
    @JsonProperty(value = "usageLocation")
    private String usageLocation;

    /**
     * The given name for the user.
     */
    @JsonProperty(value = "givenName")
    private String givenName;

    /**
     * The user's surname (family name or last name).
     */
    @JsonProperty(value = "surname")
    private String surname;

    /**
     * A string value that can be used to classify user types in your
     * directory, such as 'Member' and 'Guest'. Possible values include:
     * 'Member', 'Guest'.
     */
    @JsonProperty(value = "userType")
    private UserType userType;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the UserBase object itself.
     */
    public UserBase withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the immutableId value.
     *
     * @return the immutableId value
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set the immutableId value.
     *
     * @param immutableId the immutableId value to set
     * @return the UserBase object itself.
     */
    public UserBase withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    /**
     * Get the usageLocation value.
     *
     * @return the usageLocation value
     */
    public String usageLocation() {
        return this.usageLocation;
    }

    /**
     * Set the usageLocation value.
     *
     * @param usageLocation the usageLocation value to set
     * @return the UserBase object itself.
     */
    public UserBase withUsageLocation(String usageLocation) {
        this.usageLocation = usageLocation;
        return this;
    }

    /**
     * Get the givenName value.
     *
     * @return the givenName value
     */
    public String givenName() {
        return this.givenName;
    }

    /**
     * Set the givenName value.
     *
     * @param givenName the givenName value to set
     * @return the UserBase object itself.
     */
    public UserBase withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Get the surname value.
     *
     * @return the surname value
     */
    public String surname() {
        return this.surname;
    }

    /**
     * Set the surname value.
     *
     * @param surname the surname value to set
     * @return the UserBase object itself.
     */
    public UserBase withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Get the userType value.
     *
     * @return the userType value
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set the userType value.
     *
     * @param userType the userType value to set
     * @return the UserBase object itself.
     */
    public UserBase withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

}
