public class BigLotto {
	// getRnd�R�A��k�i�ΨӨ��on~m�������üơA�öǵ��ҳ]�w���}�C
	static void getRnd(int[] vArray, int min, int max, int num) {
		int max_dim, rem_num, choice;
		max_dim = max - min + 1;
		int[] t = new int[max_dim];
		for (int i = 0; i <= max_dim - 1; i++) {
			t[i] = min + i;
		}
		rem_num = max_dim;
		for (int i = 0; i <= num - 1; i++) {
			choice = (int) (Math.random() * rem_num);
			vArray[i] = t[choice];
			for (int j = choice; j < rem_num - 1; j++) {
				t[j] = t[j + 1];
			}
			rem_num--;
		}

	}

	public static void main(String[] args) {
		int[] lot = new int[7];
		getRnd(lot, 1, 49, 7);
		System.out.println("�����j�ֳz�}�����X�p�U�G");
		for (int i = 0; i < 6; i++)
			System.out.print("  " + lot[i]);
		System.out.print("\n  �S�O���G" + lot[6]);
	}
}
