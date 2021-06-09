import java.util.ArrayList;

public class Basics {

    public void oneTo255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void oddsTo255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSumOf255() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArr(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int findAvg(int[] array) {
        int avg = 0;
        int sum = 0;
        for (int i : array) {
            sum += i;
            avg = sum/array.length;
        }
        return avg;
    }

    public int greaterThanY(int[] array, int input) {
        int count = 0;
        for (int i : array) {
            if (i > input) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> squareValues(int[] array) {
        ArrayList<Integer> square = new ArrayList<Integer>();
        for (int i : array) {
            square.add((int)(Math.pow(i, 2)));
        }
        return square;
    }

    public ArrayList<Integer> deleteNegatives(int[] array) {
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (int i : array) {
            if (i >= 0) {
                newarr.add(i);
            }
        }
        return newarr;
    }

    public ArrayList<Double> maxMinAvg(int[] array) {
        ArrayList<Double> newarr = new ArrayList<Double>();
        double max = array[0];
        double min = array[0];
        double sum = 0;

        for (int i : array) {
            if (max < i) {  // array[0] < array[1]
                max = i;  // array[1]
            }
            if (min > i) {
                min = i;
            }
            sum += i;
        }
        double avg = sum/array.length;

        newarr.add(max);
        newarr.add(min);
        newarr.add(avg);

        return newarr;
    }

    public ArrayList<Integer> shiftValues(int[] array) {
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            newarr.add(array[i]);
        }
        newarr.add(0);
        return newarr;
    }
}