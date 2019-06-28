package _project.controller.event_handlers.arithmetic;

public class NoArithmetic implements ArithmeticStrategy {
    @Override
    public int calculate(int a, int b) {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
