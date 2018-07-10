package AlgorytmyCwiczenia.Strings;

public class HookedOnAFeeling {
    public static void sing(int length) {

        String song = "";

        while (song.length() < length) {
            song += "ukaczakaukauka";
        }

        System.out.println(song);
    }
}
