package fr.xebia.katas.anagram;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;


public class WordFileLoaderTest {
    
    @Test
    public void should_load_word_file() throws Exception {
        List<String> words = WordFileLoader.loadFileLines("words.txt");
        assertTrue("Should have loaded file content", words.size() > 1000);
    }

    @Test(expected = RuntimeException.class)
    public void should_throw_runtime_exception_when_file_does_not_exists() throws Exception {
        WordFileLoader.loadFileLines("word.txt");
    }
}
