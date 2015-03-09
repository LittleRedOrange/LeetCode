public class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0;}
	Interval(int s, int e) { start = s; end = e; }
}

public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> result = new ArrayList<Interval>();

		for (Interval interval : intervals) {
			if (newInterval.start > interval.end) {
				result.add(interval);
			} else if (newInterval.end < interval.start) {
				result.add(newInterval);
				newInterval = interval;
			// 有重合部分
			} else if (newInterval.start <= interval.end
						|| newInterval.end >= interval.start){
				newInterval = new Interval(Math.min(newInterval.start, interval.start)，
										Math.max(newInterval.end, interval.end));
			}
		}

		result.add(newInterval);
	}
}