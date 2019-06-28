package _project.model.states;

import _project.controller.event_handlers.arithmetic.ArithmeticStrategy;
import _project.model.Calculation;

public class SettingN1State implements CalculationState {
    private Calculation calculation;

    public SettingN1State(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void prevState() {
        //should not happen;
    }

    @Override
    public void nextState() {
        calculation.state = new ArithmeticState(calculation);
    }

    @Override
    public void handleArithmeticStrategy(ArithmeticStrategy arithmeticStrategy) {
        nextState();
        calculation.setArithmeticStrategy(arithmeticStrategy);
    }

    @Override
    public void handleInput(int value) {
        if(calculation.getN1() == 0) {
            calculation.setN1(value);
        } else {
            calculation.setN1(calculation.concatNumbers(calculation.getN1(), value));
        }
    }

    @Override
    public String print() {
        if( calculation.getN1() == 0 ) {
            return "";
        }
        return Integer.toString(calculation.getN1());
    }
}
