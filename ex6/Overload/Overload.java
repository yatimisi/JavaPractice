package Overload;       //�ŧi�{���ɪ����O�m��Overload�M��
                        //�Y�{���ɩ�b(default package)�M��U�A����ԭz���μg
class Cmath {
   public int getMax(int a, int b) {
      if (a > b) return a ;
      else       return b ;
   }
 
   public int getMax(int[] vArray) {
      int n = vArray[0];
      for(int i=1; i<vArray.length; i++) {
         if (vArray[i] > n) n = vArray[i];
      }
      return n;
   }
}

public class Overload {                      //�D���O
   public static void main(String[] args) {  //�D�{��
      Cmath max1 = new Cmath();
	  System.out.println("10 �M 20 �̤j�Ƭ��G" + max1.getMax(10, 20));
	  int[] ary = new int[]{52,66,78,99,11};
	  System.out.println("{52,66,78,99,11} �}�C���̤j�Ƭ��G" + max1.getMax(ary));
   }
}