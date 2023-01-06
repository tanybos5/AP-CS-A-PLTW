package WhileLoops;

import java.util.Scanner;

public class WhileLoops {
    /*
    * create arraylist
    * store input in array
    * iterate array and grab values
    * display sum
    * display avrage
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.print("Number 1: ");
        num[0] = sc.nextInt();
        System.out.print("Number 2: ");
        num[1] = sc.nextInt();
        System.out.print("Number 3: ");
        num[2] = sc.nextInt();
        System.out.print("Number 4: ");
        num[3] = sc.nextInt();
        System.out.print("Number 5: ");
        num[4] = sc.nextInt();
        //sum
        int i = 0;
        int sum = 0;
        while (i < num.length){
            sum = sum + num[i];
            i++;
        }
        System.out.println(sum);
        //average
        int x = 0;
        double avr = (double)sum/num.length;
        System.out.println(avr);
    }
}
