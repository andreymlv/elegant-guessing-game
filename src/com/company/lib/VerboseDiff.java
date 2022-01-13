package com.company.lib;

public final class VerboseDiff {
    private final Diff diff;

    public VerboseDiff(Diff diff) {
        this.diff = diff;
    }

    public int IsAttemptCorrect() {
        int result = diff.Compare();
        if (result == 0) {
            System.out.println("Match!");
        } else if (result < 0) {
            System.out.println("Secret number is smaller than guessed.");
        } else {
            System.out.println("Secret number is bigger than guessed.");
        }
        return result;
    }

}
