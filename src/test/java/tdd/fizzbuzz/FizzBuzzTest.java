package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        int order = 1;
        String word = FizzBuzz.countoff(order);
        assertEquals ("1", word);
    }
    @Test
    public void should_return_2_when_input_2() {
        int order = 2;
        String word = FizzBuzz.countoff(order);
        assertEquals("2", word);
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        int order = 3;
        String word = FizzBuzz.countoff(order);
        assertEquals("Fizz", word);
    }

    @Test
    public void should_return_Buzz_when_input_5() {
        int order = 5;
        String word = FizzBuzz.countoff(order);
        assertEquals("Buzz", word);
    }

    @Test
    public void should_return_FizzBuzz_when_input_15() {
        int order = 15;
        String word = FizzBuzz.countoff(order);
        assertEquals("FizzBuzz", word);
    }
}




