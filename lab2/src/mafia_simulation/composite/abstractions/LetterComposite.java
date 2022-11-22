package mafia_simulation.composite.abstractions;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

    private List<LetterComposite> letterComposites = new ArrayList<>();

    public void add (LetterComposite letter) {
        letterComposites.add(letter);
    }

    public int count(){
        return letterComposites.size();
    }

    protected abstract void printBefore();
    protected abstract void printAfter();

    public void print(){
        printBefore();
        for (LetterComposite letter : letterComposites){
            letter.print();
        }
        printAfter();
    }
}
