package com.company;

import com.company.lib.*;

public class Main {
    public static void main(String[] args) {
        final Secret secret = new Secret();
        secret.SayBounds();
        new Farewell(
                new Attempts(
                        new VerboseDiff(new Diff(secret)),
                        8
                ),
                secret
        ).say();
    }
}
