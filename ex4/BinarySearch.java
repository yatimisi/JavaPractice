import java.util.Scanner;


public class BinarySearch {
	public static void main(String[] args) {
		  int[] aNum = { 23, 100, 58, 11, 67, 12, 44, 101, 75 };
		  System.out.print(" �Ƨǫe�G");
		  for (int i = 0; i < aNum.length; i++)
			   System.out.print("  " + aNum[i]);
		  System.out.println();
		  int n = aNum.length;
		  int t;
		  for (int i = n - 2; i >= 0; i--) { // �i���w�ƧǪk
			   for (int j = 0; j <= i; j++) {
				  if (aNum[j] > aNum[j + 1]) {
				  	 t = aNum[j];
					 aNum[j] = aNum[j + 1];
					 aNum[j + 1] = t;
				  }
			   }
		  }
		  System.out.print(" �Ƨǫ�G");
		  for (int i = 0; i < aNum.length; i++)
			   System.out.print("  " + aNum[i]);
		  System.out.println();
		  Scanner scn = new Scanner(System.in);
		  System.out.print(" �п�J�n�j�M���Ʀr�G ");
		  int sNum = scn.nextInt();
		  int num = -1, low = 0, high = aNum.length - 1, midNum = 0;
		  do {
			   midNum = (low + high) / 2;
		      if (aNum[midNum] == sNum) {	//�Y�������Ъ��}�C�ȩM�j�M��ƬۦP
					num = midNum;
					break;				//���}�j��
				}
				if (aNum[midNum] > sNum) //�Y�������Ъ��}�C��>�j�M���
					high = midNum - 1;	//���]�W�ɭ�
				else
					low = midNum + 1; 	//���]�U�ɭ�
		  } while (low <= high);			//�Y�U�ɭ� <= �W�ɭȴN�~�����
		  if (num == -1)
			  System.out.println(" �S�� " + sNum + " �o�ӼƦr! ");
		  else
			 System.out.println("�Ƨǫ���"+sNum+"�O��"+(num +1)+ "�ӼƦr!");
		  scn.close();
		}

}
