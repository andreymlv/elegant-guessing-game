/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2022 Andrey Malov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
