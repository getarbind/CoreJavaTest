
public class Factorial {
	
	int fac_rec(int num){
		if (num == 1)
			return 1;
		return (num * fac_rec(--num));
		
	}
	
	public static void main(String[] args){
		Factorial fact = new Factorial();
		int num = 6;
		int result = fact.fac_rec(num);
		System.out.println("Factorail of " + num + " = " + result);
	}

}
