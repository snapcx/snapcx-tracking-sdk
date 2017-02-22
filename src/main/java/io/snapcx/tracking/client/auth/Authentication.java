/**
 * snapCX - Shippping Tracking API for commerce & retailers.
 * This API provides real time shipping tracking status (along with tracking events) for multiple carriers. It takes carrier code (UPS or USPS or FEDEX or DHL Or Canada Post) and tracking number as input. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@snapcx.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.snapcx.tracking.client.auth;

import io.snapcx.tracking.client.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
