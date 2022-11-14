package WrapperClasses;

import java.lang.*;
public class Main {

    //returns as int value
    public static void returnInt(Integer x) {
        System.out.println(x.intValue());
    }

    //returns as double value
    public static void returnDouble(Double y) {
        System.out.println(y.doubleValue());
    }

    public static void main(String[] args) {
        Integer x = new Integer(4); //initializes X as an integer
        returnInt(x); //returns x as an int

        Double y = new Double(4.0);//intilizatizes Y as a double
        returnDouble(y);//returns the double

        System.out.println(Double.MAX_VALUE);//Max double
        System.out.println(Double.MIN_VALUE);//Min double

        Integer iOb;
        iOb = 100;  //Autoboxing of int
        ++iOb;
        int i = iOb; // unbox
    }

}
