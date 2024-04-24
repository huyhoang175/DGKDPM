/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package triangleclassifier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral Triangle", TriangleClassifier.classifyTriangle(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles Triangle", TriangleClassifier.classifyTriangle(3, 3, 2));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene Triangle", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(1, 1, 3));
    }

    @Test
    public void testNegativeSide() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(-1, 2, 3));
    }

    @Test
    public void testZeroSide() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(0, 2, 3));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Right Triangle", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testRightTriangle2() {
        assertEquals("Right Triangle", TriangleClassifier.classifyTriangle(5, 3, 4));
    }

    @org.junit.Test
    public void testClassifyTriangle() {
    }

    @org.junit.Test
    public void testMain() {
    }
}