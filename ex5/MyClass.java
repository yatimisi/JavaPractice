public class MyClass {
	void add(int x, int y) {
		System.out.print(" �I�sMyClass���O��add��k-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public static void main(String[] args) {
		int a = 20;
		MyClass c1 = new MyClass(); // �إ��ݩ�MyClass���O������c1
		c1.add(a + 5, 3); // �I�s����c1��add��k
		MyCal c2 = new MyCal(); // �إ��ݩ�MyCal���O������c2
		c2.add(a - 7, 2); // �I�s����c2��add��k
	}
}

class MyCal {
	void add(int x, int y) {
		System.out.print(" �I�sMyCal  ���O��add��k-->");
		System.out.println(x + " + " + y + " = " + (x + y));
	}

}
