import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num, n, sum;
		do {
			System.out.print("�п�J1~15����ƨӭp�ⶥ����: ");
			num = scn.nextInt();
		} while (num < 1 || num > 15);
		n = num;
		sum = 1;
		do {
			sum *= n--;
		} while (n > 0);
		System.out.printf("%d ! = %d %n", num, sum);
		scn.close();
	}
}
