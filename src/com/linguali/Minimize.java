package com.linguali;

public class Minimize {
    public static String minimize(String input){
        char[] inputArray = input.toCharArray();
        for(int i=0 ; i <input.length();i++){
            char[] temp;
            // vérifier aA ou Aa
            int diff = 32;
//            if(inputArray[i] + diff == inputArray[i+1] || inputArray[i] - diff == inputArray[i+1]){
            if(Math.abs(inputArray[i] - inputArray[i+1]) == 32){

            }



        }
        return output;
    }
}
