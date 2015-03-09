public class Solution {
	public boolean isValid(String s) {
		if (null == s) {
			return null;
		}

		HashMap<Charater, Charater> map = new HashMap<Charater, Charater>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Charater> stack = new Stack<Charater>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// 我觉得containsKey()要快些呀，keySet().contains()调用了containsKey()，你看下源码
			if (map.containsKey(c)) {
				stack.push(c);
			// } else if (map.values().contains(c)) {
			} else if (map.containsValue(c)) {
				if (!stack.empty() && map.get(stack.peek() == c) {
					stack.pop();
				} else {
					retrun false;
				}
			}
		}
	}
}

/*
public static void main(String[] args) {
    Map map = new HashMap();      //定义Map集合对象
    map.put("apple", "新鲜的苹果");     //向集合中添加对象
    map.put("computer", "配置优良的计算机");
    map.put("book", "堆积成山的图书");
    Collection values = map.values();    //获取Map集合的value集合
    for (Object object : values) {
        System.out.println("键值：" + object.toString()); //输出键值对象
    }
}
*/