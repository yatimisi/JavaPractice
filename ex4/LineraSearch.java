import java.util.Scanner;

public class LineraSearch {
	public static void main(String[] args) {
		int[] Adata = new int[] { 5, 3, 1, 2, 10, 9, 4, 8, 7, 6 };
		for (int i = 0; i < Adata.length; i++) {
			System.out.print("  �� " + (i + 1) + "�Ӽ�=" + Adata[i]);
			if (i == 4 || i == 9)
				System.out.println();
		}
		Scanner scn = new Scanner(System.in);
		System.out.print(" �п�J�n�j�M���Ʀr�G ");
		int searchNum = scn.nextInt();
		int num = -1; // num����-1��ܨS�������
		for (int j = 0; j < Adata.length; j++) {
			if (Adata[j] == searchNum) {
				num = j;
				break;
			}
		}
		System.out.println("================");
		if (num == -1)
			System.out.println(" �S���o�ӼƦr--> " + searchNum);
		else
			System.out.println(" " + searchNum +
				"�O��" + (num + 1) + "�ӼơC");
		scn.close();
	}

}
