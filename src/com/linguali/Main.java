package com.linguali;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
     //                 "0 A 1 Z 2 E 3 R 4 T 5 A 6 a 7 Y 8 U"
        String input="AZERTAaYUIOBbP";
        String output = Minimize.minimize(input);
        System.out.println(output);
    }
}
