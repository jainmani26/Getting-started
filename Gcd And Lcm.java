import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();
    
    int dvdn=num1;
    int dvsr=num2;
    
    while(dvdn%dvsr!=0)
    {
        int rem=dvdn%dvsr;
        dvdn=dvsr;
        dvsr=rem;
    }
    int HCF=dvsr;
    System.out.println(HCF);

    int LCM ;
    LCM = (num1 * num2) / HCF;
    System.out.println(LCM);
  }
}
