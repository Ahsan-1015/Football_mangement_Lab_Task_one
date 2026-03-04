public class LaLigaPlayer extends FootballPlayer {

    public LaLigaPlayer(String name, int goals, double monthlySalary, int matchesPlayed) {
        super(name, goals, monthlySalary, matchesPlayed);
    }

    @Override
    public double calculateGoalRate() {
        return (double) getGoals() / getMatchesPlayed();
    }

    public String getLeague() {
        return "La Liga";
    }
}