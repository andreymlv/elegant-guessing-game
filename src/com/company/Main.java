package com.company;

import com.company.lib.*;

public class Main {

    public static void main(String[] args) {
        final int from = -256;
        final int to = 256;

        final int attempts = Math.toIntExact(
                Math.round(
                        Math.log(
                                Math.abs(from) + Math.abs(to)
                        ) / Math.log(2)
                )
        );

        final Secret secret = new Secret(from, to);
        secret.SayBounds();

        new Farewell(
                new Attempts(
                        new VerboseDiff(new Diff(secret)),
                        attempts
                ),
                secret
        ).say();
    }
}
