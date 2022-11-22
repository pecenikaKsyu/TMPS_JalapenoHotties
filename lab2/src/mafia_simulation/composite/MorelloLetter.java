package mafia_simulation.composite;

import mafia_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorelloLetter {

    public LetterComposite messageFromMorello(){

        List<Word> words = new ArrayList<>();

        // "We will return our money"
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'), new Letter('l'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('r'), new Letter('e'), new Letter('t'), new Letter('u'), new Letter('r'), new Letter('n'))));
        words.add(new Word(Arrays.asList(new Letter('o'), new Letter('u'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('m'), new Letter('o'), new Letter('n'), new Letter('e'), new Letter('y'))));

        return new Sentence(words);
    }
}
