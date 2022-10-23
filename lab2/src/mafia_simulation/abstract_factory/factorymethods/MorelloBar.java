package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.Base;

public class MorelloBar implements Base {
    static final String DESCRIPTION = "This is Morello's Bar Base!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
