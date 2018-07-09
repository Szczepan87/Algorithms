package AlgorytmyCwiczenia.Strings;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {

        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String p1Won = "Player 1 won!";
        String p2Won = "Player 2 won!";
        String draw = "Draw!";

        if (p1.equals(rock) && p2.equals(scissors)) return p1Won;
        else if (p1.equals(paper) && p2.equals(rock)) return p1Won;
        else if (p1.equals(scissors) && p2.equals(paper)) return p1Won;
        else if (p1.equals(p2)) return draw;
        else return p2Won;
    }
}
