/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.network.implementation.TopologyInner;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.HasParent;
import com.microsoft.azure.v2.management.resources.fluentcore.model.Executable;
import com.microsoft.azure.v2.management.resources.fluentcore.model.HasInner;
import com.microsoft.rest.v2.annotations.Beta;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An immutable client-side representation of an Azure Topology info object, associated with network watcher.
 */
@Fluent
@Beta(since = "V1_2_0")
public interface Topology extends Executable<Topology>,
        HasInner<TopologyInner>,
        HasParent<NetworkWatcher> {
    /**
     * @return GUID representing the id
     */
    String id();

    /**
     * @return parameters used to query this topology
     */
    TopologyParameters topologyParameters();

    /**
     * @return the datetime when the topology was initially created for the resource
     * group.
     */
    OffsetDateTime createdTime();

    /**
     * @return the datetime when the topology was last modified
     */
    OffsetDateTime lastModifiedTime();

    /**
     * @return The resources in this topology
     */
    Map<String, TopologyResource> resources();
    /**
     * The entirety of topology parameters definition.
     */
    interface Definition extends
            DefinitionStages.WithTargetResourceGroup,
            DefinitionStages.WithExecute,
            DefinitionStages.WithExecuteAndSubnet {
    }

    /**
     * Grouping of topology definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of topology parameters definition.
         */
        interface WithTargetResourceGroup {
            /**
             * Set the targetResourceId value.
             *
             * @param resourceGroupName the name of the target resource group to perform getTopology on
             * @return the Topology object itself.
             */
            DefinitionStages.WithExecute withTargetResourceGroup(String resourceGroupName);
        }

        /**
         * Sets the target virtual network.
         */
        interface WithTargetNetwork {
            /**
             * Set the target virtual network.
             *
             * @param networkId the target network id value to set
             * @return the Topology object itself.
             */
            DefinitionStages.WithExecuteAndSubnet withTargetNetwork(String networkId);
        }

        /**
         * Sets the target subnet.
         */
        interface WithTargetSubnet {
            /**
             * Set the subnetName value.
             *
             * @param subnetName the destinationIPAddress value to set
             * @return the Topology object itself.
             */
            DefinitionStages.WithExecute withTargetSubnet(String subnetName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for execution, but also allows
         * for any other optional settings to be specified.
         */
        interface WithExecute extends
                Executable<Topology>,
                DefinitionStages.WithTargetNetwork {
        }

        interface WithExecuteAndSubnet extends
                Executable<Topology>,
                DefinitionStages.WithTargetSubnet {
        }
    }
}