package _project.controller.event_handlers;

import _project.RequestType;
import _project.model.Calculation;

public abstract class ButtonEventHandler {
    private ButtonEventHandler next;

    ButtonEventHandler(ButtonEventHandler next) {
        this.next = next;
    }

    public Calculation handleRequest(String input, RequestType requestType, Calculation calculation) {
        if (next != null) {
            return next.handleRequest(input, requestType, calculation);
        }
        System.out.println("*** Cant handle request");
        return calculation;
    }
}
