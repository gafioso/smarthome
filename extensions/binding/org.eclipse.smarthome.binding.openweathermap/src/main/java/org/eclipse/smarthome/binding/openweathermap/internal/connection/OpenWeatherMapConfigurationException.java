/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.openweathermap.internal.connection;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link OpenWeatherMapConfigurationException} is a configuration exception for the connections to OpenWeatherMap
 * API.
 *
 * @author Christoph Weitkamp - Initial contribution
 */
@NonNullByDefault
public class OpenWeatherMapConfigurationException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with null as its detail message.
     */
    public OpenWeatherMapConfigurationException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message Detail message
     */
    public OpenWeatherMapConfigurationException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified cause.
     *
     * @param cause The cause
     */
    public OpenWeatherMapConfigurationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     *
     * @param message Detail message
     * @param cause The cause
     */
    public OpenWeatherMapConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
