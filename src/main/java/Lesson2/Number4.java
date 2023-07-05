package Lesson2;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t<=-5 && t>-20) {
            System.out.println("Нормально");
        } else if (t<=-20) {
            System.out.println("Холодно");
        }
    }
}
