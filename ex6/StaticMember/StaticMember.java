package StaticMember;    //�ŧi�{���ɪ����O�m��StaticMember�M��

class Cstudent {
   //num�R�A������private�ŧi�A��ܥu��b�ۨ����O�ϥΡA
   private static int num;       //num�Ψӭp��ϥ�Cstudent���O�إߪ��󪺭Ӽ�
   public int weight, height;
   public Cstudent() {
      num++;         //num�R�A�����[1
   }
   public Cstudent(int w, int h) {
      num++;         //num�R�A�����[1
      weight = w;
      height = h;
   }
   public static void getObjectNum() {  //getObjectNum�R�A����
      System.out.println("�ثe�ϥ�Cstudent���O���ͤF " + num + " �Ӫ������\n") ;
   }
}

public class StaticMember {                  //�D���O
   public static void main(String[] args) {  //�D�{��
      Cstudent Peter = new Cstudent();
	  Peter.weight = 65;
	  Peter.height = 165;
	  System.out.println("Peter�魫=" + Peter.weight + "\t����=" + Peter.height);
	  Cstudent.getObjectNum();    //Cstudent���O�I�sgetObjectNum�R�A����
	  Cstudent David = new Cstudent(58, 170);
	  System.out.println("David�魫=" + David.weight + "\t����=" + David.height);
      David.getObjectNum();       //����I�sgetObjectNum�R�A����
   }
}