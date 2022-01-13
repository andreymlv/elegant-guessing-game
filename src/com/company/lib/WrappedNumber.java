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
