package w4.game;

public class Card {
    private final int[][] numbers;

    public Card(int[][] numbers) {
        this.numbers = numbers;
    }

    public int getNumber(int row, int column) {
        return numbers[row][column];
    }

    public boolean isMarked(int row, int column) {
        return numbers[row][column] == -1;
    }

    public void markNumber(int number) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (number == numbers[i][j])
                    numbers[i][j] = -1;
            }
        }
    }
}
