import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("�п�J�Ҹդ���: ");
		int score = scn.nextInt();
		score = score / 10;
		switch (score) {
		case 10: // �H�U�O�ݩ�үŪ�����
		case 9:
		case 8:
			grade = '��';
			break;
		case 7: // �ݩ�A�Ū�����
			grade = '�A';
			break;
		case 6: // �ݩ���Ū�����
			grade = '��';
			break;
		default:// �ݩ�B�Ū�����
			grade = '�B';
		}
		System.out.println("�o�O�ݩ�" + grade + "�Ū����Z�C");
		scn.close();
	}
}
