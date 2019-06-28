package _project.model.states;

import _project.controller.event_handlers.arithmetic.ArithmeticStrategy;
import _project.model.Calculation;

public class SettingN2State implements CalculationState {
    private Calculation calculation;

    public SettingN2State(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void prevState() {
        calculation.state = new ArithmeticState(calculation);
    }

    @Override
    public void nextState() {
        calculation.state = new SettingN1State(calculation);
    }

    @Override
    public void handleArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        prevState();
        calculation.setN1(calculation.getResult());
        calculation.setN2(0);
        calculation.setArithmeticStrategy(arithmeticStrategy);
    }

    @Override
    public void handleInput(int value) {
        calculation.setN2(calculation.concatNumbers(calculation.getN2(), value));
    }

    @Override
    public String print() {
        return Integer.toString(calculation.getN1()) + calculation.getArithmeticStrategy() + calculation.getN2();
    }
}
