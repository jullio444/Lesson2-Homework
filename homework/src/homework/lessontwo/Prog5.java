package homework.lessontwo;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumbers rn = new RandomNumbers();
		int[][] board = new int[4][4];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = rn.getRandomInt(1, 99);
				if (i == 1 || i == 3) {
					System.out.printf("+%d \t", board[i][j]);

				}
				if (i != 1)
					System.out.print(" " + board[i][j] + "\t");
				if ((i == 1 && j == 3) || (i == 3 && j == 3)) {
					System.out.println("\n");
					for (int l = 0; l < 4; l++)
						System.out.print("___\t");
					System.out.println();

				}
			}
			System.out.println();

		}     
	}

}
