package _project.controller.event_handlers.arithmetic;
public class Exponentiation implements ArithmeticStrategy{
    @Override
    public int calculate(int a, int b) {
        return (int) Math.pow(a,b);
    }

    @Override
    public String toString() {
        return " ^ ";
    }

}
