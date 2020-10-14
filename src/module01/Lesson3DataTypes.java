package module01;

public class Lesson3DataTypes {
    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte)255;
        byte c = (byte) (a - b);
        System.out.println("Result: " + c);
    }
}
