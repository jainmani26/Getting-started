import java.util.*;
import java.lang.*;

   public class Main{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner scn=new Scanner (System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
     int count=0;
     int temp=n;
     while(temp>0)
     {
         count++;
         temp=temp/10;
     }
     k=k%count;
     if(k<0)
     {k=k+count;
     }
     int div=(int)Math.pow(10,k);
     int rem=n%div;
     n=n/div;
     int mult=(int)Math.pow(10,count-k);
     int res=rem*mult+n;
     System.out.println(res);
   }
   }
