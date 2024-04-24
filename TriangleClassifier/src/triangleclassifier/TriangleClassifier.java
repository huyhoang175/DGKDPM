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
            return "NotATriangle";
        else if (a == b && b == c)
            return "Equilateral";
        else if (a == b || a == c || b == c)
            return "Isosceles";
        else if (a + b <= c || a + c <= b || b + c <= a)
            return "NotATriangle";
        else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
            return "RightTriangle";
        else
            return "Scalene";
    }

    public static void main(String[] args) {
        
        System.out.println(classifyTriangle(3, 3, 3));  
        System.out.println(classifyTriangle(3, 3, 2));  
        System.out.println(classifyTriangle(3, 4, 5));  
        System.out.println(classifyTriangle(1, 1, 3));  
    }
}
