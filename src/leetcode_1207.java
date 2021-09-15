import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode_1207 {

	
	    public static boolean uniqueOccurrences(int[] arr) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }
	        Set<Integer> set = new HashSet<>(map.values());
	        return map.size() == set.size();
	    }
	
	
	
	public static void main(String[] args) {
		int arr0 []= {1,2,2,1,1,3};
		int arr1 []= {1,2};
		int arr2 []= {-3,0,1,-3,1,1,1,-3,10,0};
		
		System.out.println("Expect Output True , Real Output : "+uniqueOccurrences(arr0));
		System.out.println("Expect Output False , Real Output : "+uniqueOccurrences(arr1));
		System.out.println("Expect Output True , Real Output : "+uniqueOccurrences(arr2));

	}

}
