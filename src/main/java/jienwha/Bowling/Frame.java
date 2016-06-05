package jienwha.Bowling;

/**
 * Created by dwtllc on 3/13/16.
 */
public class Frame {
    private int bowl1, bowl2;
    boolean spare;
    boolean strike;

    public Frame(int bowl1, int bowl2) {
        this.bowl1 = bowl1;
        this.bowl2 = bowl2;
    }

    public int getBowl1() {
        return bowl1;
    }

    public void setBowl1(int bowl1) {
        this.bowl1 = bowl1;
    }

    public int getBowl2() {
        return bowl2;
    }

    public void setBowl2(int bowl2) {
        this.bowl2 = bowl2;
    }

    public boolean isSpare() {
        return spare;
    }

    public void setSpare(boolean spare) {
        this.spare = spare;
    }

    public boolean isStrike() {
        return strike;
    }

    public void setStrike(boolean strike) {
        this.strike = strike;
    }
}
