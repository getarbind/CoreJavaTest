
public class TapeEquilibriumOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,7,8};
		
		int diff = absTapeEquilibrium(arr, 7);
		System.out.println("Final mindiff :"+diff);

	}

	private static int absTapeEquilibrium(int[] A, int N) {
		// TODO Auto-generated method stub
		if (A==null || A.length== 0) return 0;
        if (A.length== 1) return A[0];
		int sum1, sum2, diff, minDiff=0;
		int[] arr1 = new int[4];
		int[] arr2 = new int[4];
		sum1=0;sum2=0;
		for (int i=0;i<A.length-1;i++){
			sum1=sum1+A[i];
			arr1[i]=sum1;
			sum2=sum2+A[A.length-i-1];
			arr2[i]=sum2;
		}
		
		for (int i=0;i<A.length-1;i++){
			diff = Math.abs(arr1[i]-arr2[arr2.length-i-1]);
			if (i==0) 
				minDiff = diff;
			else
				if (diff < minDiff) minDiff = diff;
			System.out.println("Iteration : "+i+" Sum1 = "+arr1[i]+" Sum2 = "+arr2[arr2.length-1-i]+ " Diff : "+diff+ " minDiff : "+minDiff);
		}
		return minDiff;
	}

}
