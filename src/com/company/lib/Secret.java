package com.company.lib;

import java.util.Random;

public final class Secret extends WrappedNumber {
    private final int from;
    private final int to;

    public Secret(int from, int to) {
        super(new Random().nextInt(from, to));
        this.from = from;
        this.to = to;
    }

    public Secret(int to) {
        this(0, to);
    }

    public Secret() {
        this(100);
    }

    public void SayBounds() {
        System.out.printf("The secret number is between %d and %d\n", from, to);
    }
}
