/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIp
{
    @Test(groups = "fast")
    public void testIntToIp() throws Exception
    {
        Assert.assertEquals(Ip.intToIp(-1), "255.255.255.255");
        Assert.assertEquals(Ip.intToIp(0), "0.0.0.0");
        Assert.assertEquals(Ip.intToIp(0x7F103401), "127.16.52.1");
    }

    @Test(groups = "fast")
    public void testIpToString() throws Exception
    {
        Assert.assertEquals(Ip.ipToInt("255.255.255.255"), -1);
        Assert.assertEquals(Ip.ipToInt("0.0.0.0"), 0);
        Assert.assertEquals(Ip.ipToInt("127.16.52.1"), 0x7F103401);
    }

    @Test(groups = "fast")
    public void testIpNull() throws Exception
    {
        Assert.assertEquals(Ip.ipToInt(null), 0);
    }
}
