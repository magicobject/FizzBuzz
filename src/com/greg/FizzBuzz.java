/**
 * Simple FizzBuzz class
 *
 * The static method generateFizzBuzz returns a string depending on its integer input parameter
 * "fizz" if the parameter is divisible by 3
 * "buzz" if the parameter is divisible by 5
 * "fizz buzz" is the value is divisible by both 3 and 5
 * It throws an exception if the value is not a positive integer
 */
package com.greg;

public class FizzBuzz {

    public static String generateFizzBuzz(int value) throws IllegalArgumentException {

        if (value < 1) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        String fizzBuzzString = "";
        int matchModuloCount = 0;

        if (value % 3 == 0) {
            fizzBuzzString = "fizz";
            matchModuloCount++;
        }
        if (value % 5 == 0 ) {
            fizzBuzzString = "buzz";
            matchModuloCount++;
        }

        if (matchModuloCount == 2) {
            fizzBuzzString = "fizz buzz";
        }

        return fizzBuzzString;
    }
}
