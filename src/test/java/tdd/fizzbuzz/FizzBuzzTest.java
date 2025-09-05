package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        int order = 1;
        String word = FizzBuzz.countoff(order);
        assert word.equals("1");
    }

}
