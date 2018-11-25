package Encapsulate;    //�ŧi�{���ɪ����O�m��Encapsulate�M��

class Ccar {                      //�T�����O
   private double gas, tbo;       //�ŧi�̦h���o�q, �����Ӫo�q
   private double max_dist = 0;   //�[���o�i��p�̪��Z��

   private void MaxDist() {       //�p��i��p�̪��Z��
      max_dist = gas * tbo;
   }

   public void SetValue(double g, double t) { //�ǤJ���
      gas = g;
      tbo = t;
      MaxDist();
   }

   public double GetDist() {      //�ǥX���
      return max_dist;
   }
}

public class Encapsulate {       //�D���O
   public static void main(String[] args) {   //�D�{��
      Ccar car1;                              //�ŧicar1����
      car1 = new Ccar();                      //�إ�car1����
	  double g1 = 40.7, t1 = 13.6;
	  car1.SetValue(g1, t1);                  //�]�wcar1�����ݩʭ�
	  double distance1 = car1.GetDist();      //���ocar1���󪺤�k�Ǧ^��
	  Ccar car2 = new Ccar();                 //�ŧi�ëإ�car2����
	  car2.SetValue(60, 9.5);                 //�]�wcar1�����ݩʭ�
	  System.out.println("car1�[���o�i��p " + distance1 + " km");
	  System.out.println("car2�[���o�i��p " + car2.GetDist() + " km");
   }
}