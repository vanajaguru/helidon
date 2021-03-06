/*
 * Copyright (c) 2019, 2020 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Provides classes and interfaces for automatically discovering
 * service configuration information relevant to <a
 * href="https://docs.oracle.com/en/database/oracle/oracle-database/19/jjucp/index.html"
 * target="_parent">Oracle Universal Connection Pool</a> componentry.
 *
 * @see io.helidon.service.configuration.ucp.UCPServiceConfiguration
 *
 * @deprecated This package is slated for removal.
 */
module io.helidon.service.configuration.ucp {
    requires io.helidon.service.configuration.api;
    requires java.sql;

    exports io.helidon.service.configuration.ucp;
}
