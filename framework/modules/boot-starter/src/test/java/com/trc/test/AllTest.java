/*
 * Copyright 2020. the original author or authors.
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

package com.trc.test;


import com.trc.test.auth.AuthTest;
import com.trc.test.cluster.ClusterTest;
import com.trc.test.notification.NotifyIntegrationTest;
import com.trc.test.web.WebTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * All test.
 *
 * @author gudaoxuri
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AllTest {

    @Autowired
    private ClusterTest clusterTest;

    @Autowired
    private WebTest webTest;

    @Resource
    private AuthTest authTest;

    @Resource
    private NotifyIntegrationTest notifyIntegrationTest;

    /**
     * Test all.
     *
     * @throws Exception the exception
     */
    @Test
    public void testAll() throws Exception {
        clusterTest.testAll();
        webTest.testAll();
        authTest.testAll();
        notifyIntegrationTest.testAll();
    }

}
