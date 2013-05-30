/*
 * Copyright 2013 Grails Community
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
package com.developerb.healthcontrol

/**
 * The allowed outcomes of a health control.
 *
 * @author Kim A. Betti <kim@developer-b.com>
 */
enum HealthLevel {

    /**
     * Everything is a-okay!
     */
    HEALTHY,

    /**
     * It's sorta working, but not as well as it's supposed to.
     * Broken SLA?
     */
    FRAIL,

    /**
     * Not even a little bit..
     * Completely useless
     */
    DEAD

}
