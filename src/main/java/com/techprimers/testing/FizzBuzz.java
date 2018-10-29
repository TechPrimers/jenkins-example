package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");

        if (isMultipleOf(number, 3) && isMultipleOf(number, 5)) return "FizzBuzz";
        if (isMultipleOf(number, 3)) return "Fizz";
        if (isMultipleOf(number, 5)) return "Buzz";


        return String.valueOf(number);
    }

    private boolean isMultipleOf(int number, int i) {
        return number % i == 0;
    }
}
