public class CallByValue {
	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println(" �ǭȩI�s�e\ta=" + a + "\tb=" + b);
		byVal(a, b);
		System.out.println(" �ǭȩI�s��\ta=" + a + "\tb=" + b);
	}

	static void byVal(int x, int y) {
		x += 3;
		y += 2;
		System.out.println(" �ǭȩI�s��\tx=" + x + "\ty=" + y);
	}

}
