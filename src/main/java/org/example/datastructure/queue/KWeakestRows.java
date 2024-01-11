package org.example.datastructure.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KWeakestRows {
    class Pair implements Comparable<Pair> {
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.val == p.val)
                return this.key - p.key;
            return this.val - p.val;

        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[ 0 ].length; j++) {
                if (mat[ i ][ j ] == 1) {
                    count++;
                    continue;
                }
                break;
            }
            q.add(new Pair(i, count));
        }

        int[] ans = new int[ k ];
        for (int i = 0; i < k; i++) {
            ans[ i ] = q.poll().key;
        }
        return ans;
    }
}