/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Alexandre Normand
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.glukit.sync.api;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;

/**
 * High-level glucose read.
 *
 * @author alexandre.normand
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class GlucoseRead extends TimestampedValue {
  private float value;
  private Unit unit;

  public GlucoseRead(Instant internalTime, LocalDateTime localTime, float value, Unit unit) {
    super(internalTime, localTime);
    this.value = value;
    this.unit = unit;
  }

  public float getValue() {
    return value;
  }

  public Unit getUnit() {
    return unit;
  }

  public static enum Unit {
    MMOL_PER_L, MG_PER_DL;
  }
}
