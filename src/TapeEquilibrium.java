
public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,7,8};
		
		int diff = absTapeEquilibrium(arr, 7);
		System.out.println("Final mindiff :"+diff);

	}

	private static int absTapeEquilibrium(int[] arr, int N) {
		// TODO Auto-generated method stub
		int sum1, sum2, diff, minDiff=0;
		for (int i=0;i<arr.length-1;i++){
			sum1=0;sum2=0;
			for (int j=0;j<arr.length;j++){
				if (j<=i){
					sum1=sum1+arr[j];
				}
				else{
					sum2=sum2+arr[j];
				}
			}
			diff = Math.abs(sum1-sum2);
			
			if (i==0) 
				minDiff = diff;
			else
				if (diff < minDiff) minDiff = diff;
			System.out.println("Iteration : "+i+" Sum1 = "+sum1+" Sum2 = "+sum2+ " Diff : "+diff+ " minDiff : "+minDiff);
		}
		return minDiff;
	}

}
