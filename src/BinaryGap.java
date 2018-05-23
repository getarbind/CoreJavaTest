public class BinaryGap {

	public static void main(String[] args) {
		int num = 1259;
		int gap = findBinaryGap(num);
		System.out.println("Max Binary gap : " + gap);
	}

	private static int findBinaryGap(int num) {
		String bin = Integer.toBinaryString(num);
		int count = 0, maxCount = 0;
		for (int i = 0;i<bin.length();i++)
		{
			if (bin.charAt(i) == '1')
			{
				if (i > 0 && bin.charAt(i-1) == '0' ) {
					if (count > maxCount) maxCount = count;
				}
				count = 0;
			}
			if (bin.charAt(i) == '0') count++;
		}
		System.out.println(bin);
		return maxCount;
	}
}
