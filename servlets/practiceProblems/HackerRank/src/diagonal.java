
public class diagonal {
	// Java Program to print the Diagonals of a Matrix

	static int MAX = 100;

	// Function to print the Principal Diagonal

	public static void printPrincipalDiagonal(int mat[][], int n)

	{

		System.out.print("Principal Diagonal: ");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				// Condition for principal diagonal

				if (i == j) {

					System.out.print(mat[i][j] + " ");

				}

			}

		}

		System.out.println("");

	}

	// Function to print the Secondary Diagonal

	public static void printSecondaryDiagonal(int mat[][], int n)

	{

		System.out.print("Secondary Diagonal: ");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				// Condition for secondary diagonal

				if ((i + j) == (n - 1)) {

					System.out.print(mat[i][j] + " ");

				}

			}

		}

		System.out.println("");
	}

	public static void main(String args[]) {
		int n = 4;

		int a[][] = { { 1, 2, 3, 4 },

				{ 5, 6, 7, 8 },

				{ 1, 2, 3, 4 },

				{ 5, 6, 7, 8 } };

		printPrincipalDiagonal(a, n);

		printSecondaryDiagonal(a, n);
	}

}
