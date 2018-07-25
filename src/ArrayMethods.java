import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = { 6, 54, 3, 22, 1 };
		// parallel arrays allow us to maintain an associated list of diff types
		// should have the same length, and reference same index locations
		String[] names = { "Alex", "Brandon", "Michelle" };
		int[] jerseyNums = { 22, 81, 1 };

		for (int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " Jersey #: " + jerseyNums[i]);
		}
		// sort is void method so don't need to sysout
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 100); // fills entire array with same indicated value
		System.out.println(Arrays.toString(arr));

		// overloaded method fill - fills in a range of index. second number is not
		// inclusive to that index reference
		Arrays.fill(arr, 1, 3, 202); // 3 is not inclusive so index 1 and 2 will be filled
		System.out.println(Arrays.toString(arr));

		int[] arr3 = { 6, 54, 3, 22, 1 };
		int[] arr2 = { 6, 54, 3, 22, 1 };
		// will return false because we made modifications since the array was
		// initialized
		System.out.println(Arrays.equals(arr, arr2));
		// will return true
		System.out.println(Arrays.equals(arr3, arr2));

		int[] arr4 = { 3, 5, 4, 6 };
		// still accessing the same array (arr4), doesn't make a copy
		int[] arr5 = arr4; // --don't do this, changes original array value
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));
		arr5[2] = 160; // assigned to both arr4 and arr5
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));

		// To overcome reference pointer/copier, we will use copyOf method
		// can change length here also
		int[] arr6 = Arrays.copyOf(arr4, 10);
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 6: " + Arrays.toString(arr6));
		arr6[2] = 147;
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 6: " + Arrays.toString(arr6));

	}

}
