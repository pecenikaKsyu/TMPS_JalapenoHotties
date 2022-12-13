package mafia_simulation.chain_of_responsability;

import mafia_simulation.chain_of_responsability.abstractions.RequestHandler;

public class Boss {

    RequestHandler chain;

    public Boss() {
        buildChain();
    }

    private void buildChain() {
        chain = new Capo(new Driver(new Lieutenant(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }


}
