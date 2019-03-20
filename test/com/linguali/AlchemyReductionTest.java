package com.linguali;

import org.junit.jupiter.api.Test;

import static com.linguali.Minimize.minimize;
import static org.junit.jupiter.api.Assertions.*;

class AlchemyReductionTest {

    @Test
    public void Testm(){
        assertEquals("C", minimize("AaBbC"));
    }

    @Test
    public void TestB(){
        // Arrange
        String input = "AaBbC";

        // Act
        String result = minimize(input);

        // Assert
        assertEquals("C", result);
    }
}