package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManipulationTest {

    //test cases for roll function
    @Test
    public void testRollFunctionLength() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int n = 4;
        int[] expectedOutput = new int[4];
        assertEquals("this should return 'true'", expectedOutput.length, classUnderTest.roll(n).length);
    }

    @Test
    public void testRollFunctionEmptyArray() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int n = 0;
        int[] expectedOutput = {};
        assertArrayEquals("this should return 'true'", expectedOutput, classUnderTest.roll(n));
    }

    /*********************************************************************/
    //test cases for containsDuplicate function
    @Test
    public void testContainsDuplicateFunctionTruthy() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int[] arr = {1,1,5,7,8,5,4,3,6,4};
        assertEquals("this should return 'true'", true, classUnderTest.containsDuplicate(arr));
    }

    @Test
    public void testContainsDuplicateFunctionFalsey() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int[] arr = {1,2,5,7,8,4,3,6};
        assertEquals("this should return 'false'", false, classUnderTest.containsDuplicate(arr));
    }

    /*********************************************************************/
    //test cases for calculateAverage function
    @Test
    public void testCalcAvgTruthy() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int[] arr = {1,2,3,4,5};
        assertEquals("this should return 'true'", 3, classUnderTest.calcAvg(arr));
    }

    @Test
    public void testCalcAvgFalsey() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int[] arr = {1,2,3,4,5};
        assertFalse("this should return 'false'", 4 == classUnderTest.calcAvg(arr));
    }


    /*********************************************************************/
    //test cases for array of arrays function
    @Test
    public void testArrayOfArrayTruthy() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int[][] arr = {
                {1, 2, 3, 4, 5, 6, 7},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals("this should return 'true'", 4, classUnderTest.array0fArrays(arr));
    }

    @Test
    public void testArrayOfArrayFalsey() {
        ArrayManipulation classUnderTest = new ArrayManipulation();
        int[][] arr = {
                {1, 2, 3, 4, 5, 6, 7},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertFalse("this should return 'false'", 100 == classUnderTest.array0fArrays(arr));
    }
}
