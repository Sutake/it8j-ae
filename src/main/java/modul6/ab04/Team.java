package modul6.ab04;

public class Team {

    private String name;
    private int score;
    private int goal;
    private int counterGoal;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getCounterGoal() {
        return counterGoal;
    }

    public void setCounterGoal(int counterGoal) {
        this.counterGoal = counterGoal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void addPoint(int point) {
        this.score += point;
    }

    void addGoal(int goal) {
        this.goal += goal;
    }

    void addCounterGoal( int counterGoal) {
        this.counterGoal += counterGoal;
    }
}