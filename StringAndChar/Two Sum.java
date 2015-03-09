public class Solution {
	public int[] twoSum(int[] numbers, int target){
		int[] ret = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length(); i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				ret[0] = index + 1;
				ret[1] = i + 1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}

		return ret;
	}
}