public class Method2 {
	public static void main(String[] args) {
		int tot1, tot2;
		tot1 = sum(1, 10);
		System.out.println("1�[��10���`�M��" + tot1 + "\n");
		tot2 = sum(5, 12);
		System.out.println("5�[��12���`�M��" + tot2 + "\n");
	}

	static int sum(int vStart, int vEnd) {
		int total = 0;
		for (int i = vStart; i <= vEnd; i++)
			total += i;
		return total;
	}

}
