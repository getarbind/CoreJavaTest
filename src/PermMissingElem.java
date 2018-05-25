
public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2};
		int missing =  solution(array, array.length);
		System.out.println(missing);
	}

	private static int solution(int[] A, int N) {
		if (A.length == 0 )
			return 1;
//		int min = A[0];
//		int max = A[0];
		long total =0;
		for (int i=0;i<A.length;i++){
			total = total + A[i];
//			if (A[i] > max ) max = A[i];
//			if (A[i] < min ) min = A[i];
		}
		//return (((A.length+1)*(max+min))/2) - total;
		return (int) ((((A.length+1)*(A.length+2))/2) - total);
	}

}
