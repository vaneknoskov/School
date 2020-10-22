package module01;

public class Lesson5Conditions {
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
    }
}

