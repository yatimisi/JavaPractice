
public class Cal1 {
	static void add(int x, int y) { // �Q�I�s��k�D��
		System.out.print("�I�sCal1���O��Add��k-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public static void main(String[] args) {
		int a = 20;
		// �I�s�P�@���O��add��k
		add(a + 5, 3); // �I�s�ԭz
		// �I�s���P���O��add��k
		Cal2.add(a - 7, 2); // �I�s�ԭz
	}
}

 class Cal2 {
	static void add(int x, int y) { // �Q�I�s��k�D��
		System.out.print("�I�sCal2���O��add��k-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

}
