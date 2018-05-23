
public class ArrayRotate {
	
	public static void main(String [] args){
		int[] array = {1,2,3,4,5,6};
		
		rorateArray(array, 3);
	}

	private static void rorateArray(int[] array, int k) {
		int[] arrayResult = new int[array.length];
		int pos;
		for (int i =0;i<array.length;i++){
			
			if ((i+k) >array.length-1){
				pos = Math.abs(array.length - (i+k));
			} else {
				pos = i+k;
			}
			arrayResult[pos] = array[i];
			System.out.println(pos +" : "+i);
		}
		for (int i = 0;i<array.length;i++)
		System.out.println(arrayResult[i]);
	}

}
