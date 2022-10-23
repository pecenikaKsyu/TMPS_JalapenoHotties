package mafia_simulation.builder;

public enum Suit {
    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    private String title;

    Suit(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
