package com.company.lib;

import java.util.Scanner;

public final class Guess extends WrappedNumber {
    public Guess() {
        super(new Scanner(System.in).nextInt());
    }
}
