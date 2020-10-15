package module01;
                            /////////// TASK 31 ////////////
public class Lesson3DataTypes {
    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte)255;
        byte c = (byte) (a - b);
        System.out.println("Result: " + c);

        // Байтовый тип данных содержит от -128 до 127 значений и занимает 8 бит памяти.
    }

    void programTask32(){
        short a = -32768;
        short b = 32767;
        short c = (short)(a + b);
        System.out.println("Result: " + c);

        // Тип данных short содержит от -32768 до 32767 значений и занимает 16 бит памяти
    }

    void programTask33(){
        int x = 1200;
        System.out.println(x);
        System.out.println(Math.sqrt(x));
        System.out.println(Math.cbrt(x));

        // Тип данных int содержит от -2 147 483 648 до 2 147 483 647 и занимает 32 бита памяти

    }

    void programTask34(){
        long l = Long.MAX_VALUE;

        // Возможно использовать для замера времени в секундах запущеных у устройства с момента включения
    }

    void programTask35(){
        float A = 1245.554f;
        double B = 256.3785;
        double C = A * B;
        System.out.println((A*B)%1);

        // float занимает 32бита и содержит от -3.4E+38 до 3.4E+38
        // double занимает 64 бита и содержит от -1.7E+308 до 1.7E+308
    }
}





