package module01;

import java.util.Arrays;

public class Lesson06_arrays {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        System.out.println("Task 2");
        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] reverse = new int[10];
        int l = array1.length;
        for(int i = l - 1, j = 0; i >= 0; i--, j++) reverse[j] = array[i];
        System.out.println(Arrays.toString(reverse));

        System.out.println("Task 3");

        swap(array, 0,1);

        System.out.println("Task 4");

        int [] array2 = {1,  2 , 3};
        swap2(array2, 1,2);
        swap2(array2, 1,3);
        swap2(array2, -1,0);

        int [] array3 = new int[]{2, 4, 6, 8, 10};
        swap2(array3, 2,3);
        swap2(array3, 4,5);
        swap2(array3, -2,0);


    }
    private static void swap(int[] arrays, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(arrays) + " indices " + indexA + " and " + indexB);
        int a = arrays[indexB];
        arrays[indexB] = arrays[indexA];
        arrays[indexA] = a;
        System.out.println("Result: " + Arrays.toString(arrays) + "\n");
    }
    private static void swap2(int [] arrays, int indexA, int indexB){
        System.out.println("Trying swap: " + Arrays.toString(arrays) + " indices " + indexA + " and " + indexB);
        if (indexB < 0 || indexB >= arrays.length ) {
            System.out.println("indexB (" + indexB + ") incorrect!");
        }
        else if(indexA < 0 || indexA >= arrays.length ){
            System.out.println("indexA (" + indexA + ") incorrect!");
        }
        else if((indexA & indexB) > 0 | (indexA & indexB) < arrays.length){
            int a = arrays[indexB];
            arrays[indexB] = arrays[indexA];
            arrays[indexA] = a;
            System.out.println("Result: " + Arrays.toString(arrays));
        }
    }
}
