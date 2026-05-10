package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        System.out.print("TEst push 1");
        System.out.print("TEst push 2");
        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
