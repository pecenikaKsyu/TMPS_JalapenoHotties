package mafia_simulation.observer;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private Status currentState;
    private List<GunFight> observers;

    public Activity() {
        observers = new ArrayList<>();
        currentState = Status.NO_ENEMY;
    }

    public void addObserver(GunFight observer) {
        observers.add(observer);
    }

    public void removeObserver(Status observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        Status[] enumValues = Status.values();
        currentState = enumValues[(currentState.ordinal() + 1) % enumValues.length];
        System.out.println("The battle state changed to " + currentState + ".");
        notifyObservers();
    }

    private void notifyObservers() {
        for (GunFight observer : observers) {
            observer.update(currentState);
        }
    }
}
