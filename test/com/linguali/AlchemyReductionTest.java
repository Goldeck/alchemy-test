package com.linguali;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.linguali.Minimize.minimize;
import static org.junit.jupiter.api.Assertions.*;

class AlchemyReductionTest {



    @Test
    public void should_minimize_AaBbC_to_C() throws Exception {
        assertEquals("C", minimize("AaBbC"));
    }
    @Test
    public void should_minimize_AZERTYYtreza_to_AZERTYYtreza() throws Exception {
        assertEquals("AZERTYYtreza", minimize("AZERTYYtreza"));
    }

    @Test
    public void should_minimize_AaBbCc_to_empty_string() throws Exception {
        // Arrange
        String input = "AaBbCc";

        // Act
        String result = minimize(input);

        // Assert
        assertEquals("", result);
    }

    @Test
    public void should_remove_two_characters_in_start() throws Exception {
        // Arrange
        String input = "AaBbC";
        List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
        // Act
        String result = Minimize.removeTwoCharacters(inputList,0).toString();

        // Assert
        assertEquals("[B, b, C]", result);
    }

    @Test
    public void should_find_first_double_caracters_in_0() throws Exception {
        // Arrange
        String input = "AaBbC";
        List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
        // Act
        int result = Minimize.findDoubleLetter(inputList);

        // Assert
        assertEquals(0, result);
    }
    @Test
    public void should_not_find_first_double_caracters_and_return_minus_one() throws Exception {
        // Arrange
        String input = "AZERTY";
        List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
        // Act
        int result = Minimize.findDoubleLetter(inputList);

        // Assert
        assertEquals(-1, result);
    }
    @Test
    public void should_find_first_double_caracters_in_5() throws Exception {
        // Arrange
        String input = "AZERTYy";
        List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
        // Act
        int result = Minimize.findDoubleLetter(inputList);

        // Assert
        assertEquals(5, result);
    }


    @Test
    public void should_remove_two_characters_in_middle() throws Exception {
        // Arrange
        String input = "AaBbC";
        List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
        // Act
        String result = Minimize.removeTwoCharacters(inputList,1).toString();

        // Assert
        assertEquals("[A, b, C]", result);
    }
    @Test
    public void should_remove_two_characters_in_last_but_not_least() throws Exception {
        // Arrange
        String input = "AaBbC";
        List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
        // Act
        String result = Minimize.removeTwoCharacters(inputList,inputList.size() - 2).toString();

        // Assert
        assertEquals("[A, a, B]", result);
    }

    @Test
    public void should_throw_exception_when_remove_two_characters_last(){
        try {
            String input = "AaBbC";
            List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
            Minimize.removeTwoCharacters(inputList,inputList.size() - 1);
            fail("Should fail as the i selected is the last member of the list");
        }catch(Exception e){
            assert(e.getMessage().contains("you can't use this method on the last member of the list"));
        }
    }

    @Test
    public void should_throw_exception_when_index_is_negatif(){
        try {
            String input = "AaBbC";
            List<Character> inputList = Minimize.toCharacterList(input.toCharArray());
            Minimize.removeTwoCharacters(inputList,- 1);
            fail("Should fail as the i selected is the negatif");
        }catch(Exception e){
            assert(e.getMessage().contains("you can't use this method with a negatif index "));
        }
    }

}

