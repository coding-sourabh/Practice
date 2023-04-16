package model;

public class Player {

    private String name;
    private Integer playerId;
    private Integer VictoryCount;
    private Integer currentPos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getVictoryCount() {
        return VictoryCount;
    }

    public void setVictoryCount(Integer victoryCount) {
        VictoryCount = victoryCount;
    }

    public Integer getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(Integer currentPos) {
        this.currentPos = currentPos;
    }
}
