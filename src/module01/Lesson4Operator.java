package module01;

public class Lesson4Operator {
    public static void main(String[] args) {

        System.out.println("///////////////   Math operator //////////////");

        int a = 10 + 2;
        int b = a + 5;
        int c = (a - b) + 1;
        int d = a * b * c;
        int e = d / 8;
        int f = e % 30;
        int i = -f;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + i );
        assignmentOperators();
        incrementAndDecrementOperators();
    }

    static void assignmentOperators(){
        System.out.println("//////// AssignmentOperator //////////");

        int a = 10;
        System.out.println(a);
        a += 3;
        System.out.println(a);
        a -= 7;
        System.out.println(a);
        a *= 4;
        System.out.println(a);
        a /= 8;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
    }

    static void incrementAndDecrementOperators(){
        System.out.println("////////////  Increment and decrement operators ///////////");

        int a = 0;
        int b = 5;
        a++;
        b--;
        System.out.println("a : " + a + "\n" + "b : " + b );
        a = --b;
        System.out.println("a : " + a + "\n" + "b : " + b);
        a = b--;
        System.out.println("a :" + a + "\n" + "b : " + b);


    }
}
