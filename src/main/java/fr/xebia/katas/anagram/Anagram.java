package fr.xebia.katas.anagram;

import java.util.List;

public class Anagram {

    private List<String> words;

    public Anagram() {
        this.words =  WordFileLoader.loadFileLines("words.txt");
    }

    public List<String> anagram(String word) {
        return null;
    }
}
