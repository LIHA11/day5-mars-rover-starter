package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countoff(int order) {
        StringBuilder result = new StringBuilder();
        if (order % 3 == 0) {
            result.append("Fizz");
        }
        if (order % 5 == 0) {
            result.append("Buzz");
        }
        return result.length() > 0 ? result.toString() : String.valueOf(order);
    }
}
