public class Solution {
	public int searchInsertPosition(int[] A, int target) {
		if (null == A || 0 == A.length) {
			return 0;
		}

		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			// int mid = (low + high) / 2; 可能导致溢出
			int mid = low + (high - low) / 2;

			if (A[mid] >= target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
    }
}