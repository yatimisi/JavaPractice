import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String vip;
		double money;
		System.out.print("�п�J�ʶR���B: ");
		money = scn.nextDouble();// ���o��J�����B���নdouble��ƫ��O
		System.out.print("�Чi���O�_��VIP(�п�JY/N): ");
		vip = scn.next();
		if (vip.equals("Y") | vip.equals("y")) // vip����"Y"��"y"��
			money = money * 0.85; // �p�G��JY�A�h��85��
		System.out.printf("�ݤ�I���B: %.1f" , money);
		scn.close();
	}

}
