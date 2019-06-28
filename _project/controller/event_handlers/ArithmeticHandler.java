package _project.controller.event_handlers;

import _project.RequestType;
import _project.controller.event_handlers.arithmetic.ArithmeticStrategy;
import _project.controller.event_handlers.arithmetic.ArithmeticFactory;
import _project.model.Calculation;

public class ArithmeticHandler extends ButtonEventHandler {
    private final ArithmeticFactory arithmeticFactory = new ArithmeticFactory();

    public ArithmeticHandler(ButtonEventHandler handler) {
        super(handler);
    }

    @Override
    public Calculation handleRequest(String input, RequestType requestType, Calculation calculation) {
        if( requestType == RequestType.ARITHMETIC ) {
            ArithmeticStrategy arithmetic = getArithmetic(input);
            calculation.handleArithmeticStrategy(arithmetic);
            return calculation;
        } else {
            return super.handleRequest(input, requestType, calculation);
        }
    }

    private ArithmeticStrategy getArithmetic(String arithmetic) {
        return arithmeticFactory.getArithmeticStrategy(arithmetic);
    }
}
