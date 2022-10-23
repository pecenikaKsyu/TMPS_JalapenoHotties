package mafia_simulation.builder;

public enum Profession {
    DRIVER, MECHANIC, GUNMAN, ASSASSIN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
