public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (num.length < 3) {
			return result;
		}

		// sort array
		Arrays.sort(num);

		for (int i = 0; i < num.length - 2; i++) {
			list.add(num[i]);
			int target = -num[i];
			for (int j = i + 1; j < num.length; j++) {
				if (!map.containsKey(-target)) {
					map.put(-target, j);
				} else {
					list.add(num[map.get(-target)]);
					list.add(num[j]);
					result.add(list);
				}
			}
		}
		
		return result;
    }
}