/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangleclassifier;

/**
 *
 * @author admin
 */
public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return "Not a Triangle";
        else if (a == b && b == c)
            return "Equilateral Triangle";
        else if (a == b || a == c || b == c)
            return "Isosceles Triangle";
        else if (a + b <= c || a + c <= b || b + c <= a)
            return "Not a Triangle";
        else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
            return "Right Triangle";
        else
            return "Scalene Triangle";
    }

    public static void main(String[] args) {
        // Testing
        System.out.println(classifyTriangle(3, 3, 3));  // Equilateral Triangle
        System.out.println(classifyTriangle(3, 3, 2));  // Isosceles Triangle
        System.out.println(classifyTriangle(3, 4, 5));  // Right Triangle
        System.out.println(classifyTriangle(1, 1, 3));  // Not a Triangle
    }
}
