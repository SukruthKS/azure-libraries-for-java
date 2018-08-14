/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.resources.fluentcore.dag;

import com.microsoft.azure.v2.management.resources.fluentcore.model.Indexable;
import io.reactivex.annotations.NonNull;

import java.util.Objects;

/**
 * Represents an index-able model, when used as return type of a method,
 * it indicates invocation of the method may cause side-effect but does
 * not produce a value.
 */
public final class VoidIndexable implements Indexable {
    /**
     * The key.
     */
    private final String key;

    /**
     * Creates VoidIndexable.
     *
     * @param key the key.
     */
    public VoidIndexable(@NonNull String key) {
        this.key = Objects.requireNonNull(key);
    }

    @Override
    public String key() {
        return this.key;
    }
}