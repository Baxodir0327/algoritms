package org.example.datastructure.arraylist.leetcodes;


public class ToBinary {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String string = Integer.toString(i, 2);
            System.out.println(i + " = " + string);
            System.out.println(i + " " + m2(i));
        }
    }

    private static StringBuilder m2(int i) {
        StringBuilder s = new StringBuilder();
        while (i > 0) {
            s.append(i & 1);
            i >>= 1;
        }
        return s;
    }
}
