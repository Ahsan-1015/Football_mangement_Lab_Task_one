// Abstract class
public abstract class FootballPlayer {
    private String name;
    private int goals;
    private double monthlySalary;  // Confidential
    private int matchesPlayed;

    // Constructor
    public FootballPlayer(String name, int goals, double monthlySalary, int matchesPlayed) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
        this.matchesPlayed = matchesPlayed;
    }

    // Getters (No getter for salary to keep it confidential)
    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    // Abstract method
    public abstract double calculateGoalRate();
}