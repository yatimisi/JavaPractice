public class MyArray2 {
	public static void main(String[] args) {
		int[] n = new int[] { 56, 45, 68, 32 };
		int sum = 0;
		for (int i : n) { // �v�@Ū���}�Cn�������Ȩ��ܼ�i
			System.out.println(i);
			sum += i;
		}
		System.out.println(" n �}�C�����`�M�� " + sum);
	}
}
