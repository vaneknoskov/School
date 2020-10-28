package module01;

import java.util.Scanner;

public class lesson07_loops {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for(int i = 10; i <= 20; i++){
            System.out.println("Квадрат числа от " + i + " = " + (i * i));
        }

        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = scanner.nextInt();
        int i = 1;
        while(i * i <= N){
            System.out.println("Квадрат числа от " + i + " = " + (i * i));
            i++;
        }

        System.out.println("Task 3");
        int [] array = {10, 20, 15, 17, 24, 35};
        int mul = 1;
        for (int x : array) {
            mul *= x;
        }
        System.out.println(mul);

        System.out.println("Task 4");

        int j = 0;
        int k = 7;
        while (j < k){
            for (int l = 0; l < k - j; l++){
                System.out.print(" ");
            }
            for(int l = 0; l < j * 2 + 1; l++){
                System.out.print("*");
            }
            System.out.println();
            j++;
        }
    }
}



