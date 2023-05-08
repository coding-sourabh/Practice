package cricbuzzLLdDesign;

import java.util.List;

public class Over {
    private Player bowledBy;
    private List<Ball> overBalls;
    private Player striker;
    private Player nonStriker;

    public Player getBowledBy() {
        return bowledBy;
    }

    public void setBowledBy(Player bowledBy) {
        this.bowledBy = bowledBy;
    }

    public List<Ball> getOverBalls() {
        return overBalls;
    }

    public void setOverBalls(List<Ball> overBalls) {
        this.overBalls = overBalls;
    }

    public Player getStriker() {
        return striker;
    }

    public void setStriker(Player striker) {
        this.striker = striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(Player nonStriker) {
        this.nonStriker = nonStriker;
    }
}
