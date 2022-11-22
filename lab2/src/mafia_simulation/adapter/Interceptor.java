package mafia_simulation.adapter;

import mafia_simulation.adapter.interfaces.ArmoredCar;

public class Interceptor  implements ArmoredCar {

    private Transport car;

    public Interceptor(){
        car = new Transport();
    }

    @Override
    public void attack(){
        System.out.println("Intercept the staff from that ********!");
    }

    @Override
    public void transport(){
        car.move();
    }
}
