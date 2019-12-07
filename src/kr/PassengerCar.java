package kr;

import java.util.Objects;

public class PassengerCar extends Car {
    private BodyType body;

    public PassengerCar(String name, int count, int year, Fuel fuelType, BodyType body) {
        super(name, count, fuelType, year);
        this.body = body;
    }

    public BodyType getBody() {
        return body;
    }

    public void setBody(BodyType body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return super.toString() + " Body type :" + body;
    }

    @Override
    public boolean equals(Object o) {
        PassengerCar temp = (PassengerCar) o;
        return super.equals(o) && body == temp.body;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body);
    }
}
