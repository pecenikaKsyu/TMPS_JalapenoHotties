package mafia_simulation.observer;

public enum Status {

    NO_ENEMY, FIGHT, LOST, RETURN, CHANGE_STRATEGY, WIN, ATTACK;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
