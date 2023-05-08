package cricbuzzLLdDesign.scorecardUpdater.battingScorecard;

import cricbuzzLLdDesign.Player;
import cricbuzzLLdDesign.scorecardUpdater.Wicket;

public class BattingPlayerScoreDetails {
    private Player player;
    private Integer ballsFaced;
    private Integer runsScored;
    private Integer noOfFours;
    private Integer noOfSix;
    private Wicket wicket;

    public Wicket getWicket() {
        return wicket;
    }

    public void setWicket(Wicket wicket) {
        this.wicket = wicket;
    }

    public BattingPlayerScoreDetails(Player player) {
        this.player = player;
        this.ballsFaced = 0;
        this.runsScored = 0;
        this.noOfFours = 0;
        this.noOfSix = 0;
        this.wicket = null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(Integer ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    public Integer getNoOfFours() {
        return noOfFours;
    }

    public void setNoOfFours(Integer noOfFours) {
        this.noOfFours = noOfFours;
    }

    public Integer getNoOfSix() {
        return noOfSix;
    }

    public void setNoOfSix(Integer noOfSix) {
        this.noOfSix = noOfSix;
    }
    @Override
    public String toString() {
        return "BattingPlayerScoreDetails{" +
                "player=" + player.getPlayerName() +
                ", ballsFaced=" + ballsFaced +
                ", runsScored=" + runsScored +
                ", noOfFours=" + noOfFours +
                ", noOfSix=" + noOfSix +
                ", wicket=" + wicket +
                '}';
    }
}
