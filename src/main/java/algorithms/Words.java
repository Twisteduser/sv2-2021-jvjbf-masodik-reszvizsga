package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Words {
    List<String> words = new ArrayList<>();

    public void addWord(String word){
        if (word.contains(" ")){
            throw new IllegalArgumentException("It should be one word!");
        }
        if (!word.equals(word.toLowerCase())){
            throw new IllegalArgumentException("Word should be lower case!");
        }
        words.add(word);
    }
    public boolean isThereAWordTwice() {
        for (int i = 0; i < words.size(); i++) {
            for (int w = i + 1; w < words.size(); w++)
                if (words.get(w).equals(words.get(i))) {
                    return true;
                }
        }
        return false;
    }

    public List<String> getWords() {
        return words;
    }
}
