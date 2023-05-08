package cricbuzzLLdDesign;

import java.util.List;

public class Matches {
    private List<Match> allMatches;
    private Integer totalMatches;

    public List<Match> getAllMatches() {
        return allMatches;
    }

    public void setAllMatches(List<Match> allMatches) {
        this.allMatches = allMatches;
    }

    public Integer getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(Integer totalMatches) {
        this.totalMatches = totalMatches;
    }
}
