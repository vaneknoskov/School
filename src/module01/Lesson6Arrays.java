package module01;

import java.util.Arrays;

public class Lesson6Arrays {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        System.out.println("Task 2");
        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] reverse = new int[10];
        int l = array1.length;
        for(int i = l - 1, j = 0; i >= 0; i--, j++){
            reverse[j] = array[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("Task 3");

        swap(array, 0,1);

        System.out.println("Task 4");



    }
    private static void swap(int[] arrays, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(arrays) + " indices " + indexA + " and " + indexB);
        int a = arrays[indexB];
        arrays[indexB] = arrays[indexA];
        arrays[indexA] = a;
        System.out.println("Result: " + Arrays.toString(arrays) + "\n");
    }
}
