package modul6.ab04;

public class Team {

    private String name;
    private int point;
    private int goal;
    private int id;

    Team(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void addPoint(int point) {
        this.point += point;
    }

    void addGoal(int goal) {
        this.goal += goal;
    }
}