public class NestWhile {
	public static void main(String[] args) {
		int i = 1, j = 1;
		while (i <= 9) // �~�h�j��1~9���Q����
		{
			while (j <= 9) { // ���h�j��1~9������
				System.out.printf("%d*%d=%2d  ", i, j, i * j);
				j++; // j+1
			}
			i++; // i+1
			j = 1; // j=1���s�}�l
			System.out.println(); // ����
		}
	}
}
