package module01;

public class Lesson08_methods {
    public static void main(String[] args) {
        // 1. Parameters
        evenAndOdd();
        fromOneToX(20);
    }

    static void evenAndOdd() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.print("Нечетное - " + i + " ");
            } else {
                System.out.println("Четное - " + i);
            }
        }
    }

    static void fromOneToX(int x){
        int sum = 0;
        for(int i = 1; i<= x; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
