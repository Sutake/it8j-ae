package modul6.ab04;

public class Matchup {
    private Team team1;
    private Team team2;
    private int goalTeam1;
    private int goalTeam2;

    Matchup(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
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

    public int getGoalTeam1() {
        return goalTeam1;
    }

    public void setGoalTeam1(int goalTeam1) {
        this.goalTeam1 = goalTeam1;
    }

    public int getGoalTeam2() {
        return goalTeam2;
    }

    public void setGoalTeam2(int goalTeam2) {
        this.goalTeam2 = goalTeam2;
    }
}