package cricbuzzLLdDesign;

import java.util.List;

public class Team {

    private String teamId;
    private String teamName;
    private List<Player> playing11;
    private List<Player> benchPlayers;
    private String coach;

    public Team(String teamId, String teamName, List<Player> playing11, List<Player> benchPlayer, String coach) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.playing11 = playing11;
        this.benchPlayers = benchPlayer;
        this.coach = coach;
    }

    public Player getPlayerById(String id) {
        for(Player player: this.playing11) {
            if(player.getPlayerId().equals(id)) {
                return player;
            }
        }
        return null;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlaying11() {
        return playing11;
    }

    public void setPlaying11(List<Player> playing11) {
        this.playing11 = playing11;
    }

    public List<Player> getBenchPlayers() {
        return benchPlayers;
    }

    public void setBenchPlayers(List<Player> benchPlayers) {
        this.benchPlayers = benchPlayers;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}
