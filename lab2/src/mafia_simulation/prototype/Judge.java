package mafia_simulation.prototype;

public class Judge extends Court {
    public Judge() {}

    @Override
    public Court clone() throws CloneNotSupportedException {
        return new Judge();
    }

    @Override
    public String toString() {
        return "Judge Hillwood,";
    }
}
