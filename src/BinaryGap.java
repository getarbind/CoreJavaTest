import java.util.HashMap;

public class BinaryGap {

	public static void main(String[] args) {
		int num = 129;
		int gap = findBinaryGap(num);
		
	}

	private static int findBinaryGap(int num) {
		String bin = Integer.toBinaryString(num);
		HashMap<Integer, Integer> gap = new HashMap<Integer, Integer>();
		int count = 0, num1 =1;
		for (int i = 0;i<bin.length();i++)
		{
			if (bin.charAt(i) == '1')
			{
				if (i>0 && bin.charAt(i-1) == '0' ) {
					gap.put(num1, count);
					num1++;
					System.out.println(num1 + " : "+ count);
				}
				count = 0;
			
			}
			
			if (bin.charAt(i) == '0') count++;
			
		}
		System.out.println(bin);
		return 0;
	}

}
