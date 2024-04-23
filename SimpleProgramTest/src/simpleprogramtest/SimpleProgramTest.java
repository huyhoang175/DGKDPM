/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleprogramtest;

/**
 *
 * @author admin
 */
public class SimpleProgramTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Number is not positive");
        }// TODO code application logic here
    }
    
}
