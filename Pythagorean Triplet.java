import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    int c=scn.nextInt();
    
    boolean pyt=true;
    if(a*a+b*b>=c*c)
    {
        pyt=true;
    }
    else 
    {
        pyt=false;
    }
    System.out.println(pyt);
   }
  }
