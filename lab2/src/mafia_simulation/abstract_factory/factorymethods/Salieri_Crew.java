package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.Crew;

public class Salieri_Crew implements Crew {
    static final String DESCRIPTION = "This is Don Salieri's Crew!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
