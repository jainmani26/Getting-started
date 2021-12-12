import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    for(int i=1;i*i<=n;i++)
    {
        //after n fluctuations only perfect squares will be on
        System.out.println(i*i);
    }
   }
  }
