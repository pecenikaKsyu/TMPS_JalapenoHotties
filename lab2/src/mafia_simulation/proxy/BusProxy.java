package mafia_simulation.proxy;

public class BusProxy extends Bus{

    private static  final int NUM_PEOPLE_ALLOWED = 5;
    private int numPeople;

    @Override
    public void onBoard(People people){
        if (numPeople < NUM_PEOPLE_ALLOWED){
            super.onBoard(people);
            numPeople++;
        } else {
            System.out.println( people + " is not allowed to enter.");
        }
    }
}
