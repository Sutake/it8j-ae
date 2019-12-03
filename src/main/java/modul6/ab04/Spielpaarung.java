package modul6.ab04;

public class Spielpaarung {
    private Team team1;
    private Team team2;
    private int ergebnisTeam1;
    private int ergebnisTeam2;

    public Spielpaarung(Team team1, Team team2, int ergebnisTeam1, int ergebnisTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.ergebnisTeam1 = ergebnisTeam1;
        this.ergebnisTeam2 = ergebnisTeam2;
        berechnePunkte();
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

    public int getErgebnisTeam1() {
        return ergebnisTeam1;
    }

    public void setErgebnisTeam1(int ergebnisTeam1) {
        this.ergebnisTeam1 = ergebnisTeam1;
    }

    public int getErgebnisTeam2() {
        return ergebnisTeam2;
    }

    public void setErgebnisTeam2(int ergebnisTeam2) {
        this.ergebnisTeam2 = ergebnisTeam2;
    }

    private void berechnePunkte() {
        if (ergebnisTeam1 > ergebnisTeam2) {
            team1.addPoint(3);
        } else if (ergebnisTeam2 > ergebnisTeam1) {
            team2.addPoint(3);
        } else {
            team1.addPoint(1);
            team2.addPoint(1);
        }

    }
}