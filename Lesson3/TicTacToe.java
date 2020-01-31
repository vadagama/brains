import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

        private static final char DOT_HUMAN = 'X';
        private static final char DOT_AI = 'O';
        private static final char DOT_EMPTY = '.';
        private static final Scanner SCANNER = new Scanner(System.in);
        private static final Random RANDOM = new Random();
        private static int fieldSizeX;
        private static int fieldSizeY;
        private static char[][] field;

        private static void initField() {
            fieldSizeY = 3;
            fieldSizeX = 3;
            field = new char[fieldSizeY][fieldSizeX];
            for (int i = 0; i < fieldSizeY; i++) {
                for (int j = 0; j < fieldSizeX; j++) {
                    field[i][j] = DOT_EMPTY;
                }
            }
        }

        private static void printField() {
            for (int i = 0; i < fieldSizeY; i++) {
                System.out.print("|");
                for (int j = 0; j < fieldSizeX; j++) {
                    System.out.print(field[i][j] + "|");
                }
                System.out.println();
            }
        }

        private static void humanTurn() {
            int x;
            int y;
            do {
                System.out.print("Enter coordinates (x y) 1 to 3 >> ");
                x = SCANNER.nextInt() - 1;
                y = SCANNER.nextInt() - 1;
            } while (!isCellValid(x, y) || !isCellEmpty(x, y));
            field[y][x] = DOT_HUMAN;
        }

        private static boolean isCellValid(int x, int y) {
            return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
        }

        private static boolean isCellEmpty(int x, int y) {
            return field[y][x] == DOT_EMPTY;
        }

        private static void aiTurn() {
            int x;
            int y;
            do {
                x = RANDOM.nextInt(fieldSizeX);
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isCellEmpty(x, y));
            field[y][x] = DOT_AI;

        }

        private static boolean isDraw() {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (field[y][x] == DOT_EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean checkWin(char c) {

            int FIELD_SIZE = fieldSizeX;

            for (int i = 0; i < FIELD_SIZE; i++)
                if ((field[i][0] == c && field[i][1] == c && field[i][2] == c) ||
                        (field[0][i] == c && field[1][i] == c && field[2][i] == c))
                    return true;
            // проверка диагоналей
            if ((field[0][0] == c && field[1][1] == c && field[2][2] == c) ||
                    (field[2][0] == c && field[1][1] == c && field[0][2] == c))
                return true;
            return false;
        }
/*            if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
            if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
            if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

            if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
            if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
            if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

            if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
            if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
            return false;*/


        public static void main(String[] args) {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkWin(DOT_HUMAN)) {
                    System.out.println("Human win!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(DOT_AI)) {
                    System.out.println("Computer win!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Draw!");
                    break;
                }
            }
        }
    }
