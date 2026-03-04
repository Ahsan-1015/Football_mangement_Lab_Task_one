public class PremierLeaguePlayer extends FootballPlayer {

    public PremierLeaguePlayer(String name, int goals, double monthlySalary, int matchesPlayed) {
        super(name, goals, monthlySalary, matchesPlayed);
    }

    @Override
    public double calculateGoalRate() {
        return (double) getGoals() / getMatchesPlayed();
    }

    public String getLeague() {
        return "Premier League";
    }
}