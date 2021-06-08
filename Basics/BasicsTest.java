import java.util.ArrayList;

public class BasicsTest {

    public static void main(String[] args ) {

    Basics test = new Basics();

    System.out.println("print 1 to 255");
    test.oneTo255();

    System.out.println("print odd numbers from 1 to 255");
    test.oddsTo255();

    System.out.println("Sum of 255");
    test.printSumOf255();

    System.out.println("iterate this array");
    int[] arr1 = {1, 3, 5, 7, 9, 13};
    test.iterateArr(arr1);

    System.out.println("find the max in each array");
    int[] arr2 = {-3, -5, -7};
    int[] arr3 = {3, -6, 6, 11, 9};
    System.out.println(test.findMax(arr2));
    System.out.println(test.findMax(arr3));

    System.out.println("find the avg");
    int[] arr4 = {2, 10, 3};
    System.out.println(test.findAvg(arr4));

    System.out.println("How many numbers are greater than Y");
    int[] arr5 = {1, 3, 5, 7};
    System.out.println(test.greaterThanY(arr5, 3));

    System.out.println("Square the values");
    int[] arr6 = {1, 5, 10, -2};
    System.out.println(test.squareValues(arr6));

    System.out.println("Eliminate the negatives");
    int[] arr7 = {1, 5, 10, -2};
    System.out.println(test.deleteNegatives(arr7));

    System.out.println("Max Min Avg");
    System.out.println(test.maxMinAvg(arr7));

    System.out.println("Shift array");
    int[] arr8 = {1, 5, 10, 7, -2};
    System.out.println(test.shiftValues(arr8));

    }
}