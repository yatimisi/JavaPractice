import java.util.Scanner;

public class NoBreak {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J1~3��ܺ���:(1.�q���u�ݲ� 2.�u�ݲ� 3.���� )");
		String kind = scn.next();
		int money = 500;
		switch (kind) {
		case "1":
			money *= 0.7;
		case "2":
			money *= 0.8;
		default:
			System.out.printf("�������G %d ��", money);
		}
		scn.close();
	}
}