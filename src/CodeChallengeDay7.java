import java.util.Arrays;

public class CodeChallengeDay7 {
	/*
	 * Given an array of ints length 3, figure out which is larger, the first or
	 * last element in the array, and set all the other elements to be that value.
	 * Return the changed array.
	 */
	public static void main(String[] args) {
		int[] arr = { 98, 43, 22 };
		int arrLength = arr.length; // length is 3, last index is 2
		// System.out.println(arrLength);
		System.out.println(Arrays.toString(changeArray(arr, arrLength)));

	}


	public static int[] changeArray(int[] arr, int arrLength) {
		int[] finalArr = new int[arrLength];

		if (arr[0] > arr[arrLength - 1]) { // length - 1 to access last index of 2
			for (int i = 0; i < arrLength; i++) {
				finalArr[i] = arr[0];

			}
		} else if (arr[arrLength - 1] > arr[0]) {
			for (int i = 0; i < arrLength; i++) {
				finalArr[i] = arr[arrLength - 1];

			}

		}

		return finalArr;
	}

}
