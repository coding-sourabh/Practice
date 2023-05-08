package cricbuzzLLdDesign;

import cricbuzzLLdDesign.scorecardUpdater.ScorecardUpdater;

public class Inning {
    private ScorecardUpdater scorecardUpdater;
    private Integer totalRuns;
    private Integer totalWickets;
    private Integer extras;

    public Inning(Team battingTeam, Team bowlingTeam) {
        this.scorecardUpdater = new ScorecardUpdater(battingTeam, bowlingTeam);
        this.totalRuns = 0;
        this.totalWickets = 0;
        this.extras = 0;
    }

    public void updateInningScorecard(Ball ball) {
        this.scorecardUpdater.update(ball);
    }

    public void showInningsDetails() {
        System.out.println("----------Batting Scorecard---------");
        scorecardUpdater.getBattingScorecard().show();

        System.out.println("--------Bowling Scorecard-----------");
        scorecardUpdater.getBowlingScorecard().show();
    }

    public ScorecardUpdater getScorecardUpdater() {
        return scorecardUpdater;
    }

    public void setScorecardUpdater(ScorecardUpdater scorecardUpdater) {
        this.scorecardUpdater = scorecardUpdater;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }

    public Integer getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(Integer totalWickets) {
        this.totalWickets = totalWickets;
    }

    public Integer getExtras() {
        return extras;
    }

    public void setExtras(Integer extras) {
        this.extras = extras;
    }
}
