package module02;

import java.util.Date;


public class Lesson01_classes {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 27);
        person.meditation();
    }
}

class Person{

    Date date = new Date();

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person - " +
                "name ='" + name + '\'' +
                ", age = " + age;
    }

    public void meditation(){
        System.out.println("I think - it means I exist." + "( " + name + " ) " + date);
    }

}
