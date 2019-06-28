package _project.controller.event_handlers;

import _project.RequestType;
import _project.model.Calculation;

public class MemoryHandler extends ButtonEventHandler {
    public MemoryHandler(ButtonEventHandler handler) {
        super(handler);
    }

    @Override
    public Calculation handleRequest(String input, RequestType requestType, Calculation calculation) {
        if( requestType == RequestType.MEMORY ) {
            calculation.reset();
            return calculation;
        } else {
            return super.handleRequest(input, requestType, calculation);
        }
    }
}
