package DeMorgans_Law;

/*
 * Activity 1.3.6
 */
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DeMorgansLawIf
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 'true' or 'false' for A");
    boolean a = Boolean.parseBoolean(sc.nextLine()); 

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = Boolean.parseBoolean(sc.nextLine());
    
    if (!(a && b))
    {
      System.out.println("NOT (a AND b) evaluates to true");
    }
    else 
    {
      System.out.println("NOT (a AND b) evaluates to false");
    }
    
    /* your code here */
     
     
     
     
    if (!(a || b))
    {
      System.out.println("NOT (a OR b) evaluates to true");
    }
    else 
    {
      System.out.println("NOT (a OR b) evaluates to false");
    }
    
     /* your code here */

    //showing !(a && b)
    if (a != true){
      if(b!=true){
        System.out.println("!(a && b) is false");
      }
    }
    else {
      System.out.println("!(a && b) is not false");
    }

    //!(a || b)
    if (a != true){
      if(b!=true){
        System.out.println("!(a || b) is false");
      }
    }
    else {
      System.out.println("!(a || b) is not false");
    }
    
  }
}
