/*
 * Copyright 2013 Prometheus Team Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.prometheus.client.utility.labels;

/**
 * <p>
 * Some prefabricated and <em>optional</em> labels for working with
 * outcome-oriented operations.
 * </p>
 *
 * @author matt.proud@gmail.com (Matt T. Proud)
 */
public enum Outcome {
  RESULT("result"), SUCCESS("success"), FAILURE("failure");

  private final String name;

  private Outcome(final String name) {
    this.name = name;
  }

  public String label() {
    return name;
  }
}
