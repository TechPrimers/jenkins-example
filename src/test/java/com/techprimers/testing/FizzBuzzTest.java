package com.techprimers.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    public FizzBuzz fB;

//    @
    @Before
    public void setUp() {
        fB = new FizzBuzz();
    }

//    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assert.assertEquals(fizzBuzz, "1");
    }

//    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assert.assertEquals(fizzBuzz, "Fizz");
    }

//    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assert.assertEquals(fizzBuzz, "Buzz");
    }

//    @DisplayName("Don't Play FizzBuzz with number = 0")
//    @Test
//    public void testZero() {
//
//        Assert.assertThat(IllegalArgumentException.class,
//                () -> fB.play(0));
//    }

//    @AfterEach
    @After
    public void tearDown() {
        fB = null;
    }

}