package cricbuzzLLdDesign;

import cricbuzzLLdDesign.enums.PlayerType;
import cricbuzzLLdDesign.enums.RunType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Team india = createIndianTeam();
        Team aus = createAustralianTeam();
        Match indVsAus = new Match(india, aus, MatchType.T20, india);
        indVsAus.start();

        Ball ball1 = new Ball(RunType.SINGLE, india.getPlayerById("p01"), aus.getPlayerById("a08"), null);
        indVsAus.processInning1Ball(ball1);
        Ball ball2 = new Ball(RunType.FOUR, india.getPlayerById("p02"), aus.getPlayerById("a08"), null);
        indVsAus.processInning1Ball(ball2);
        Ball ball3 = new Ball(RunType.DOUBLE, india.getPlayerById("p01"), aus.getPlayerById("a08"), null);
        indVsAus.processInning1Ball(ball3);
        Ball ball4 = new Ball(RunType.DOT, india.getPlayerById("p02"), aus.getPlayerById("a08"), null);
        indVsAus.processInning1Ball(ball4);
        Ball ball5 = new Ball(RunType.SINGLE, india.getPlayerById("p01"), aus.getPlayerById("a08"), null);
        indVsAus.processInning1Ball(ball5);
        Ball ball6 = new Ball(RunType.SIX, india.getPlayerById("p03"), aus.getPlayerById("a08"), null);
        indVsAus.processInning1Ball(ball6);

        indVsAus.getInning1().showInningsDetails();
    }

    public static Team createIndianTeam() {
        List<Player> indianPlayers = new ArrayList<>();
        indianPlayers.add(new Player("p01", "Rohit", PlayerType.BATTER));
        indianPlayers.add(new Player("p02", "Dhawan", PlayerType.BATTER));
        indianPlayers.add(new Player("p03", "Virat", PlayerType.BATTER));
        indianPlayers.add(new Player("p04", "Surya", PlayerType.BATTER));
        indianPlayers.add(new Player("p05", "Rahul", PlayerType.WICKET_KEEPER));
        indianPlayers.add(new Player("p06", "Pandya", PlayerType.ALL_ROUNDER));
        indianPlayers.add(new Player("p07", "Jadeja", PlayerType.ALL_ROUNDER));
        indianPlayers.add(new Player("p08", "Bhuvi", PlayerType.BOWLER));
        indianPlayers.add(new Player("p09", "Chahal", PlayerType.BOWLER));
        indianPlayers.add(new Player("p10", "Shami", PlayerType.BOWLER));
        indianPlayers.add(new Player("p11", "Bumrah", PlayerType.BOWLER));
        Team indianTeam = new Team("t1", "India", indianPlayers, new ArrayList<>(), "Rahul Dravid");
        return indianTeam;
    }

    public static Team createAustralianTeam() {
        List<Player> australianPlayers = new ArrayList<>();
        australianPlayers.add(new Player("a01", "Finch", PlayerType.BATTER));
        australianPlayers.add(new Player("a02", "Warner", PlayerType.BATTER));
        australianPlayers.add(new Player("a03", "Smith", PlayerType.BATTER));
        australianPlayers.add(new Player("a04", "Marsh", PlayerType.ALL_ROUNDER));
        australianPlayers.add(new Player("a05", "Maxwell", PlayerType.ALL_ROUNDER));
        australianPlayers.add(new Player("a06", "Stoinis", PlayerType.ALL_ROUNDER));
        australianPlayers.add(new Player("a07", "Carey", PlayerType.WICKET_KEEPER));
        australianPlayers.add(new Player("a08", "Starc", PlayerType.BOWLER));
        australianPlayers.add(new Player("a09", "Cummins", PlayerType.BOWLER));
        australianPlayers.add(new Player("a10", "Hazelwood", PlayerType.BOWLER));
        australianPlayers.add(new Player("a11", "Zampa", PlayerType.BOWLER));
        Team australianTeam = new Team("t2", "Australia", australianPlayers, new ArrayList<>(), "Justin Langer");
        return australianTeam;
    }

}
