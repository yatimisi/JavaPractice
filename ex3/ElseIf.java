import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String id, pass;
		System.out.print("�п�J�b��: ");
		id = scn.next();
		System.out.print("�п�J�K�X: ");
		pass = scn.next();
		if (id.equals("Love") & pass.equals("2520")) {
			System.out.println("�b���K�X���T!!");
			System.out.println("�w��i�J���t��!!");
		} else {
			System.out.println("�b���K�X���~!!");
			System.out.println("�L�k�i�J���t��!!");
		}
		scn.close();
	}

}
