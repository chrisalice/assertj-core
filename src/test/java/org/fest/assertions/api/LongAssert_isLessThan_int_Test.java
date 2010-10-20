/*
 * Created on Oct 20, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.fest.assertions.internal.Longs;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link LongAssert#isLessThan(long)}</code>.
 *
 * @author Alex Ruiz
 */
public class LongAssert_isLessThan_int_Test {

  private Longs Longs;
  private LongAssert assertions;

  @Before public void setUp() {
    Longs = mock(Longs.class);
    assertions = new LongAssert(6L);
    assertions.longs = Longs;
  }

  @Test public void should_verify_that_actual_is_less_than_expected() {
    assertions.isLessThan(8);
    verify(Longs).assertLessThan(assertions.info, assertions.actual, 8);
  }

  @Test public void should_return_this() {
    LongAssert returned = assertions.isLessThan(8);
    assertSame(assertions, returned);
  }
}