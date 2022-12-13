package mafia_simulation.chain_of_responsability;

import mafia_simulation.chain_of_responsability.abstractions.RequestHandler;
import mafia_simulation.chain_of_responsability.enums.RequestType;

public class Lieutenant extends RequestHandler {

    public Lieutenant(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.READY_THE_CAR)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Car with a simple Guy with a simple Gun";
    }
}
