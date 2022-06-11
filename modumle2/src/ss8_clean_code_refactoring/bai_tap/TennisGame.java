package ss8_clean_code_refactoring.bai_tap;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class TennisGame {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(String playerOne, String playerTwo, int firstScore, int secondScore) {
        String count = "";
        int result;
        if (firstScore == secondScore) {
            switch (firstScore) {
                case ZERO:
                    return "Love-All";
                case ONE:
                    return "Fifteen-All";
                case TWO:
                    return "Thirty-All";
                case THREE:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        } else if (firstScore >= 4 || secondScore >= 4) {
            count = getString(firstScore, secondScore);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) result = firstScore;
                else {
                    count = "-";
                    result = secondScore;
                }
                switch (result) {
                    case ZERO:
                        return count + "Love";
                    case ONE:
                        return count + "Fifteen";
                    case TWO:
                        return count + "Thirty";
                    case THREE:
                        return count + "Forty";
                }
            }
        }
        return count;
    }

    @NotNull
    private static String getString(int firstScore, int secondScore) {
        String count;
        int minusResult = firstScore - secondScore;
        if (minusResult == 1) count = "Advantage player1";
        else if (minusResult == -1) count = "Advantage player2";
        else if (minusResult >= 2) count = "Win for player1";
        else count = "Win for player2";
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player 1: ");
        String playerOne = scanner.nextLine();
        System.out.print("Enter player 2: ");
        String playerTwo = scanner.nextLine();
        System.out.print("Enter the first: ");
        int firstScore = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the second: ");
        int secondScore = Integer.parseInt(scanner.nextLine());
        System.out.println(TennisGame.getScore(playerOne, playerTwo, firstScore, secondScore));
    }
}
