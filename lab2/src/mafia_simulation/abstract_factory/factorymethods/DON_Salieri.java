package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.MafiaDon;

public class DON_Salieri implements MafiaDon {
    static final String DESCRIPTION = "This is Don Salieri!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
