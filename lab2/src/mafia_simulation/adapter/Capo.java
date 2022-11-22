package mafia_simulation.adapter;

import mafia_simulation.adapter.interfaces.ArmoredCar;

/** The Capo class is the client in the pattern **/

public class Capo implements ArmoredCar {

    private ArmoredCar ArmoredCar;

    public Capo() {

    }

    public Capo(ArmoredCar ArmoredCar) {
        this.ArmoredCar = ArmoredCar;
    }

    public void setBattleship(ArmoredCar ArmoredCar) {
        this.ArmoredCar = ArmoredCar;
    }

    @Override
    public void attack() {
        ArmoredCar.attack();
    }

    @Override
    public void transport() {
        ArmoredCar.transport();
    }
}
