
public class Ex02_11 {

	public static void main(String[] args) {
		int a,d;
		byte b = 100;
		long c = 200;
		a = b;			//��ƫ��O�۰��ഫ
		System.out.println("a = " + a);
		d = (int) c;		//��ƫ��O�j���ഫ
		System.out.println("d = " + d); 
		d=(int)(b+c);		//��ƫ��O�j���ഫ
		System.out.println("b + c = " + d);
	}

}
