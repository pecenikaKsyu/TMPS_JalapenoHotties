package mafia_simulation.prototype;

public class Police extends CityPower {
    public Police() {}

    @Override
    public CityPower clone() throws CloneNotSupportedException {
        return new Police();
    }

    @Override
    public String toString() {
        return "Hands up! Drop your weapon!";
    }

}
