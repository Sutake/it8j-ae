package modul6.ab04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SoccerTable {
    private List<Team> teams;
    private static final Comparator<Team> COMPARATOR_TEAM = Comparator.comparingInt(Team::getScore).reversed().thenComparing(Team::getName);

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

    private void createTable() {
        String result = "";
        for (Team team : teams) {
            result += "Mannschaftsname: " + team.getName() + ", Punkte: " + team.getScore() + "\n";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        SoccerTable soccerTable = new SoccerTable();
        List<Team> teams = new ArrayList<>();
        List<Matchup> matchups = new ArrayList<>();

        Team arsenal = new Team("Arsenal", 1);
        Team barcelona = new Team("Barcelona", 2);
        Team madrid = new Team("Madrid", 3);

        teams.add(arsenal);
        teams.add(barcelona);
        teams.add(madrid);

        Matchup matchup1 = new Matchup(arsenal, barcelona, 1, 3);
        Matchup matchup2 = new Matchup(barcelona, madrid, 3, 1);

        matchups.add(matchup1);
        matchups.add(matchup2);

        soccerTable.setTeams(teams);
        soccerTable.calculateScores(matchups);
        teams.sort(COMPARATOR_TEAM);
        soccerTable.createTable();
    }
}