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
        System.out.println(num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10");
    }
}

