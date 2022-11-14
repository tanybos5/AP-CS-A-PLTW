package MadLibsProject;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;
import java.lang.*;

public class Main {

    static String input1;
    static String input2;
    static String input3;
    static String input4;
    static String input5;
    static String input6;
    static String input7;
    static String input8;


    public static void returnMadLib() {
        System.out.println("When some " + input1 +  " school students were asked what nursery rhymes popped " + input2 + " into their " + input3 + " or were on the tip of their " + input4 + " , these were their " + input5 + " answers :"
                + "\n -" + input6
                + "\n -" + input7
                + "\n -" + input8);
    }

    public static void testMadLib() {
        input1 = "smelly";
        input2 = "abnormally";
        input3 = "noggins";
        input4 = "toes";
        input5 = "silly";
        input6 = "Old Mcdonald had a Farm";
        input7 = "Marry Row ur Boat";
        input8 = "Old Yankee";
        returnMadLib();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        if(input1 == null && input2 == null && input3 == null && input4 == null && input5 == null && input6 == null && input7 == null && input8 == null){
            input1 = "__";
            input1 = "__";
            input3 = "__";
            input4 = "__";
            input5 = "__";
            input6 = "__";
            input7 = "__";
            input8 = "__";
        }
        returnMadLib();
        System.out.print("Type 0 to exit, type 1 to show the test mad-lib, or 2 to enter your own values: ");
        int startingInput = sc.nextInt();
        while(true) {
            if(startingInput == 0) {
                System.out.println("Bye Bye");
                break;
            }
            if(startingInput == 1) {
                System.out.println("Test Mad-Lib : ");
                System.out.println();
                testMadLib();
                break;
            }
            if(startingInput == 2){
                System.out.println("Type an adjective : ");
                input1 = sc.next();
                System.out.println("Type an adverb : ");
                input2 = sc.next();
                System.out.println("Type a part of the body : ");
                input3 = sc.next();
                System.out.println("Type another part of the body : ");
                input4 = sc.next();
                System.out.println("Type an adjective : ");
                input5 = sc.next();
                System.out.println("Type a nursery rhyme : ");
                input6 = sc.next();
                System.out.println("Type a nursery rhyme : ");
                input7 = sc.next();
                System.out.println("Type a nursery rhyme : ");
                input8 = sc.next();
                System.out.println("ALL DONE! Here is your mad-lib : ");
                returnMadLib();
                break;
            }
        }
    }
}
