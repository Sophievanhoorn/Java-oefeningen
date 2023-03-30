package module1._6_Arrays.challenge6;

import java.util.Scanner;

public class TicTacToe {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\nLet's play tic tac toe");

		char[][] board = createBoard();

		printBoard(board);
		char turn = 'X';

		// Loop through turns starting with X
		for (int i = 1; i <= 9; i++) {
			System.out.println("Turn: " + i);

			if (turn == 'X') {
				System.out.println("Player: X");
				int[] userX = askUser(board);
				board[userX[0]][userX[1]] = 'X';
				turn = 'O';

				printBoard(board);
				checkWin(board);

			} else {
				System.out.println("Player: O");
				int[] userO = askUser(board);
				board[userO[0]][userO[1]] = 'O';
				turn = 'X';

				printBoard(board);
				checkWin(board);
			}
			if (i == 8) {
				System.out.println("It's a tie!");
			}
		}
	}

	public static void printBoard(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Character.toString(array[i][0]) + "\t" + Character.toString(array[i][1]) + "\t"
					+ Character.toString(array[i][2]) + "\n\n");
		}
	}

	public static char[][] createBoard() {
		char[][] board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '_';
			}
		}
		return board;
	}

	public static int[] askUser(char[][] board) {
		int row = 0;
		int column = 0;
		int[] answer = { row, column };
		boolean emptySpot = false;

		while (!emptySpot) {
			System.out.println("pick a row and column number");
			System.out.print("\tRow: ");
			row = scan.nextInt() - 1;
			scan.nextLine();

			System.out.print("\tColumn: ");
			column = scan.nextInt() - 1;
			scan.nextLine();

			if (Character.compare(board[row][column], '_') == 0) {
				answer[0] = row;
				answer[1] = column;
				emptySpot = true;
			} else {
				System.out.println("This spot is taken, please choose again");
			}
		}
		return answer;
	}

	public static int checkWin(char[][] board) {

		if (horizontalCheck(board) == 3 || verticalCheck(board) == 3 || diagonalCheck(board) == 3) {
			System.out.println("Player X is the winner!");
			System.exit(0);

		} else if (horizontalCheck(board) == -3 || verticalCheck(board) == -3 || diagonalCheck(board) == -3) {
			System.out.println("Player O is the winner!");
			System.exit(0);
		}
		return 0;
	}

	public static int horizontalCheck(char[][] board) {
		for (int i = 0; i < board[0].length; i++) {
			int count = 0;
			for (int j = 0; j < board.length; j++)
				if (Character.compare(board[i][j], 'X') == 0) {
					count++;
				} else if (Character.compare(board[i][j], 'O') == 0) {
					count--;
				}
			if (count == 3) {
				return count;
			} else if (count == -3) {
				return count;
			}
		}
		return 0;
	}

	public static int verticalCheck(char[][] board) {
		// Horizontal
		for (int i = 0; i < board[0].length; i++) {
			int count = 0;
			for (int j = 0; j < board.length; j++)
				if (Character.compare(board[j][i], 'X') == 0) {
					count++;
				} else if (Character.compare(board[j][i], 'O') == 0) {
					count--;
				}
			if (count == 3) {
				return count;
			} else if (count == -3) {
				return count;
			}
		}
		return 0;
	}

	public static int diagonalCheck(char[][] board) {
		// Horizontal
		for (int a = 0; a < 2; a++) {
			int count = 0;
			for (int i = 0, j = 2; i < board[0].length; i++, j--) {
				if (Character.compare(board[i][i], 'X') == 0 || Character.compare(board[j][i], 'X') == 0) {
					count++;
				} else if (Character.compare(board[i][i], 'O') == 0 || Character.compare(board[j][i], 'O') == 0) {
					count--;
				}
				if (count == 3) {
					return count;
				} else if (count == -3) {
					return count;
				}
			}
		}
		return 0;
	}
}
