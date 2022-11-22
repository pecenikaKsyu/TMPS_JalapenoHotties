package mafia_simulation.composite;

import mafia_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalieriLetter {

    public LetterComposite messageFromSalieri(){

        List<Word> words = new ArrayList<>();

        // "We will protect the city from you"
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'), new Letter('l'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('p'), new Letter('r'), new Letter('o'), new Letter('t'), new Letter('e'), new Letter('c'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('c'), new Letter('i'), new Letter('t'), new Letter('y'))));
        words.add(new Word(Arrays.asList(new Letter('f'), new Letter('r'), new Letter('o'), new Letter('m'))));
        words.add(new Word(Arrays.asList(new Letter('y'), new Letter('o'), new Letter('u'))));

        return new Sentence(words);
    }
}
