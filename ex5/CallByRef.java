class Person {
	int weight, height;

	Person() {
		weight = 65;
		height = 165;
	}
}

public class CallByRef {

	public static void main(String[] args) {
		Person Jack = new Person();
		System.out.println("�ѦҩI�s�e\tJack�魫=" + Jack.weight + "\tJack����="
				+ Jack.height);
		byRef(Jack);
		System.out.println("�ѦҩI�s��\tJack�魫=" + Jack.weight + "\tJack����="
				+ Jack.height);
	}

	static void byRef(Person p) {
		p.weight += 3;
		p.height += 2;
		System.out
				.println("�ѦҩI�s��\tJack�魫=" + p.weight + "\tJack����=" + p.height);
	}
}
