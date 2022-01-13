package com.company.lib;

import java.util.Scanner;

public class Guess extends WrappedNumber {
    public Guess() {
        super(new Scanner(System.in).nextInt());
    }
}
