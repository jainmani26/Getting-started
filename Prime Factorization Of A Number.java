import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn=new Scanner (System.in);
  int n=scn.nextInt();
  
    for(int fact=2;fact<=n;fact++)
    {
        while(n%fact==0)
        {
            n=n/fact;
            System.out.print(fact+" ");
        }
    }
  
 }
}
