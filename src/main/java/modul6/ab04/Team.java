package modul6.ab04;

public class Team {

    private String name;
    private int score;
    private int id;

    Team(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void addPoint(int point) {
        score += point;
    }
}