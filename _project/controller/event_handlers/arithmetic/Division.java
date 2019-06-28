package _project.controller.event_handlers.arithmetic;

class Division implements ArithmeticStrategy {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }

    @Override
    public String toString() {
        return " / ";
    }
}
