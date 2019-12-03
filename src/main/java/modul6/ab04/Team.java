package modul6.ab04;

public class Team {

    private String mannschaftsname;
    private int punktzahl;
    private int id;

    public Team(String mannschaftsname, int punktzahl, int id) {
        this.mannschaftsname = mannschaftsname;
        this.punktzahl = punktzahl;
        this.id = id;
    }

    public String getMannschaftsname() {
        return mannschaftsname;
    }

    public void setMannschaftsname(String mannschaftsname) {
        this.mannschaftsname = mannschaftsname;
    }

    public int getPunktzahl() {
        return punktzahl;
    }

    public void setPunktzahl(int punktzahl) {
        this.punktzahl = punktzahl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addPoint(int point) {
        punktzahl += point;
    }
}