package module03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson06_comparable_comporator {


    public static void main(String[] args) {
        Car car = new Car("Audi", 260);
        Car car1 = new Car("YAZ", 60);
        Car car2 = new Car("Mercedes", 230);
        Car car3 = new Car("Lada", 160);
        Car car4 = new Car("Audi", 160);

        ArrayList<Car> auto = new ArrayList<>();
        auto.add(car);
        auto.add(car1);
        auto.add(car2);
        auto.add(car3);
        auto.add(car4);

        Collections.sort(auto);

        System.out.println(auto);

        ComparatorAuto comparatorAuto = new ComparatorAuto();

        Collections.sort(auto, comparatorAuto);

        System.out.println(auto);

        ComparatorAutoModelSpeed comparatorAutoModelSpeed = new ComparatorAutoModelSpeed();

        Collections.sort(auto, comparatorAutoModelSpeed);

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
        return Integer.compare(speed, o.speed); // сортировка скорости по возрастанию

    }

}

class ComparatorAuto implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o2.model.compareTo(o1.model); // сортировка по моделям по убиванию(в алф. пор.)
    }                                        // поменяв местами о2 <- о1 будет сортировка по возр.
}

class ComparatorAutoModelSpeed implements Comparator <Car>{

    @Override
    public int compare(Car o1, Car o2) {
        int sortModel = o1.model.compareTo(o2.model);
        return sortModel == 0 ? o2.speed - o1.speed : sortModel;

    }
}
