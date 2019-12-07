package kr;

import java.util.Objects;

public class FreightCar extends Car {

    private int capacity;
    private int countOfWheels;

    public FreightCar(String name, int count, int year, Fuel fuelType, int capacity,int countOfWheels) {
        super(name, count, fuelType, year);
        this.capacity = capacity;
        this.countOfWheels = countOfWheels;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return super.toString() + " Capacity: " + capacity + " Count of wheels : "+ countOfWheels ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreightCar that = (FreightCar) o;
        return capacity == that.capacity &&
                countOfWheels == that.countOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity, countOfWheels);
    }
}
