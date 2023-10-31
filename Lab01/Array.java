package Lab1;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] elements = new int[] {174, 1789, 45, 1, 23, 2, 110, 2035, 34, 1456, 59, 10};
        int sum = 0;

        //sort array
        Arrays.sort(elements);

        //Calculate the sum
        for (int number : elements) {
            sum += number;
        }

        System.out.println("Array Sorted: " + Arrays.toString(elements));
        System.out.println("Average value of Array element: " + (double) sum / elements.length);

    }
}
