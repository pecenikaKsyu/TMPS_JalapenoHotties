package mafia_simulation.builder;

public enum Weapon {
    TommyGun, Colt045, SmithWeson;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

