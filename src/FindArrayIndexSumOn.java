import java.util.HashMap;

public class FindArrayIndexSumOn {

	public static void main(String[] args) {
		int[] arr = {1,7,12,5,60};
		//int[] arr =null;
		int sum = 61;

		int[] index = findIndex(arr, sum);
		if (index == null)
			System.out.println("Not Found");
		else
			System.out.println("Index is "+index[0]+ " , "+index[1]);
		

	}

	private static int[] findIndex(int[] arr, int sum) {
		if (arr == null) return null;
		int[] res = new int [2];
		//int[] res = {-1,-1};
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
		for (int i =0;i<arr.length;i++){
			if (map.containsKey(arr[i])){
				res[0]=map.get(arr[i]);
				res[1]=i;
				return res; 
			}
			map.put(sum-arr[i], i);
		}
		return null;
	}
}


