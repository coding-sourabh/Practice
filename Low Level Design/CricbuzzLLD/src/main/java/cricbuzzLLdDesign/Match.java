package cricbuzzLLdDesign;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private Team team1;
    private Team team2;
    private Inning inning1;
    private Inning inning2;
    private List<Over> overs;
    private Team tossWinner;
    private MatchType matchType;
    private Integer currentOver;

    public void processInning1Ball(Ball ball) {
        this.inning1.updateInningScorecard(ball);
    }
    public void processInning2Ball(Ball ball) {
        this.inning2.updateInningScorecard(ball);
    }

    public Integer getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(Integer currentOver) {
        this.currentOver = currentOver;
    }

    public Integer getCurrentBall() {
        return currentBall;
    }

    public void setCurrentBall(Integer currentBall) {
        this.currentBall = currentBall;
    }

    private Integer currentBall;

    Match(Team a, Team b, MatchType matchType, Team tossWinner) {
        this.team1 = a;
        this.team2 = b;
        this.matchType = matchType;
        this.tossWinner = tossWinner;

        if(matchType.equals(MatchType.ODI)) {
            overs = new ArrayList<>(50);
        } else if(matchType.equals(MatchType.T20)) {
            overs = new ArrayList<>(20);
        }
    }

    public void start() {
        // assuming after winning toss India chose to bat
        inning1 = new Inning(this.team1, this.team2);

        inning2 = new Inning(this.team2, this.team1);

        if(inning1.getTotalRuns() > inning2.getTotalRuns()) {
            System.out.println(this.team1.getTeamName() + " won the match");
        } else if(inning2.getTotalRuns() > inning1.getTotalRuns()) {
            System.out.println(this.team2 + " won the match");;
        } else {
            System.out.println("Match Tied");
        }
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Inning getInning1() {
        return inning1;
    }

    public void setInning1(Inning inning1) {
        this.inning1 = inning1;
    }

    public Inning getInning2() {
        return inning2;
    }

    public void setInning2(Inning inning2) {
        this.inning2 = inning2;
    }

    public List<Over> getOvers() {
        return overs;
    }

    public void setOvers(List<Over> overs) {
        this.overs = overs;
    }

    public Team getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(Team tossWinner) {
        this.tossWinner = tossWinner;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }
}
