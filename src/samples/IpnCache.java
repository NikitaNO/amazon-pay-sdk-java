/******************************************************************************
 *  Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at:
 *  http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the
 *  specific language governing permissions and limitations under the
 *  License.
 * ****************************************************************************
 */

package samples;

import com.amazonservices.mws.offamazonpaymentsipn.cache.Cache;

public class IpnCache {
    private static Cache cache;

    public static Cache getInstance() {
        if(cache == null) {
            synchronized (IpnCache.class) {
                if(cache == null) {
                    cache = new Cache();
                }
            }
        }
        return cache;
    }
}
