package _project.model.states;

import _project.controller.event_handlers.arithmetic.ArithmeticStrategy;
import _project.model.Calculation;

public class ArithmeticState implements CalculationState {
    private Calculation calculation;

    public ArithmeticState(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void prevState() {
        calculation.state = new SettingN1State(calculation);
    }

    @Override
    public void nextState() {
        calculation.state = new SettingN2State(calculation);
    }

    @Override
    public void handleArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        calculation.setArithmeticStrategy(arithmeticStrategy);
    }

    @Override
    public void handleInput(int value) {
        nextState();
        calculation.setN2(value);
    }

    @Override
    public String print() {
        return Integer.toString(calculation.getN1()) + calculation.getArithmeticStrategy();
    }
}
