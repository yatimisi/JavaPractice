import java.util.Scanner;

public class Ex02_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z���m�W�G");
		String name = scn.next(); // Ū�J�@�r��ë��w��name�r���ܼ�
		System.out.print("�п�J�z���~�֡G");
		int age = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��age�ܼ�
		System.out.printf("%s �z�n!�z���~�֬�%d��!!%n", name, age);
		System.out.print("�п�J�z���y�k�ʡG");
		String mot;		
		while( (mot = scn.nextLine()).equals("") ){} 
		System.out.println("�z���y�k�ʬO�G" + mot);
		scn.close();
	}

}
