package org.example;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("nol");
            return;
        }

        String sing = number < 0 ? "minus " : "";

        number = Math.abs(number);

        String[] rooms = {"", "ming", "million", "milliard"};
        int roomIndex = 0;

        StringBuilder result = new StringBuilder();

        while (number != 0) {
            String str3 = readNumberWithThreeRoom(number % 1000);

            if (!str3.isBlank()) {
                result.insert(0, str3 + " " + rooms[ roomIndex ] + " ");
            }
            roomIndex++;

            number /= 1000;
        }

        System.out.println(sing + result);
    }

    public static String readNumberWithThreeRoom(int number) {

        String[] oneRooms = {"", "bir", "ikki", "uch", "to'rt",
                "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] tenRooms = {"", "o'n", "yigirma", "o'ttiz", "qirq",
                "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

        String str = "";

        int r1 = number % 10;
        int r10 = number / 10 % 10;
        int r100 = number / 100;
        // 429 => to'rt yuz yigirma to'qqiz

        if (r100 > 0) {
            str += oneRooms[r100] + " yuz ";
        }

        str += tenRooms[r10] + " " + oneRooms[r1];

        return str;
    }
}
