package module03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson06_comparable_comporator {


    public static void main(String[] args) {
        Car car = new Car("X6", 260);
        Car car1 = new Car("YAZ", 60);
        Car car2 = new Car("Lancer", 200);
        Car car3 = new Car("Lada 2110", 160);

        ArrayList<Car> auto = new ArrayList<>();
        auto.add(car);
        auto.add(car1);
        auto.add(car2);
        auto.add(car3);

        Collections.sort(auto);

        System.out.println(auto);


    }
}

class Car implements Comparable<Car>{
     String model;
     int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car " +
                "model='" + model + '\'' +
                ", speed=" + speed;
    }
    @Override
    public int compareTo(Car o) {
        return Integer.compare(speed, o.speed);

    }

}

class ComparatorAuto implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.model.compareTo(o2.model);
    }
}
