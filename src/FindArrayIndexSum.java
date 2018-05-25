
public class FindArrayIndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,12,5};
		int sum = 12;

		int[] index = findIndex(arr, sum);
		System.out.println("Index is "+index[0]+ " , "+index[1]);
		

	}

	private static int[] findIndex(int[] arr, int sum) {
		int[] res = new int [2];
		for (int i =0;i<arr.length;i++){
			for (int j =0;j<arr.length;j++){
				if (arr[i] + arr[j] == sum){
					System.out.println(" first "+arr[i]+" Second "+arr[j]+" Sum : "+sum);
					res[0]=i;
					res[1]=j;
					return res;
				}
			}
		}
		return null;
	}
}


