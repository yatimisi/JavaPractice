  public class test {
    public static void main(String[] args) {
          int n = 0;
          black1:{
            for(int i = 0;i < 50;i++){
                for(int j = 0;j < 70;j++){
                    for(int k = 0;k < 90;k++){
                        n = n + 1;
                        if(i == 20 && j == 31 && k == 60)
                            break black1;
                    }
                }
            }
          }
          System.out.println(n);
	  }

  }
  
  