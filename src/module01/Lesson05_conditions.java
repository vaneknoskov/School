package module01;


import java.util.Scanner;

public class Lesson05_conditions {
    public static void main(String[] args) {
        System.out.println("Task 1." + "\n" + "Ничего не будет выведено на консоль." + "\n");
        System.out.println("Task 2.");
        System.out.println("На консоль выведет \"It is 'else' statement\" , так как в условии к блоку if");
        System.out.println("используем в проверке постинкремент, поэтому выводится только блок else.");
        System.out.println("Task 3.");
        int a = 34;
        int b = 2;
        int c = 78;

        if (a > b && a > c) {
            System.out.println("Максимальное число это 'a' ");
        } else if (b > a && b > c) {
            System.out.println("Максимальное число это 'b' ");
        } else {
            System.out.println("Максимальное число это 'c' ");
        }
        if (a < b && a < c){
            System.out.println("Минимальное число это 'a' ");
        } else if (b < a && b < c){
            System.out.println("Минимальное число это 'b ");
        } else {
            System.out.println("Минимальное число это 'c' ");
        }

        System.out.println("Task 4");
        int a1 = 10;
        int c1 = a1;
        int b1 = ++a1;
        if (b1 > a1){
            if (c1 == 10){
                if ((c1 <= b1) && (a1 != b1)){
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

        System.out.println("Task 5");
        /*int num = 8;
        String message = "";
            if(num > 10) {
            message = "Number is greater than 10";
            } else {
            message = "Number is less than or equal to 10";
        }
        * */
        int num = 8;
        String message = "";
        String result = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
        System.out.println(result);

        System.out.println("Task 6");
        System.out.println("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 1: case 2: case 12:
                System.out.println("Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введите чило от 1 до 12");
        }

        System.out.println("Task 7");
        System.out.println("Enter the day of the week.");
        Scanner scanner1 = new Scanner(System.in);
        String day = scanner1.next().toLowerCase(); // it can be any day

        switch(day) {
            case "monday":
                System.out.println("This is the first day of the week");
                break;
            case "tuesday":
                System.out.println("This is the second day of the week");
                break;
            case "wednesday":
                System.out.println("This is the third day of the week");
                break;
            case "thursday":
                System.out.println("This is the fourth day of the week");
                break;
            case "friday":
                System.out.println("This is the fifth day of the week");
                break;
            case "saturday":
                System.out.println("This is the sixth day of the week");
                break;
            case "sunday":
                System.out.println("This is the seventh day of the week");
                break;
            default:
                System.out.println("Such day of the week doesn't exist.");
        }

        System.out.println("The end. ^^");
    }
}

