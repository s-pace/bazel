// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.skylarkbuildapi;

import com.google.devtools.build.lib.skylarkinterface.SkylarkModule;
import com.google.devtools.build.lib.skylarkinterface.SkylarkModuleCategory;

/**
 * Provider for structs containing actions created during the analysis of a rule.
 */
@SkylarkModule(name = "Actions",
    doc = "<i>(Note: This is a provider type. Don't instantiate it yourself; use it to retrieve a "
        + "provider object from a <a href=\"Target.html\">Target</a>.)</i>"
        + "<br/><br/>"
        + "Provides access to the <a href=\"Action.html\">actions</a> generated by a rule. "
        + "There is one field, <code>by_file</code>, which is a dictionary from an output "
        + "of the rule to its corresponding generating action. "
        + "<br/><br/>"
        + "This is designed for testing rules, and should not be accessed outside "
        + "of test logic. This provider is only available for targets generated by rules "
        + "that have <a href=\"globals.html#rule._skylark_testable\">_skylark_testable</a> "
        + "set to <code>True</code>.",
    category = SkylarkModuleCategory.PROVIDER)
// TODO(cparsons): Deprecate and remove this API.
public interface ActionsInfoProviderApi extends ProviderApi {}