package modul6.ab04;

import java.util.ArrayList;
import java.util.List;

public class Tabelle {
    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
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


        System.out.println(arsenal.getPunktzahl());
        System.out.println(barcelona.getPunktzahl());
        System.out.println(madrid.getPunktzahl());
    }
}