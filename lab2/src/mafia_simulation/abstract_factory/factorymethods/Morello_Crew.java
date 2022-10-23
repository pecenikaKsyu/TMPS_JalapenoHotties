package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.Crew;

public class Morello_Crew implements Crew {
    static final String DESCRIPTION = "This is the Don Morello's Crew!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}