/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nextdate;

/**
 *
 * @author admin
 */
public class NextDate {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2012;
        System.out.println("The next day: " + nextDate(day, month, year));
    }

    public static String nextDate(int day, int month, int year) {
        // Mảng lưu trữ số ngày của từng tháng
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        // Kiểm tra ngày và tháng có hợp lệ không
        if (year < 1812 || year > 2012 || month < 1 || month > 12 || day < 1 || day > daysInMonth[month]) {
            return "Day not found";
        }

        // Tính toán ngày kế tiếp
        day++;
        if (day > daysInMonth[month]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        
        return day + "/" + month + "/" + year;
    }

    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

