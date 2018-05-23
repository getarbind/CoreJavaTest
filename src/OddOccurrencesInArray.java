import java.util.HashMap;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = {1,2,3,4,5,1,2,3,4,5,5,5,9,8};
		
		int res = findOccur(aa);
		System.out.println(res);

	}

	private static int findOccur(int[] A) {
		HashMap<Integer,Integer> nn = new HashMap<Integer,Integer>();
		if (A.length == 0) return 0;
		if (A.length == 1) return A[0];
		for (int i =0;i<A.length;i++){
			if (nn.containsKey(A[i]))
				nn.remove(A[i]);
			else
				nn.put(A[i], 1);
		}
		for (int key : nn.keySet())
				return key;
		return 0;
	}

}
