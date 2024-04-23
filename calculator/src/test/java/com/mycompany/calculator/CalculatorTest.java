/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class CalculatorTest {
    Calculator cal;
    public CalculatorTest() {
        cal =new  Calculator();
    }

    @org.junit.jupiter.api.Test
    public void testAdd() {
        int rs = cal.add(4,5);
        int expected = 9;
        assertEquals(expected, rs);
        
    }

    @org.junit.jupiter.api.Test
    public void testSub() {
        int rs = cal.add(4,5);
        int expected = -1;
        assertEquals(expected, rs);
    }

    @org.junit.jupiter.api.Test
    public void testMul() {
        int rs = cal.add(4,5);
        int expected = 20;
        assertEquals(expected, rs);
    }

    @org.junit.jupiter.api.Test
    public void testDiv() {
        int rs = cal.add(10,5);
        int expected = 2;
        assertEquals(expected, rs);
    }
    
}
