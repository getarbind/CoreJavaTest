
public class FrogJump {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//int step = solution(3, 999111321, 7);
		int step = solution(10, 85, 30);
		System.out.println(step);

	}
	
	public static int solution(int X, int Y, int D) throws InterruptedException{
		if (Y <= X) return 0;
		int step = 0;
		int factor =1;
		while (X < Y){
			if (X < Y) factor = (Y-X)/D;
			if (factor < 2) factor =1;
			System.out.println("Factor "+factor);
			X = X+ (D*factor);
			step = step +factor;
			System.out.println(X+" : "+step);
		//Thread.sleep(10000);
		}
		return step;
	}

}

