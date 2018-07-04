package AlgorytmyCwiczenia;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void exampleTests() {
        Anagram k = new Anagram();
        assertFalse(k.isAnagram("apple", "pale"));
    }

    @Test
    public void test1() {
        Anagram k = new Anagram();
        assertTrue(k.isAnagram("foefet", "toffee"));
    }

    @Test
    public void test2() {
        Anagram k = new Anagram();
        assertTrue(k.isAnagram("Buckethead", "DeathCubeK"));
    }

    @Test
    public void test3() {
        Anagram k = new Anagram();
        assertTrue(k.isAnagram("Twoo", "Woot"));
    }
}