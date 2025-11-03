/**
 * ArrayMethods for Lab 7 Pt1
 * Basic array methods on a fixed int[]
 *
 * @author Omar Asif
 * @version 1.0
 * @since 2025-11-2
 */
public class ArrayMethods {

    // initialized to {7, 8, 8, 3, 4, 9, 8, 7}
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * returns how many values are in the array
     * uses an enhanced for loop with an accumulator
     * @return number of elements
     */
    public int count() {
        int c = 0;
        for (int val : myArray) { // enhanced for (for-each)
            c = c + 1;
        }
        return c;
    }

    /**
     * returns the sum of all values in the array
     * @return sum of elements
     */
    public int sum() {
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }

    /**
     * returns the average of the array as a double
     * @return average value
     */
    public double average() {
        return (double) sum() / count();
    }

    /**
     * returns the largest value in the arrayy
     * @return max value
     */
    public int findMax() {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    /**
     * returns the index of the largest value in the array
     * @return index of max
     */
    public int findIndexOfMax() {
        int maxIndex = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > myArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * prints an int array in {a, b, c} format
     * @param inArray int array to print
     */
    public void print(int[] inArray) {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++) {
            System.out.print(inArray[i] + ", ");
        }
        if (inArray.length > 0) {
            System.out.print(inArray[i]);
        }
        System.out.println("}");
    }

}
