package cricbuzzLLdDesign.scorecardUpdater;

import cricbuzzLLdDesign.Ball;
import cricbuzzLLdDesign.Team;
import cricbuzzLLdDesign.scorecardUpdater.battingScorecard.BattingPlayerScoreDetails;
import cricbuzzLLdDesign.scorecardUpdater.battingScorecard.BattingScorecard;
import cricbuzzLLdDesign.scorecardUpdater.bowlingScorecard.BowlingScorecard;

public class ScorecardUpdater {
    private BattingScorecard battingScorecard;
    private BowlingScorecard bowlingScorecard;
    private Team battingTeam;
    private Team bowlingTeam;

    public ScorecardUpdater(Team battingTeam, Team bowlingTeam) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;

        battingScorecard = new BattingScorecard(battingTeam);
        bowlingScorecard = new BowlingScorecard(bowlingTeam);
    }

    public void update(Ball ball) {
        battingScorecard.update(ball);
        bowlingScorecard.update(ball);
    }

    public BattingScorecard getBattingScorecard() {
        return battingScorecard;
    }

    public void setBattingScorecard(BattingScorecard battingScorecard) {
        this.battingScorecard = battingScorecard;
    }

    public BowlingScorecard getBowlingScorecard() {
        return bowlingScorecard;
    }

    public void setBowlingScorecard(BowlingScorecard bowlingScorecard) {
        this.bowlingScorecard = bowlingScorecard;
    }
}
