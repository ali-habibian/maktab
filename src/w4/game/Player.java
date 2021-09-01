package w4.game;

public class Player {
    private final String name;
    private final Card[] cards;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public Card[] getCards() {
        return cards;
    }

    public boolean isWinner() {
        boolean isWinner = false;
        for (Card card : cards) { // Select card
            for (int j = 0; j < Main.ROWS; j++) { // Loop card rows
                int markedCount = 0; // number of columns is marked
                for (int k = 0; k < Main.COLS; k++) { // Loop card columns
                    if (card.isMarked(j, k)) {
                        markedCount++;
                    }
                }
                if (markedCount == 5) {
                    isWinner = true;
                }
            }
        }
        return isWinner;
    }

    public void markNumber(int number) {
        for (Card card : cards) {
            card.markNumber(number);
        }
    }
}
