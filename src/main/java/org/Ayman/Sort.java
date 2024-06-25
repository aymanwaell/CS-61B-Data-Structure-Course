package org.Ayman;

public class Sort {
    public static void sort(String[] s) {
        sort(s, 0);
    }

    // Sort array starting from index `start`
    private static void sort(String[] s, int start) {
        if (start >= s.length) {
            return;
        }
        int smallest = findSmallest(s, start);
        swap(s, start, smallest);
        sort(s, start + 1);
    }

    public static int findSmallest(String[] x, int start) {
        int smallest = start;
        for (int i = start; i < x.length; i++) { // Changed i to start from the provided `start` index
            if (x[i].compareTo(x[smallest]) < 0) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static String[] swap(String[] x, int first, int second) {
        String temp = x[second];
        x[second] = x[first];
        x[first] = temp;
        return x;
    }
}
