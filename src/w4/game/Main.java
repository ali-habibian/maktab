package w4.game;

import java.util.Random;

public class Main {
    public static final int ROWS = 3;
    public static final int COLS = 5;
    private static final Random rnd = new Random();


    private static final Player[] players = new Player[2];
    private final String[] playersName = {"Ali", "Hosein"};
    private static final Card[][] cards = new Card[players.length][2];
    private static Bingo bingo;

    public static void main(String[] args) {

        init();

        String winner;
        do {
            winner = bingo.play(rnd.nextInt(89) + 1);
        } while (winner.equals(""));

        System.out.println(winner);

    }

    private static void init(){
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                cards[i][j] = fillCard();
            }
        }

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player" + i, cards[i]);
        }

        bingo = new Bingo(players);


    }

    private static Card fillCard() {
        int[][] numbers = new int[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                numbers[i][j] = rnd.nextInt(89) + 1;
            }
        }
        return new Card(numbers);
    }
}
