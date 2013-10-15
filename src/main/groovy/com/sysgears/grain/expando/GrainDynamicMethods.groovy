/*
 * Copyright (c) 2013 SysGears, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sysgears.grain.expando

import javax.inject.Inject
import javax.inject.Named

/**
 * Grain extension methods to standard Groovy classes registrar.  
 */
@Named
@javax.inject.Singleton
public class GrainDynamicMethods {

    /** Map extension methods */
    @Inject private MapDynamicMethods mapDynamicMethods

    /**
     * Registers all the Grain extension methods to standard Groovy classes.
     */
    public void register() {
        mapDynamicMethods.register()
    }
}
