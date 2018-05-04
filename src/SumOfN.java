
public class SumOfN {
	int factSum(int num){
		if (num == 0) return 0;
		return (num + factSum(--num));
	}
	public static void main(String [] args){
		SumOfN sn = new SumOfN();
		int num = 100;
		int sum = sn.factSum(num);
		System.out.println("Sum is "+sum);
		
	}

}
