package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.MafiaDon;

public class DON_Morello implements MafiaDon {
    static final String DESCRIPTION = "This is Don Morello!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
