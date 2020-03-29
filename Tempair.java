import java.util.Scanner; 
 
/* contoh pemakaian IF tiga kasus : wujud air */ 

public class public class OverloadingTest{

   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      double c = 7.3;
      double d = 9.4;
      int result1 = minFunction(a, b);
      // nama fungsi yang sama name dengan parameters yang berbeda
      double result2 = minFunction(c, d);
      System.out.println("nilai terkecil = " + result1);
      System.out.println("nilai terkecil = " + result2);
   }

  // integer
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
   // double
   public static double minFunction(double n1, double n2) {
     double min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
} { 
 
   /**    
     * @param args   
	 */ 

 public static void main(String[] args) {   
     // TODO Auto-generated method stub   
	 /* Kamus : */  

	 int T;  
	 Scanner masukan=new Scanner(System.in);   
	 /* Program */ 
 
     System.out.print  ("Contoh IF tiga kasus \n");  
	 System.out.print  ("Temperatur (der. C) = "); 

	 T=masukan.nextInt();   if (T < 0) {    
	 
	 System.out.print ("Wujud air beku \n"+ T);  
}else if ((0 <= T) && (T <= 100)){   
     System.out.print ("Wujud air cair \n"+ T);   
}else if (T > 100){    
     System.out.print ("Wujud air uap/gas \n"+ T);    }; 
 
 } } 