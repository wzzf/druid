/*
 * Druid - a distributed column store.
 * Copyright 2012 - 2015 Metamarkets Group Inc.
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

package io.druid.query.topn;

import io.druid.segment.Cursor;
import io.druid.segment.DimensionSelector;

/**
 */
public class TopNParams
{
  private final DimensionSelector dimSelector;
  private final Cursor cursor;
  private final int cardinality;
  private final int numValuesPerPass;

  protected TopNParams(
      DimensionSelector dimSelector,
      Cursor cursor,
      int cardinality,
      int numValuesPerPass
  )
  {
    this.dimSelector = dimSelector;
    this.cursor = cursor;
    this.cardinality = cardinality;
    this.numValuesPerPass = numValuesPerPass;
  }

  public DimensionSelector getDimSelector()
  {
    return dimSelector;
  }

  public Cursor getCursor()
  {
    return cursor;
  }

  public int getCardinality()
  {
    return cardinality;
  }

  public int getNumValuesPerPass()
  {
    return numValuesPerPass;
  }
}
