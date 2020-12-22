/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.shiro.config.ogdl;

import org.apache.shiro.config.ConfigurationException;

/**
 * Exception thrown when a reference to an object is made, but that object cannot be found.  This is most likely
 * thrown due to a configuration line that references an object that hasn't been defined yet.
 *
 * @since 0.9 RC2
 */
public class UnresolvableReferenceException extends ConfigurationException {

    /**
     * Creates a new UnresolvableReferenceException.
     */
    public UnresolvableReferenceException() {
        super();
    }

    /**
     * Constructs a new UnresolvableReferenceException.
     *
     * @param message the reason for the exception
     */
    public UnresolvableReferenceException(String message) {
        super(message);
    }

    /**
     * Constructs a new UnresolvableReferenceException.
     *
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public UnresolvableReferenceException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new UnresolvableReferenceException.
     *
     * @param message the reason for the exception
     * @param cause   the underlying Throwable that caused this exception to be thrown.
     */
    public UnresolvableReferenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
