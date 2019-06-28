package _project.model.states;

import _project.controller.event_handlers.arithmetic.ArithmeticStrategy;

public interface CalculationState {
    void prevState();
    void nextState();
    void handleArithmeticStrategy(ArithmeticStrategy arithmeticStrategy);
    void handleInput(int value);
    String print();
}
