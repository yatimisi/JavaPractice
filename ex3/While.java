import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 1; // ��J�����
		int sum = 0; // �֭p���`�M
		String numLine = ""; // ������J�����
		while (num != 0) {
			System.out.print("�п�J��Ʋ֭p�`�M (��J0�����p�� ):");
			num = scn.nextInt();
			sum += num; // �N��J���ƭ�num�[���`�Msum��
			numLine += (num); // �N�ƭ�num�M"+"�[��r��numLine��
			if (num != 0)
				numLine += ("+"); // �N�ƭ�num�M"+"�[��r��numLine��
		}
		System.out.printf(numLine + " = " + sum);
		scn.close();
	}
}