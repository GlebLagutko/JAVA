package kr;

import java.util.Objects;

public abstract class Car implements Comparable<Car> {
    private String name;
    private int fuelСonsumption;
    private Fuel fuelType;
    private int year;


    public Car(String name, int count, Fuel treeType,int year) {
        this.name = name;
        this.fuelСonsumption = count;
        this.fuelType = treeType;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Name : " + name + " Type: " + fuelType + " Count: " + fuelСonsumption + " Year :" + year;
    }

    @Override
    public int compareTo(Car o) {
        return year - o.year == 0 ?  fuelСonsumption - o.fuelСonsumption : -(year - o.year) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelСonsumption == car.fuelСonsumption &&
                year == car.year &&
                Objects.equals(name, car.name) &&
                fuelType == car.fuelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fuelСonsumption, fuelType, year);
    }
}
