/*
BRAYDEN COGHILL
300347436
 */

/**
 * A collection of functions.
 */

public class GoodFunctions {

    /**
     * An incorrectly implemented bubbleSort routine.
     *
     * @param a array to be sorted
     */
    public static void bubbleSort(int[] a) {
        for (int steps = 1; steps < a.length; steps++) {
            for (int i = 0; i < a.length - steps; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }
    }

    /**
     * A sort routine that works by swapping randomly selected
     * elements if they are out of order
     *
     * @param a array to be sorted
     */
    public static void randomSort(int[] a) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    /**
     * Finds the number of digits in a number. Eg. n=3482 has 4 digits
     * and n=-54638 has 5 digits and n=8 has 1 digit
     *
     * @param n
     * @return the number of digits in n
     */
    public static int numDigits(int n) {
        if (n == 0) {
            return 1;
        }
        n = Math.abs(n);
        int numDigits = 0;
        while (n > 0) {
            n = n / 10;
            numDigits++;
        }
        return numDigits;
    }


    /**
     * Returns the average (rounded down) of two ints a and b.
     *
     * @param a an integer
     * @param b an integer
     * @return the average of the integers
     */
    public static int average(int a, int b) {
        return (a + b) / 2;
        // beware! adding two integers is subject to integer overflow
    }

    /**
     * Determines if the given String s reads backwards as it does forwards
     *
     * @param s A word to test if it is a palindrome
     * @return true if s is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Correctly swaps two elements in an array. This method does not need
     * to be tested
     *
     * @param a an integer array
     * @param i the index of the first element to be swapped
     * @param j the index of the second element to be swapped
     */
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
