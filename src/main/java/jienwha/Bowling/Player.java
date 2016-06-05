package jienwha.Bowling;

/**
 * Created by dwtllc on 3/13/16.
 */
public class Player {
    private String name;
    private int totalScore;
    private Frame [] scoreFrames;

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
        scoreFrames = new Frame[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Frame[] getScoreFrames() {
        return scoreFrames;
    }

    public void setScoreFrames(Frame[] scoreFrames) {
        this.scoreFrames = scoreFrames;
    }
}
