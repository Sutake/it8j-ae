package modul6.ab04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SoccerTable {
    private List<Team> teams;
    private static final Comparator<Team> COMPARATOR_TEAM = Comparator.comparingInt(Team::getScore).thenComparingInt(Team::getGoal).reversed();

    public List<Team> getTeams() {
        return teams;
    }

    private void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    private void calculateScores(List<Matchup> matchups) {
        for (Matchup matchup : matchups) {
            if (matchup.getResultTeam1() > matchup.getResultTeam2()) {
                matchup.getTeam1().addPoint(3);
            } else if (matchup.getResultTeam2() > matchup.getResultTeam1()) {
                matchup.getTeam2().addPoint(3);
            } else {
                matchup.getTeam1().addPoint(1);
                matchup.getTeam2().addPoint(1);
            }
        }
    }

    private void calculateGoals(List<Matchup> matchups) {
        for (Matchup matchup : matchups) {
            matchup.getTeam1().addGoal(matchup.getResultTeam1());
            matchup.getTeam2().addGoal(matchup.getResultTeam2());
        }
    }

    private void createTable() {
        String result = "";
        for (Team team : teams) {
            result += "Mannschaftsname: " + team.getName() + ", Punkte: " + team.getScore() + " , Tore: " + team.getGoal() + "\n";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        SoccerTable soccerTable = new SoccerTable();

        Team arsenal = new Team("Arsenal", 1);
        Team barcelona = new Team("Barcelona", 2);
        Team madrid = new Team("Madrid", 3);

        List<Team> teams = Arrays.asList(arsenal, barcelona, madrid);
        List<Matchup> matchups = Arrays.asList(new Matchup(arsenal, barcelona, 5, 1), new Matchup(barcelona, madrid, 3, 1));
        soccerTable.setTeams(teams);
        soccerTable.calculateScores(matchups);
        soccerTable.calculateGoals(matchups);
        teams.sort(COMPARATOR_TEAM);
        soccerTable.createTable();
    }
}