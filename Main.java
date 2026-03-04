public class Main {
    public static void main(String[] args) {

        LaLigaPlayer messi = new LaLigaPlayer("Lionel Messi", 30, 5100000, 25);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Cristiano Ronaldo", 32, 45500000, 24);

        // Printing details
        System.out.println("Player: " + messi.getName());
        System.out.println("League: " + messi.getLeague());
        System.out.println("Goals Scored: " + messi.getGoals());
        System.out.println("Goal Rate: " + messi.calculateGoalRate());
        System.out.println();

        System.out.println("Player: " + ronaldo.getName());
        System.out.println("League: " + ronaldo.getLeague());
        System.out.println("Goals Scored: " + ronaldo.getGoals());
        System.out.println("Goal Rate: " + ronaldo.calculateGoalRate());
    }
}