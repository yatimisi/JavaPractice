public class BreakFor {
	public static void main(String[] args) {
		int i, num = 1;
		for (i = 0; i < 10; i++) {
			num *= 2;
			if (num > 20) // ���� break ������
				break;
		}
		System.out.printf("break�Q����,���ɪ�i=%d ,num=%d", i, num);
	}
}