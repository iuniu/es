/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.client.ml;

import org.elasticsearch.test.ESTestCase;

public class DeleteFilterRequestTests extends ESTestCase {

    public void test_WithNullFilter() {
        NullPointerException ex = expectThrows(NullPointerException.class, () -> new DeleteFilterRequest(null));
        assertEquals("[filter_id] is required", ex.getMessage());
    }

    public void test_instance() {
        String filterId = randomAlphaOfLengthBetween(2, 10);
        DeleteFilterRequest deleteFilterRequest = new DeleteFilterRequest(filterId);
        assertEquals(deleteFilterRequest.getId(), filterId);
    }
}
