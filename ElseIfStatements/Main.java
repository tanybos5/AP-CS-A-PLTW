package ElseIfStatements;

import java.util.Scanner;

public class Main {
    /* Add any variables you will need throughout the program here. */
    //creates hit counter
    static int hitCounter = 0;
    static String targetStr;
    static boolean matching;


    public static void main(String[] args)
    {
        // Generate the random number
        String targetStr = makeCode();
        //System.out.println(targetStr);  // uncomment for debugging

        // Break the random number into four variables.
        int r1 = Integer.parseInt(targetStr.substring(0, 1));
        int r2 = Integer.parseInt(targetStr.substring(1, 2));
        int r3 = Integer.parseInt(targetStr.substring(2, 3));
        int r4 = Integer.parseInt(targetStr.substring(3, 4));

        // Get the user's guess.
        String guess = getGuess();
        //System.out.println(guess);   // uncomment for debugging

        // Break the user's guess into four variables.
        int g1 = Integer.parseInt(guess.substring(0, 1));
        int g2 = Integer.parseInt(guess.substring(1, 2));
        int g3 = Integer.parseInt(guess.substring(2, 3));
        int g4 = Integer.parseInt(guess.substring(3, 4));

        /*your code here*/

    }

    // Checks to ensure no duplicate digits in a int.
    public static boolean hasDupes(int num)
    {
        boolean[] digs = new boolean[10];
        while (num > 0)
        {
            if (digs[num % 10])
                return true;
            digs[num % 10] = true;
            num /= 10;
        }
        return false;
    }

    // Creates a new random 4 digit code 1000-9999 with no duplicates.
    public static String makeCode()
    {
        int target = (int) (Math.random() * 9000 + 1000);
        while (hasDupes(target))
            target = (int) (Math.random() * 9000 + 1000);
        targetStr = target + "";
        return targetStr;
    }



    // Prompts the user for a guess and repeats until valid guess is made.
    public static String getGuess()
    {
        Scanner sc = new Scanner(System.in);
        boolean validGuess = false;
        int userGuess = 0;
        while (!validGuess)
        {
            System.out.print("Guess a 4-digit number from 1000 to 9999 with no duplicate digits: ");
            userGuess = sc.nextInt();
            if (!(hasDupes(userGuess) || (userGuess < 1000)))
                validGuess = true;
            hitCounter++;
            if(userGuess == Integer.parseInt(targetStr)){
                matching = true;
            }
            else {
                if(userGuess - Integer.parseInt(targetStr) >= -5 &&  userGuess - Integer.parseInt(targetStr) <= 5) {
                    System.out.print("Close But not there yet!");
                }
                else if (userGuess - Integer.parseInt(targetStr) <= 5 ||  userGuess - Integer.parseInt(targetStr) >= 5){
                    System.out.println("Way too far off");
                    System.out.println("Hits :" + hitCounter);
                }
                matching = false;
            }
        }
        String userStr = userGuess + "";
        return userStr + "\n Matching: " + matching;
    }
}
