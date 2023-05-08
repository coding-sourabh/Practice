package cricbuzzLLdDesign;

import cricbuzzLLdDesign.enums.PlayerType;

public class Player {
    private String playerId;
    private String playerName;
    private PlayerType playerType;

    public Player(String pId, String pName, PlayerType pType) {
        this.playerId = pId;
        this.playerName = pName;
        this.playerType = pType;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
