package Constructor;   //�ŧi�{���ɪ����O�m��constructor�M��

class Cstudent {
   private int height = 150;      //��l��height��Ʀ������Ȭ�150
   private int weight = 40;       //��l��weight��Ʀ������Ȭ�40
   private void setWeight(int w) {
      if (w>=40 && w<=150) weight = w;
   }
   private void setHeight(int h) {
      if (h>=50 && h<=250) height = h ;
   }
   public Cstudent() { }           //Cstudent���O���غc���A�S���ǤJ�޼�
   public Cstudent(int w) {        //Cstudent���O���غc���A�ǤJ�@�Ӥ޼�
      setWeight(w);                //�I�ssetWeight��k��l��weight��Ʀ���
   }
   public Cstudent(int h, int w) { //Cstudent���O���غc���A�ǤJ��Ӥ޼�
      setHeight(h);                //�I�ssetHeight��k��l��height��Ʀ���
      setWeight(w);                //�I�ssetWeight��k��l��weight��Ʀ���
   }
   public void getShow() {
      System.out.println("  �����O: " + height);
      System.out.println("  �魫�O: " + weight + "\n");
   }
}

public class Constructor {                    //�D���O
   public static void main(String[] args) {  //�D�{��   
      Cstudent Peter = new Cstudent();
	  System.out.println("Peter����� --> �ϥ�Cstudent()�غc��");
	  Peter.getShow();
	  Cstudent David = new Cstudent(300);
	  System.out.println("David����� --> �ϥ�Cstudent(300)�غc��");
	  David.getShow();
	  Cstudent Mary = new Cstudent(180,78);
	  System.out.println("Mary����� --> �ϥ�Cstudent(180, 78)�غc��");
      Mary.getShow();
   }
}