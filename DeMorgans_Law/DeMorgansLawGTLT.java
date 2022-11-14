package DeMorgans_Law;

/*
 * Activity 1.3.6
 */
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DeMorgansLawGTLT
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number for X");
    int x = Integer.parseInt(sc.nextLine()); 

    System.out.println("Enter a number for Y");
    int y = Integer.parseInt(sc.nextLine()); 
    
    System.out.println("Checking that both x and are not negative ... ");
    
    System.out.println("(!(x < 0) && !(y < 0))");
    System.out.println((!(x < 0) && !(y < 0)));
    
    /* your code here */
    if ((!(x < 0) && !(y < 0))){
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }




  }
}
