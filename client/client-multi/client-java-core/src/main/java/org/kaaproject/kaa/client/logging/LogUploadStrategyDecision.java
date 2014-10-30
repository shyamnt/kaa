/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.client.logging;

/**
 * Describes all possible decisions for a log upload strategy ({@link LogUploadStrategy}).
 */
public enum LogUploadStrategyDecision {
    /**
     * Do nothing except adding log record to a storage.
     */
    NOOP,
    /**
     * Kaa SDK should initiate log upload on the Operation server.
     */
    UPLOAD,
    /**
     * A memory size occupied by logs is exceeded a maximum allowed size for storage.
     * Forced deletion of the elder logs should be initiated.
     */
    CLEANUP
}