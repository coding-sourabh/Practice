package cricbuzzLLdDesign.scorecardUpdater.bowlingScorecard;

import cricbuzzLLdDesign.Player;

public class BowlingPlayerStat {
    private Player player;
    private Integer oversBowled;
    private Integer bowlBowled;
    private Integer runsConceded;
    private Integer wicketTaken;

    public BowlingPlayerStat(Player player) {
        this.player = player;
        this.oversBowled = 0;
        this.runsConceded = 0;
        this.wicketTaken = 0;
        this.bowlBowled = 0;
    }

    public Integer getBowlBowled() {
        return bowlBowled;
    }

    public void setBowlBowled(Integer bowlBowled) {
        this.bowlBowled = bowlBowled;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getOversBowled() {
        return oversBowled;
    }

    public void setOversBowled(Integer oversBowled) {
        this.oversBowled = oversBowled;
    }

    public Integer getRunsConceded() {
        return runsConceded;
    }

    public void setRunsConceded(Integer runsConceded) {
        this.runsConceded = runsConceded;
    }

    public Integer getWicketTaken() {
        return wicketTaken;
    }

    public void setWicketTaken(Integer wicketTaken) {
        this.wicketTaken = wicketTaken;
    }

    public String show() {
        return
                "player=" + player +
                ", oversBowled=" + oversBowled +
                ", runsConceded=" + runsConceded +
                ", wicketTaken=" + wicketTaken +
                '}';
    }
}
