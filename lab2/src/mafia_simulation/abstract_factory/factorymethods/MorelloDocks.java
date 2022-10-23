package mafia_simulation.abstract_factory.factorymethods;

import mafia_simulation.abstract_factory.Base;
import mafia_simulation.abstract_factory.Crew;
import mafia_simulation.abstract_factory.MafiaDon;
import mafia_simulation.abstract_factory.WhiskyFarm;

public class MorelloDocks implements WhiskyFarm {
    public Base createBase() {
        return new MorelloBar();
    }
    public MafiaDon createDon() {
        return new DON_Morello();
    }
    public Crew createCrew() {
        return new Morello_Crew();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
