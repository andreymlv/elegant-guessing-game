package com.company.lib;

public final class Attempts {
    private final VerboseDiff verboseDiff;
    private final int count;

    public Attempts(VerboseDiff verboseDiff, int count) {
        this.verboseDiff = verboseDiff;
        this.count = count;
    }

    public boolean IsReadyToSayGoodbye() {
        boolean result = false;
        for (int i = 0; i < count; i++) {
            System.out.printf("%d attempts left\n", count - i);
            if (verboseDiff.IsAttemptCorrect() == 0) {
                result = true;
                break;
            }
        }
        return result;
    }
}
