/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.qa.cucumber.runner;

import cucumber.runtime.HookDefinition;

import java.util.Comparator;

class HookComparator implements Comparator<HookDefinition> {
    private final boolean ascending;

    HookComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(HookDefinition hook1, HookDefinition hook2) {
        int x = hook1.getOrder();
        int y = hook2.getOrder();
        return ascending ? Integer.compare(x, y) : Integer.compare(y, x);
    }
}
