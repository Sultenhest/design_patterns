package _project.controller;

import _project.RequestType;
import _project.controller.event_handlers.*;
import _project.model.Calculation;

public class CalculationController {
    private Calculation calculation;

    private ButtonEventHandler buttonEventHandlerChain;

    public CalculationController(Calculation calculation) {
        this.calculation = calculation;
        buttonEventHandlerChain = new NumericHandler(new ArithmeticHandler(new MemoryHandler(new NullHandler(null))));
    }

    public Calculation handleRequest(String input, RequestType requestType) {
        calculation = buttonEventHandlerChain.handleRequest(input, requestType, calculation);
        return calculation;
    }
}
