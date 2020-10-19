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
      //1 = (b = b - 1) = 3   в этом случае мы вычисляем значение b и сразу присваиваем его к a
        System.out.println("a : " + a + "\n" + "b : " + b);
        a = b--;
      //3 = 3 , b = b - 1     в этом случае мы сразу же присваиваем значение a к b , и только потом изменяем значение b
        System.out.println("a :" + a + "\n" + "b : " + b);

        /* Преинкремент (++a) и предекремент (--b) работают по такому принципу, мы
        увеличиваем(уменьшаем) значение на 1 и используем уже новое значение в нашем примере,
        а в случае с постинкрементом (a++) и постдекрементом(b++) все ровно наоборот,
        мы используем старое значение a и b в нашем примере, и уже после этого изменяем
        его значение.
        * */

    }
}
