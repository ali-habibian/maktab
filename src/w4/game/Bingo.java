package w4.game;

public class Bingo {
    private final Player[] players;

    public Bingo(Player[] players){
        this.players = players;
    }
    public String play(int number){
        String winners = "";
        for (int i = 0; i < players.length; i++) {
            players[i].markNumber(number);
            if (players[i].isWinner())
                winners += players[i].getName() + " ";
        }

        return winners;
    }
}
