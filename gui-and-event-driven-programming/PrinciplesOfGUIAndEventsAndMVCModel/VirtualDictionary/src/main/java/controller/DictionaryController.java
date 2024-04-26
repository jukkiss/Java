package controller;
import model.Dictionary;
public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
        initializeDictionary();
    }

    private void initializeDictionary() {
        dictionary.addWord("test", "A method used to assess someone's coding skills.");
        dictionary.addWord("paper", "An item that is not suitable for testing someone's coding skills and understanding.");
    }

    public String search(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }
        return dictionary.searchWord(word.trim());
    }
}

