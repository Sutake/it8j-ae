package modul6.ab04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tabelle {
    private List<Team> teams;
    private static Comparator<Team> comparatorTeam = Comparator.comparingInt(Team::getPunktzahl).reversed().thenComparing(Team::getMannschaftsname);

    public List<Team> getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        return "Tabelle{" +
                "teams=" + teams +
                '}';
    }
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public static void main(String[] args) {

        Tabelle tabelle = new Tabelle();
        List<Team> teams = new ArrayList<>();

        Team arsenal = new Team("Arsenal", 0, 1);
        Team barcelona = new Team("Barcelona", 0, 2);
        Team madrid = new Team("Madrid", 0, 3);

        teams.add(arsenal);
        teams.add(barcelona);
        teams.add(madrid);

        Spielpaarung spielpaarung1 = new Spielpaarung(arsenal, barcelona,1,3);
        Spielpaarung spielpaarung2 = new Spielpaarung(barcelona, madrid,3,1);

        teams.sort(comparatorTeam);
        tabelle.setTeams(teams);
        System.out.println(tabelle);
    }
}