package kr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyContainer<T extends Car> {
    private List<T> list = new ArrayList<>();

    public void add(T value) {
        this.list.add(value);
    }


    public int count(T value) {
        return Collections.frequency(list, value);
    }

    public int countOfOneName(String name) {
        return (int) this.list.stream().filter(p -> p.getName().equals(name)).count();

    }

    public Car[] getThreeMin() throws ContainerSizeException {
        if (this.list.size() < 3)
            throw new ContainerSizeException();
        List<Car> temp = new ArrayList<>(this.list);
        Collections.sort(temp);
        return new Car[]{temp.get(temp.size() - 3), temp.get(temp.size() - 2), temp.get(temp.size() - 1)};
    }

    public void print() {
        List<Car> temp = new ArrayList<>(this.list);
        Collections.sort(temp);
        for (Car c : temp) {
            System.out.println(c);
        }
    }

    public void demo(T car, String name) {
        System.out.println("First task:");
        this.print();
        System.out.println("--------------------------");
        System.out.println("Second task:");
        System.out.println(this.count(car));
        System.out.println("--------------------------");
        System.out.println("Third task:");
        try {
            Car[] arr = getThreeMin();
            for (int i = 0; i < 3; i++) {
                System.out.println(arr[i]);
            }
        } catch (ContainerSizeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("--------------------------");
        System.out.println("Fourth task:");
        System.out.println(this.countOfOneName(name));
        System.out.println("--------------------------");

    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Car c : this.list) {
            str.append(c).append("\n");
        }
        return str.toString();
    }
}
