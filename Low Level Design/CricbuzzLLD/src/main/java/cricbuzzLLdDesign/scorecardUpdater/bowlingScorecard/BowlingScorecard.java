package cricbuzzLLdDesign.scorecardUpdater.bowlingScorecard;

import cricbuzzLLdDesign.Ball;
import cricbuzzLLdDesign.Player;
import cricbuzzLLdDesign.Team;
import cricbuzzLLdDesign.enums.RunType;
import cricbuzzLLdDesign.scorecardUpdater.battingScorecard.BattingPlayerScoreDetails;

import java.util.ArrayList;
import java.util.List;

public class BowlingScorecard {
    private List<BowlingPlayerStat> bowlingPlayerStats;

    public BowlingScorecard(Team bowlingTeam) {
        bowlingPlayerStats = new ArrayList<>();
        for(Player player: bowlingTeam.getPlaying11()) {
            this.addPlayerToScorecard(player);
        }
    }

    public void update(Ball ball) {
        for(BowlingPlayerStat bowler: bowlingPlayerStats) {
            // find the bowler who bowled
            if(bowler.getPlayer().getPlayerId().equals(ball.getBowledBy().getPlayerId())) {

                // update over bowled by bowler
                if(bowler.getBowlBowled() + 1 == 6) {
                    bowler.setBowlBowled(0);
                    bowler.setOversBowled(bowler.getOversBowled() + 1);
                } else {
                    bowler.setBowlBowled(bowler.getBowlBowled() + 1);
                }

                // update run and wickets for the bowler
                if(ball.getWicket() == null) {
                    int run = updateBowlerStats(ball.getRunType(), bowler);
                } else {
                    bowler.setWicketTaken(bowler.getWicketTaken() + 1);
                }
            }
        }
    }

    private int updateBowlerStats(RunType runType, BowlingPlayerStat bowler) {
        switch (runType) {
            case DOT:
                return 0;
            case FOUR:
                bowler.setRunsConceded(bowler.getRunsConceded()+ 4);
                return 4;
            case SIX:
                bowler.setRunsConceded(bowler.getRunsConceded()+ 6);
                return 6;
            case SINGLE:
                bowler.setRunsConceded(bowler.getRunsConceded()+ 1);
                return 1;
            case DOUBLE:
                bowler.setRunsConceded(bowler.getRunsConceded()+ 2);
                return 2;
            case TRIPLE:
                bowler.setRunsConceded(bowler.getRunsConceded()+ 3);
                return 3;
        }
        return 0;
    }

    public void show() {
        for(BowlingPlayerStat bowlingPlayerStat: bowlingPlayerStats) {
            System.out.println(bowlingPlayerStat.show());
        }
    }

    public void addPlayerToScorecard(Player player) {
        this.bowlingPlayerStats.add(new BowlingPlayerStat(player));
    }

    public List<BowlingPlayerStat> getBowlingPlayerStats() {
        return bowlingPlayerStats;
    }

    public void setBowlingPlayerStats(List<BowlingPlayerStat> bowlingPlayerStats) {
        this.bowlingPlayerStats = bowlingPlayerStats;
    }
}
