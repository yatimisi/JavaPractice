import java.util.Scanner;

public class MenuDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = 36, num2 = 12;
		String sel;
		do { // �u�n��J�����O�j�p�g��E�A�N�~�����{��
			System.out.println("******** �|�h�B����  ********");
			System.out.println("\tA. �[(+)");
			System.out.println("\tB. ��(-)");
			System.out.println("\tC. ��(*)");
			System.out.println("\tD. ��(/)");
			System.out.println("\tE. ���}�t��");
			System.out.println("*************************");
			do { // �����JA~E�~���}�j��
				System.out.print("�п�ܥ\��: ");
				sel = scn.next().toUpperCase(); // ��J�r���ন�j�g
			} while ("ABCDE".indexOf(sel) == -1);
			switch (sel) {
			case "A":
				System.out.printf(" %d + %d = %d%n", num1, num2, num1 + num2);
				break;
			case "B":
				System.out.printf(" %d - %d = %d%n", num1, num2, num1 - num2);
				break;
			case "C":
				System.out.printf(" %d * %d = %d%n", num1, num2, num1 * num2);
				break;
			case "D":
				System.out.printf(" %d / %d = %d%n", num1, num2, num1 / num2);
				break;
			case "E":
				System.out.println("�����{��");
			}
		} while (!(sel.equals("E")));
		scn.close();
	}
}
