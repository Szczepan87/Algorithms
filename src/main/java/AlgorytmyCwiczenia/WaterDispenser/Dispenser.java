package AlgorytmyCwiczenia.WaterDispenser;

public class Dispenser {

    private int[] coins;
    private int ones = 0;
    private int twos = 0;
    private int fives = 0;

    private final String WATER = "WATER";
    private final String LEMON = " + LEMON";
    private final String RASPBERRY = " + RASPBERRY";
    private final String RETURN_MONEY = "MONEY RETURNED!";
    private boolean startPressed = false;

    public Dispenser(int[] coins) {
        if (coins.length<=3) this.coins = coins;
    }

    public String pressStart() {
        startPressed = true;

        setCoinsCount();

        if (startPressed && fives == 1 && twos == 1 && ones == 1) return WATER + RASPBERRY;
        else if (startPressed && fives == 1 && twos == 1 && ones == 0) return WATER + LEMON;
        else if (startPressed && fives == 1 && twos == 0 && ones == 0) return WATER;
        else if (startPressed && fives == 0 && twos == 1 && ones == 0) return RETURN_MONEY;
        else if (startPressed && fives == 0 && twos == 0 && ones == 1) return RETURN_MONEY;
        else if (startPressed && fives == 0 && twos == 1 && ones == 1) return RETURN_MONEY;
        else if (startPressed && fives == 0 && twos == 0 && ones == 0) return RETURN_MONEY;

        return RETURN_MONEY;
    }

    private void setCoinsCount() {
        for (int coin : coins) {
            if (coin == 1) ones++;
            if (coin == 2) twos++;
            if (coin == 5) fives++;
        }
    }

}
