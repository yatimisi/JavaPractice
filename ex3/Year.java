import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.print("�п�J�n���ժ��~��(��p:1900): ");
	  int year = scn.nextInt();
	  if (year % 400 == 0) // �p�G�i�H�Q400�㰣�N�O�|�~
	      System.out.print("�z��J���O�|�~�C");
	  else if ((year % 4 == 0) && (year % 100 != 0)) 
	  //�i�Q4�㰣�B���Q100�㰣�N�O�|�~
		  System.out.print("�z��J���~���O�|�~�C");
	  else
		  System.out.print("�z��J���~�����O�|�~�C");
	  scn.close();
	}
}

