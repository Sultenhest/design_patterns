package _project.controller.event_handlers.arithmetic;

import java.util.HashMap;

public class ArithmeticFactory {
    private static final HashMap<String, ArithmeticStrategy> arithmeticCache = new HashMap<>();

    public static ArithmeticStrategy getArithmeticStrategy(String input) {
        ArithmeticStrategy strategy = arithmeticCache.get(input);

        if( strategy == null ) {
            switch (input) {
                case "+": strategy = new Addition();
                    break;
                case "-": strategy = new Subtraction();
                    break;
                case "*": strategy = new Multiplication();
                    break;
                case "/": strategy = new Division();
                    break;
                case "^": strategy = new Exponentiation();
                    break;
                default:  strategy = new NoArithmetic();
                    break;
            }

            arithmeticCache.put(input, strategy);
        }

        return strategy;
    }
}
