import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn=new Scanner (System.in);
      int n=scn.nextInt();
      fibo(n);
   }
   public static void fibo(int num)
   {
       int f1=0,f2=1;
       if(num<1)
       return;
       System.out.println(f1);
       for(int i=1;i<num;i++)
       {
           System.out.println(f2);
           int next=f1+f2;
           f1=f2;
           f2=next;
       }
   }
  }
