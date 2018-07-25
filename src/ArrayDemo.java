import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// arrays must be declared with a size
		int[] arr = new int[4]; // the values by default are 0 for indexes 0-3
		arr[0] = 55;
		arr[2] = 77;
		// referencing arr just prints reference to spot in heap memory
		// Arrays.toString gives actual values in array. Arrays is class,
		// toString is static method
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]); // to access specific element

		// field is a variable like length (without () ) strings have methods.
		// to loop through or search all elements in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		String name = "John";
		String[] arr2 = { name, "Ben", "Cheo", "Camilla" };
		System.out.println(arr2[0]);

		// declaring and assign a size in 2 steps
		final int SIZE = 105;
		double[] arr3;
		arr3 = new double[SIZE];
		// declaring, assigning, size, and value in 1 step
		double[] arr4 = { 4.5, 6.8, 4.3, 2.2 };

		// let user assign the array size
		System.out.println("Please enter a number: ");
		int userNum = scan.nextInt();
		boolean arr5[] = new boolean[userNum];
		System.out.println(arr5.length);
		// System.out.println(arr5[4]);

		// enhanced for loop aka for each - used to traverse through array,
		// add things to arrays (car lab)
		// the disadvantage to using this is we don't have access to the index location
		for (boolean temp : arr5) {
			System.out.println(temp);
		}

		int[] nums = { 6, 7, 23, 44, 8 };
		System.out.println(sumArray(nums));

		// can make arrays of objects like a Robot
		// by default if no value is added, the value is null
		Robot[] robotArr = new Robot[2];
		robotArr[0] = new Robot("Grant Chrirpus", 5);// name and age
		// robot is the data type
		for (Robot r : robotArr) {
			System.out.println(r);
		}

	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int temp : arr) {
			sum += temp; // sum=sum+temp
		}

		return sum;
	}

}
