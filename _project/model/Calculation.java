package _project.model;

import _project.controller.event_handlers.arithmetic.ArithmeticStrategy;
import _project.model.states.ArithmeticState;
import _project.model.states.CalculationState;
import _project.model.states.SettingN1State;
import _project.model.states.SettingN2State;

public class Calculation {
    public CalculationState state = new SettingN1State(this);

    private ArithmeticStrategy arithmeticStrategy = null;
    private int n1 = 0;
    private int n2 = 0;

    public Calculation() {}

    public ArithmeticStrategy getArithmeticStrategy() {
        return arithmeticStrategy;
    }

    public void setArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        /*if(arithmeticStrategy == null) {
            state.prevState();
            state.prevState();
        }*/
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void handleArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        state.handleArithmeticStrategy(arithmeticStrategy);
    }

    public void handleInput(int value) {
        state.handleInput(value);
    }

    public int concatNumbers(int a, int b) {
        String concat = Integer.toString(a) + b;
        return Integer.parseInt(concat);
    }

    public int getResult() {
        if(getArithmeticStrategy() == null || getN1() == 0 || getN2() == 0 ) {
            return getN1();
        }
        return getArithmeticStrategy().calculate(getN1(), getN2());
    }

    public void reset() {
        setN1(0);
        setN2(0);
        this.state = new SettingN1State(this);
        setArithmeticStrategy(null);
    }

    @Override
    public String toString() {
        return state.print();
    }
}
