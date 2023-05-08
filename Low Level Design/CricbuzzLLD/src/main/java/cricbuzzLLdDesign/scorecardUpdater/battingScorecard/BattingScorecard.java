package cricbuzzLLdDesign.scorecardUpdater.battingScorecard;

import cricbuzzLLdDesign.Ball;
import cricbuzzLLdDesign.Player;
import cricbuzzLLdDesign.Team;
import cricbuzzLLdDesign.enums.RunType;

import java.util.ArrayList;
import java.util.List;

public class BattingScorecard {
    private List<BattingPlayerScoreDetails> playerScoreDetailsList;

    public BattingScorecard(Team battingTeam) {
        playerScoreDetailsList = new ArrayList<>();
        for(Player player: battingTeam.getPlaying11()) {
            this.addPlayerToScorecard(player);
        }
    }

    public void update(Ball ball) {
        for(BattingPlayerScoreDetails batter: playerScoreDetailsList) {
            if(batter.getPlayer().equals(ball.getFacedBy())) {
                if(ball.getWicket() == null) {   // batter scored run
                    batter.setBallsFaced(batter.getBallsFaced() + 1);
                    int run = updateRuns(ball.getRunType(), batter);
                } else {
                    batter.setWicket(ball.getWicket());
                }
            }
        }
    }

    private int updateRuns(RunType runType, BattingPlayerScoreDetails batter) {
        switch (runType) {
            case DOT:
                return 0;
            case FOUR:
                batter.setNoOfFours(batter.getNoOfFours() + 1);
                batter.setRunsScored(batter.getRunsScored() + 4);
                return 4;
            case SIX:
                batter.setNoOfSix(batter.getNoOfSix() + 1);
                batter.setRunsScored(batter.getRunsScored() + 6);
                return 6;
            case SINGLE:
                batter.setRunsScored(batter.getRunsScored() + 1);
                return 1;
            case DOUBLE:
                batter.setRunsScored(batter.getRunsScored() + 2);
                return 2;
            case TRIPLE:
                batter.setRunsScored(batter.getRunsScored() + 3);
                return 3;
        }
        return 0;
    }

    public void show() {
        for(BattingPlayerScoreDetails battingPlayerScoreDetails: this.playerScoreDetailsList) {
            System.out.println(battingPlayerScoreDetails.toString());
        }
    }

    public void addPlayerToScorecard(Player player) {
        playerScoreDetailsList.add(new BattingPlayerScoreDetails(player));
    }

    public List<BattingPlayerScoreDetails> getPlayerScoreDetailsList() {
        return playerScoreDetailsList;
    }

    public void setPlayerScoreDetailsList(List<BattingPlayerScoreDetails> playerScoreDetailsList) {
        this.playerScoreDetailsList = playerScoreDetailsList;
    }
}
