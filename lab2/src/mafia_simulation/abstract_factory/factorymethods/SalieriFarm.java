package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.Base;
import mafia_simulation.abstract_factory.Crew;
import mafia_simulation.abstract_factory.MafiaDon;
import mafia_simulation.abstract_factory.WhiskyFarm;

public class SalieriFarm implements WhiskyFarm {
    public Base createBase() {
        return new SalieriBar();
    }
    public MafiaDon createDon() {
        return new DON_Salieri();
    }
    public Crew createCrew() {
        return new Salieri_Crew();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
