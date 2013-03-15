/*
 * Created on Oct 20, 2010
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
package org.assert4j.core.assertions.api.abstract_;

import org.assert4j.core.assertions.api.AbstractAssert;
import org.assert4j.core.assertions.api.AbstractAssertBaseTest;
import org.assert4j.core.assertions.api.ConcreteAssert;

import static org.mockito.Mockito.verify;


/**
 * Tests for <code>{@link AbstractAssert#isNotEqualTo(Object)}</code>.
 * 
 * @author Alex Ruiz
 */
public class AbstractAssert_isNotEqualTo_Test extends AbstractAssertBaseTest {

  @Override
  protected ConcreteAssert invoke_api_method() {
    return assertions.isNotEqualTo(new Long(8L));
  }

  @Override
  protected void verify_internal_effects() {
    verify(objects).assertNotEqual(getInfo(assertions), getActual(assertions), 8L);
  }
}