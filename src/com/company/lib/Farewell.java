package com.company.lib;

public final class Farewell {
    private final Attempts attempts;
    private final Secret secret;

    public Farewell(Attempts attempts, Secret secret) {
        this.attempts = attempts;
        this.secret = secret;
    }

    public void say() {
        if (attempts.IsReadyToSayGoodbye()) {
            System.out.println("Thanks for playing the game!");
        } else {
            System.out.println("Sorry your attempts is over :(");
            System.out.printf("The secret number is %s\n", secret);
        }
    }
}
