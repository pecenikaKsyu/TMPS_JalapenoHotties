package mafia_simulation.prototype;

public class Mayor extends Authorities {
    public Mayor() {}

    @Override
    public Authorities clone() throws CloneNotSupportedException {
        return new Mayor();
    }

    @Override
    public String toString() {
        return "Mayor Hank Turnbull, the most honest judge you know";
    }
}
