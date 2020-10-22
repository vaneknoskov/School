package module01;

public class Lesson4Operator {
    public static void main(String[] args) {

        System.out.println("///////////////PT41   Math operator  //////////////");

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
        comparisonOperators();
        logicalOperators();
        bitwiseOperators();
    }

    static void assignmentOperators(){
        System.out.println("////////PT42 AssignmentOperator //////////");

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
        System.out.println("////////////PT43  Increment and decrement operators ///////////");

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

    static void comparisonOperators(){
        System.out.println("/////////PT44 Comparison Operators ///////////");
        int a = 3;
        int b = 5;
        compare(a,b);

        a = 5;
        compare(a,b);
        // Результат изменился из-за изменения переменной "a" на аналогичное значение переменной "b"
        // Оператор сравнения возращает boolean

        boolean c = (a != b);
        System.out.println(c); // так как a не равно(!=) b, то возвращает false
    }

    static void compare(int a, int b){
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println();
    }

    static void logicalOperators(){
        System.out.println("//////////PT45 Logical Operators ///////////");
        boolean bOne = true;
        boolean bTwo = false;

        compareBool(bOne, bTwo);

        bTwo = true;

        compareBool(bOne, bTwo);

        // Логические операторы возращают boolean
        //NOT!  я незнаю в чем разница.
        //Разница && от & в том, что при использовании && идет проверка левого операнда, и
        //если он false , то оператор возвращает false без проверки второго операнда.
        //Так же происходит с || и |, при || если слева true, то возрвщает true без проверки второго операнда.

        /*
        a. true || false        true
        b. false && true        false
        c. !true || 1 >= 0      true
        d. false && 5           не будет работать, должна идти boolean проверка
        e. true &&! false       true
        f. true ^! true         true
        i. 1> = 1 || false      true
        g. true && 5 - 5        тоже не будет работать
         */

    }
    static void compareBool(boolean a , boolean b){
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(! a);
        System.out.println(! b);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println();
    }

    static void bitwiseOperators(){
        System.out.println("//////////PT46  Bitwise Operators  ////////////");


    }

}
