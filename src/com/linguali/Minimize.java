package com.linguali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jdk.internal.util.xml.impl.Input;

public class Minimize {

    public static String minimize(String input) throws Exception {
        char[] inputChars = input.toCharArray();
        List<Character> inputlist = toCharacterList(inputChars);

        while(true){
            int index = findDoubleLetter(inputlist);
            if(index == -1)
                return toString(inputlist);
            else
                inputlist = removeTwoCharacters(inputlist, findDoubleLetter(inputlist));
        }

    }

    public static int findDoubleLetter(List<Character> inputArray) {
        for (int i = 0; i < inputArray.size() - 1; i++) {
            if (Math.abs(inputArray.get(i) - inputArray.get(i + 1)) == 32) {
                return i;
            }
        }
        return -1;

    }

    public static List<Character> removeTwoCharacters(List<Character> inputArray, int i) throws Exception {
        if (i >= inputArray.size() - 1) {
            throw new Exception("you can't use this method on the last member of the list");
        }
        else if (i < 0) {
            throw new Exception("you can't use this method with a negatif index ");
        }
        List<Character> outputArray = new ArrayList<>();
        for (int j = 0; j < inputArray.size() - 2; j++) {
            if (j < i) {
                outputArray.add(inputArray.get(j));
            } else {
                outputArray.add(inputArray.get(j + 2));
            }
        }
        return outputArray;
    }

    public static List<Character> toCharacterList(char[] chars) {
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            result.add(chars[i]);
        }
        return result;
    }

    public static String toString(List<Character> chars) {
        String result ="" ;
        for (int i = 0; i < chars.size(); i++) {
            result = result + chars.get(i);
        }
        return result;
    }

}
