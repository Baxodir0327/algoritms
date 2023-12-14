package org.example.datastructure.arraylist.leetcodes;

import java.util.*;

public class App {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i],names[i]);
        }
        int j=0;
        for (String value : map.values()) {
            names[j++]=value;
        }
        //String[] array = map.values().toArray(new String[ 0 ]);
    }
}
