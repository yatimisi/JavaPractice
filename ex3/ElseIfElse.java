import java.util.Scanner;

public class ElseIfElse {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr��:");
		char c = scn.next().charAt(0);
		if (Character.isDigit(c)) //(c>='0' && c<='9')
			System.out.println("�z��J���r���O�Ʀr�C");
		else if (Character.isUpperCase(c))//(c>='A' && c<='Z')
			System.out.println("�z��J���r���O�j�g���r���C");
		else if (c>='a' && c<='z')
			System.out.println("�z��J���r���O�p�g���r���C");
		else
			System.out.print("�z��J���O�䥦���r���Ÿ��C");
		scn.close();
	}
	
}

