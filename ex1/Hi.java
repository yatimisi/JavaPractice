  /*
   * 我的第一個Java程式
   */
  import java.util.Scanner;	//import Scanner類別套件

  /** 這是主類別 Hi */
  public class Hi {
	  
	  /**這是程式進入點 main 方法*/
	  public static void main(String[] args) {
		  Scanner scn=new Scanner(System.in);	/*建立 Scanner 物件 scn*/
		  System.out.print("請輸入姓名：");
		  String strName = scn.next();	//字串變數strName儲存scn接受的字串
		  System.out.println("Hi! "+strName + ", 歡迎來到Java世界！");
		  scn.close();	//關閉scn物件
	  }
  
  }
  
  