/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class NextDateTest {
    public static void main(String[] args) {
        testNextDate(31, 12, 2012); // Output: Ngày kế tiếp là: 1/1/2013
        testNextDate(28, 2, 2020);  // Output: Ngày kế tiếp là: 29/2/2020
        testNextDate(28, 2, 2021);  // Output: Ngày kế tiếp là: 1/3/2021
        testNextDate(29, 2, 2020);  // Output: Ngày kế tiếp là: 1/3/2020
        testNextDate(31, 4, 2022);  // Output: Ngày không hợp lệ!
        testNextDate(29, 2, 1900);  // Output: Ngày không hợp lệ!
    }

    public static void testNextDate(int day, int month, int year) {
        System.out.println("The day: " + day + "/" + month + "/" + year);
        System.out.println("The next day: " + NextDate.nextDate(day, month, year));
        System.out.println("-------------------------------------");
    }
}

