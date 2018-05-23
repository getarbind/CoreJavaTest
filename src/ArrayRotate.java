
public class ArrayRotate {
	
	public static void main(String [] args){
		int[] array = {1,2,3,4,5,6};
		//int[] array = {1};
		int[] rr = solution(array, 13);
		for (int k=0;k< rr.length;k++)System.out.println(rr[k]);
	}

		  public static int[] solution(int[] A, int K) {
		        // write your code in Java SE 8
				if (A.length == 0) return A;
        		int[] arrayResult = new int[A.length];
				int pos;
				if (K > A.length) K = K % A.length;
				if (A.length == 1){
					return A;
				} else {
				for (int i =0;i<A.length;i++){
					
					if ((i+K) >A.length-1){
						pos = Math.abs(A.length - (i+K));
					} else {
						pos = i+K;
					}
					arrayResult[pos] = A[i];
					
				}
				return arrayResult;
			}
		    
	}

}
