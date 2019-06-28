package _project.controller.event_handlers;

import _project.RequestType;
import _project.model.Calculation;

public class NumericHandler extends ButtonEventHandler {
    public NumericHandler(ButtonEventHandler handler) {
        super(handler);
    }

    @Override
    public Calculation handleRequest(String input, RequestType requestType, Calculation calculation) {
        if( requestType == RequestType.NUMERIC ) {
            int value = Integer.parseInt(input);
            calculation.handleInput(value);
            return calculation;
        } else {
            return super.handleRequest(input, requestType, calculation);
        }
    }
}
