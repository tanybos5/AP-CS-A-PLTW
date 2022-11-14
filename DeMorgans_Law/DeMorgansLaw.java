package DeMorgans_Law;
/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 'true' or 'false' for A");
    boolean a = Boolean.parseBoolean(sc.nextLine()); 

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = Boolean.parseBoolean(sc.nextLine());
    
    /* your code here */

    //not (a and b) is the same as (not a) or (not b).
    if(!(a == false && b == false)) {
      System.out.println("not (a and b) is true");
    }
    if (!(a == false) || !(b == false) ){
      System.out.println("(not a) or (not b) is true");
    }

    //not (a or b) is the same as (not a) and (not b).
    if(!(a == false || b == false)) {
      System.out.println("not (a or b) is true");
    }
    if (!(a == false) && !(b == false) ){
      System.out.println("(not a) and (not b) is true");
    }

  }
}
