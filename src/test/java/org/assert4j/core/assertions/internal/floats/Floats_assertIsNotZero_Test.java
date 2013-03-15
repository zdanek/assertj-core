/*
 * Created on Oct 21, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assert4j.core.assertions.internal.floats;

import static org.assert4j.core.assertions.test.TestData.someInfo;

import static org.junit.Assert.assertEquals;

import org.assert4j.core.assertions.core.AssertionInfo;
import org.assert4j.core.assertions.internal.Floats;
import org.assert4j.core.assertions.internal.FloatsBaseTest;
import org.junit.Test;


/**
 * Tests for <code>{@link Floats#assertIsNegative(AssertionInfo, Float)}</code>.
 * 
 * @author Alex Ruiz
 * @author Joel Costigliola
 */
public class Floats_assertIsNotZero_Test extends FloatsBaseTest {

  @Test
  public void should_succeed_since_actual_is_not_zero() {
    floats.assertIsNotZero(someInfo(), 2.0f);
  }

  @Test
  public void should_fail_since_actual_is_zero() {
    try {
      floats.assertIsNotZero(someInfo(), 0.0f);
    } catch (AssertionError e) {
      assertEquals(e.getMessage(), "<0.0f> should not be equal to:<0.0f>");
    }
  }

  @Test
  public void should_succeed_since_actual_is_not_zero_whatever_custom_comparison_strategy_is() {
    floatsWithAbsValueComparisonStrategy.assertIsNotZero(someInfo(), 2.0f);
  }

  @Test
  public void should_fail_since_actual_is_zero_whatever_custom_comparison_strategy_is() {
    try {
      floatsWithAbsValueComparisonStrategy.assertIsNotZero(someInfo(), 0.0f);
    } catch (AssertionError e) {
      assertEquals(e.getMessage(), "<0.0f> should not be equal to:<0.0f>");
    }
  }

}