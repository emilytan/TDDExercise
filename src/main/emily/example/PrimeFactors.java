package emily.example;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactors {

    public static List<Integer> primeFactor(int number) {
        List<Integer> factors = new ArrayList<>();

        if (number > 1) {
            for (int divisor = 2; number > 1; divisor++) {
                while (number % divisor == 0) {
                    factors.add(divisor);
                    number = number/ divisor;
                }
            }
        }
        return factors;
    }

}
