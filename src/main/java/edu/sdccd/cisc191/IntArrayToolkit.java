package edu.sdccd.cisc191;

import java.util.Arrays;

/**
 * Module 1 - Part A
 * Utility methods for working with int[].
 *
 * IMPORTANT:
 * - Do not print inside these methods.
 * - Do not modify input arrays unless the method explicitly says so.
 */
public class IntArrayToolkit {

    /**
     * Returns the sum of all values in the array.
     * @throws IllegalArgumentException if a is null
     */
    public static int sum(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int total = 0;
        for (int value : a) {
            total += value;
        }
        return total;
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
        if (a == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Must not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int[] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy);
        return copy;
    }
}
