
public class Array2DExample {

	public static void main(String[] args) {
		// initialize a 2D array with 3 rows and 3 columns
		// first [] equals row count
		// second [] equals column count
		int[][] arr = new int[3][3];
		// first sets of curly braces is row 0, second is row 1..
		int[][] arr2 = { { 3, 3, 3, 3 }, { 6, 5, 6, 7 }, { 7, 8, 8, 9 }, { 4, 3, 2, 2 } };
		System.out.println(arr2[2][2]);

		// first loop iterates through the rows
		for (int i = 0; i < arr2.length; i++) {
			// looping through columns - need to use arr2[i].length
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(i + "," + j + " " + arr2[i][j]);

			}

		}
		int sum = 0;
		// use enhanced for loop
		for (int[] row : arr2) { // loops through rows (they are arrays)
			for (int column : row) { // loops through the column elements at each row
				sum += column;

			}
		}
		System.out.println(sum);

		// jagged array example
		int[][] arr3 = new int[3][];
		arr3[0] = new int[35]; // giving me 35 columns for my arrays at index 0
		arr3[1] = new int[2];
		arr3[2] = new int[4];
		arr3[0][14] = 144;
		System.out.println(arr3[0][14]);
		System.out.println(arr3[0][0]);

	}

}
