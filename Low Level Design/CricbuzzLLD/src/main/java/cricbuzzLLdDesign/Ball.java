package cricbuzzLLdDesign;

import cricbuzzLLdDesign.enums.RunType;
import cricbuzzLLdDesign.scorecardUpdater.Wicket;

public class Ball {
    private RunType runType;
    private Player facedBy;
    private Player bowledBy;
    private Wicket wicket;

    public Ball(RunType runType, Player facedBy, Player bowledBy, Wicket wicket) {
        this.runType = runType;
        this.facedBy = facedBy;
        this.bowledBy = bowledBy;
        this.wicket = wicket;
    }

    public RunType getRunType() {
        return runType;
    }

    public void setRunType(RunType runType) {
        this.runType = runType;
    }

    public Player getFacedBy() {
        return facedBy;
    }

    public void setFacedBy(Player facedBy) {
        this.facedBy = facedBy;
    }

    public Player getBowledBy() {
        return bowledBy;
    }

    public void setBowledBy(Player bowledBy) {
        this.bowledBy = bowledBy;
    }

    public Wicket getWicket() {
        return wicket;
    }

    public void setWicket(Wicket wicket) {
        this.wicket = wicket;
    }
}
