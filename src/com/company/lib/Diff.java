package com.company.lib;

public final class Diff {
    private final Secret secret;

    public Diff(Secret secret) {
        this.secret = secret;
    }

    public int Compare() {
        System.out.print("Make a guess: ");
        return secret.compareTo(new Guess());
    }
}
