package kr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyContainer<PassengerCar> listPassenger = fillPassengerContainer();
        MyContainer<FreightCar> listFreight = fillFreightContainer();
        System.out.println("Passenger : ");
        listPassenger.demo(new PassengerCar("BMW", 12, 2013, Fuel.DIESEL,BodyType.SEDAN),"BMW");
        System.out.println("Freight : ");
        listFreight.demo(new FreightCar("Car1", 34,56,Fuel.DIESEL, 230, 12),"Car5");
    }

   private static MyContainer<FreightCar> fillFreightContainer() {
        MyContainer<FreightCar> listForest = new MyContainer<>();
        try (Scanner sc = new Scanner(new File("src\\kr\\input2"))) {
            while (sc.hasNext()) {
                FreightCar tr = new FreightCar(sc.next(), sc.nextInt(), sc.nextInt(),Fuel.toType(sc.next()), sc.nextInt(), sc.nextInt());
               listForest.add(tr);
            }
        } catch (FileNotFoundException ex) {

        } catch (EnumIncorrectException ex) {
            System.out.println(ex.getMessage());
        }
        return listForest;
    }

    private static MyContainer<PassengerCar> fillPassengerContainer() {
        MyContainer<PassengerCar> listPassenger = new MyContainer<>();
        try (Scanner sc = new Scanner(new File("src\\kr\\input1"))) {
            while (sc.hasNext()) {
                PassengerCar tr = new PassengerCar(sc.next(), sc.nextInt(), sc.nextInt(),Fuel.toType(sc.next()),BodyType.toType(sc.next()));
                listPassenger.add(tr);
            }
        } catch (FileNotFoundException ex) {

        } catch (EnumIncorrectException ex) {
            System.out.println(ex.getMessage());
        }
        return listPassenger;
    }
}
