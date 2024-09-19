/*
BRAYDEN COGHILL
300347436
 */

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;


class TestBadFiles {

    @Test
    void testAverage1() {
        assertEquals(15, BadFunctions.average(10, 20));
        assertEquals(1, BadFunctions.average(1, 2));
        assertEquals(49, BadFunctions.average(0, 99));
    }

    @Test
    void testAverage2() {
        assertEquals(10, BadFunctions.average(-10, 30));
        assertEquals(228456, BadFunctions.average(123, 456789));
    }

    @Test
    void testAverage3() {
        // DONE: make a testcase that YOU know the correct answer to, but the
        // function returns an incorrect result
        assertEquals(3, BadFunctions.average(4, 16));

    }

    @Test
    void testIsPalindrome1() {
        assertTrue(BadFunctions.isPalindrome("stabbats"));
    }

    @Test
    void testIsPalindrome2() {
        assertFalse(BadFunctions.isPalindrome("notAPalton"));
    }

    @Test
    void testIsPalindrome3() {
        // DONE: make a testcase that YOU know the correct answer to, but the
        // function returns an incorrect result
        assertTrue(BadFunctions.isPalindrome("Racecar"));
    }

    @Test
    void testNumDigits1() {
        assertEquals(3, BadFunctions.numDigits(999));
        assertEquals(4, BadFunctions.numDigits(9999));
        assertEquals(3, BadFunctions.numDigits(100));
        assertEquals(4, BadFunctions.numDigits(1001));
    }

    @Test
    void testNumDigits2() {
        assertEquals(1, BadFunctions.numDigits(9));
        assertEquals(4, BadFunctions.numDigits(-4321));
        assertEquals(3, BadFunctions.numDigits(590));
        assertEquals(2, BadFunctions.numDigits(-99));
    }

    @Test
    void testNumDigits3() {
        // DONE: make a testcase that YOU know the correct answer to, but the
        // function returns an incorrect result
        assertEquals(1, BadFunctions.numDigits(0));

    }

    @Test
    void testBubbleSort1() {
        int[] nums = {1, 5, 2, 4, 3};
        int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
        BadFunctions.bubbleSort(nums); // sorts with our bad function
        Arrays.sort(correct); // a correctly sorted array
        assertArrayEquals(correct, nums);
    }

    @Test
    void testBubbleSort2() {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9};
        int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
        BadFunctions.bubbleSort(nums); // sorts with our bad function
        Arrays.sort(correct); // a correctly sorted array
        assertArrayEquals(correct, nums);
    }

    @Test
    void testBubbleSort3() {
        // DONE: make a testcase that YOU know the correct answer to, but the
        // function returns an incorrect result
        int[] input = {5, 3, 8, 4, 2, 1, 9, 7, 6, 0, 12, 11, 10, 35, 22, 25, 30};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 22, 25, 30, 35};

        BadFunctions.bubbleSort(input);
        assertArrayEquals(expected, input);

    }

    @Test
    void testRandomSort1() {
        int[] nums = {1, 5, 2, 4, 3};
        int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
        BadFunctions.randomSort(nums); // sorts with our bad function
        Arrays.sort(correct); // a correctly sorted array
        assertArrayEquals(correct, nums);
    }

    @Test
    void testRandomSort2() {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9};
        int[] correct = Arrays.copyOf(nums, nums.length); // a copy of array nums
        BadFunctions.randomSort(nums); // sorts with our bad function
        Arrays.sort(correct); // a correctly sorted array
        assertArrayEquals(correct, nums);
    }

    @Test
    void testRandomSort3() {
        // DONE: make a testcase that YOU know the correct answer to, but the function returns an incorrect result
        int n = 1001;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * n);
        }
        int[] correct = Arrays.copyOf(nums, nums.length);
        BadFunctions.randomSort(nums);
        Arrays.sort(correct);
        assertArrayEquals(correct, nums);

    }

    @Test
    void testSetConstructor() {
        BadSet<String> bss = new BadSet<>();
        BadSet<Integer> bsi = new BadSet<>();
        BadSet<ArrayList<Character>> bsac = new BadSet<>();
        assertNotNull(bss);
        assertNotNull(bsi);
        assertNotNull(bsac);
    }

    @Test
    void testSetAddAndContains() {
        BadSet<Integer> bsi = new BadSet<>();
        bsi.add(3);
        assertTrue(bsi.contains(3));
        assertEquals(1, bsi.size());
        bsi.add(3); // should have no effect since a SET does not keep duplicated items
        assertTrue(bsi.contains(3));
        assertEquals(1, bsi.size());
        bsi.add(8);
        assertTrue(bsi.contains(3));
        assertTrue(bsi.contains(8));
        assertEquals(2, bsi.size());
        bsi.add(8);
        assertTrue(bsi.contains(3));
        assertTrue(bsi.contains(8));
        assertEquals(2, bsi.size());
    }

    @Test
    void testSetAddAndRemoveAndContains1() {
        BadSet<Integer> bsi = new BadSet<>();
        bsi.add(3);
        assertTrue(bsi.contains(3));
        assertEquals(1, bsi.size());
        bsi.add(3); // should have no effect since a SET does not keep duplicated items
        assertTrue(bsi.contains(3));
        assertEquals(1, bsi.size());
        bsi.add(8);
        assertTrue(bsi.contains(3));
        assertTrue(bsi.contains(8));
        assertEquals(2, bsi.size());
        bsi.add(8);
        assertTrue(bsi.contains(3));
        assertTrue(bsi.contains(8));
        assertEquals(2, bsi.size());
        bsi.remove(3);
        assertFalse(bsi.contains(3));
        assertTrue(bsi.contains(8));
        assertEquals(1, bsi.size());
    }

    @Test
    void testSetAddAndRemoveAndContains2() {
        // DONE: create a situation of add and remove operations that finds an error in the BadSet data structure
        BadSet<Integer> bsi = new BadSet<>();
        bsi.add(3);
        assertTrue(bsi.contains(3));
        assertEquals(1, bsi.size());
        bsi.add(5);
        assertTrue(bsi.contains(5));
        assertEquals(2, bsi.size());
        bsi.add(5);
        assertTrue(bsi.contains(5));
        assertEquals(2, bsi.size());
        bsi.add(5);
        assertTrue(bsi.contains(5));
        assertEquals(2, bsi.size());
        bsi.remove(2);
        assertFalse(bsi.contains(2));
        assertTrue(bsi.contains(3));
        assertEquals(2, bsi.size());

        assertTrue(bsi.contains(10));


    }
}
