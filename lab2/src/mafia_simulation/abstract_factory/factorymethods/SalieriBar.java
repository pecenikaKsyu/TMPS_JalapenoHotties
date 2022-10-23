package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.Base;

public class SalieriBar implements Base {
    static final String DESCRIPTION = "This is Salieri's Crew Base!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
