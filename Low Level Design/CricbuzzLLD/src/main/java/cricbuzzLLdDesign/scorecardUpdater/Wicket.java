package cricbuzzLLdDesign.scorecardUpdater;

import cricbuzzLLdDesign.Player;
import cricbuzzLLdDesign.enums.WicketType;

public class Wicket {
    private Player bowledBy;
    private Player facedBy;
    private WicketType wicketType;

    public Player getBowledBy() {
        return bowledBy;
    }

    public void setBowledBy(Player bowledBy) {
        this.bowledBy = bowledBy;
    }

    public Player getFacedBy() {
        return facedBy;
    }

    public void setFacedBy(Player facedBy) {
        this.facedBy = facedBy;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }
}
