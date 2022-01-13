/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 Andrey Malov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.company.lib;

public abstract class WrappedNumber extends Number implements Comparable<Number> {
    private final Number wrapped;

    public WrappedNumber(Number wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public int intValue() {
        return wrapped.intValue();
    }

    @Override
    public long longValue() {
        return wrapped.longValue();
    }

    @Override
    public float floatValue() {
        return wrapped.floatValue();
    }

    @Override
    public double doubleValue() {
        return wrapped.doubleValue();
    }

    @Override
    public byte byteValue() {
        return wrapped.byteValue();
    }

    @Override
    public short shortValue() {
        return wrapped.shortValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrappedNumber that = (WrappedNumber) o;

        return wrapped.equals(that.wrapped);
    }

    @Override
    public int hashCode() {
        return wrapped.hashCode();
    }

    @Override
    public String toString() {
        return wrapped.toString();
    }

    @Override
    public int compareTo(Number o) {
        return Double.compare(this.doubleValue(), o.doubleValue());
    }
}
