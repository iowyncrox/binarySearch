import java.util.Arrays;

public class BinarySearch {

	private static final int NOT_FOUND = -1;

	private BinarySearch() {
	}

	public static int binarySearch(int[] array, int searchValue) {
		int left = 0;
		int right = array.length - 1;
		return binarySearch(array, searchValue, left, right);
	}

	private static int binarySearch(int[] array, int searchValue, int low,
			int high) {

		while (low <= high) {

			int mid = low + ((high - low) / 2);

			if (searchValue < array[mid])
				high = mid - 1;
			else if (searchValue > array[mid])
				low = mid + 1;
			else
				return mid;
		}
		return NOT_FOUND;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 7, 9, 5 };
		Arrays.sort(arr);
		System.out.println(BinarySearch.binarySearch(arr, 2));
	}
}
