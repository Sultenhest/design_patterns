package _project.controller.event_handlers;

import _project.RequestType;
import _project.model.Calculation;

public class NullHandler extends ButtonEventHandler {
    public NullHandler(ButtonEventHandler handler) {
        super(handler);
    }

    @Override
    public Calculation handleRequest(String input, RequestType requestType, Calculation calculation) {
        return calculation;
    }
}