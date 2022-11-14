package Concatenates;

public class Main {
    public static void main(String[] args) {
        String str1 = "This is part of str1 ";
        String str2 = "This is part of str2";

        System.out.println("This is them combined: " + str1 + str2);

        str1 += str2;

        System.out.println("And this is str1 and str2 combined via concatenaton : " + str1);
    }
}
