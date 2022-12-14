package Автогонки;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        passengerCars lada = new passengerCars("Lada", "Granta", 1.5, TypeOfBody.CROSSOVER);
        System.out.println(lada);
        lada.startMovement();
        lada.endMovement();
        lada.pitStop();
        lada.bestLapTime();
        lada.maxSpeed();
        lada.addDriver(new categoryB<>("Павел Дуров"));
        lada.addMechanic(new Mechanic<passengerCars>("Пётр", "Ивонович", "DRIVE"));
        System.out.println();

        passengerCars bmw = new passengerCars("BMW", "Z8", 3.0, TypeOfBody.HATCHBACK);
        System.out.println(bmw);
        bmw.startMovement();
        bmw.endMovement();
        bmw.pitStop();
        bmw.bestLapTime();
        bmw.maxSpeed();
        passengerCars audi = new passengerCars("Audi", "A8 50 L TDI quattro", 3.0, TypeOfBody.CROSSOVER);
        System.out.println(audi);
        audi.startMovement();
        audi.endMovement();
        audi.pitStop();
        audi.bestLapTime();
        audi.maxSpeed();
        passengerCars kia = new passengerCars("Kia", "Soretto", 2.0, TypeOfBody.SEDAN);
        System.out.println(kia);
        kia.startMovement();
        kia.endMovement();
        kia.pitStop();
        kia.bestLapTime();
        kia.maxSpeed();
        System.out.println();

        Trucks volvo = new Trucks("Volvo", "FL7", 5.0, Weight.N2);
        System.out.println(volvo);
        volvo.startMovement();
        volvo.endMovement();
        volvo.pitStop();
        volvo.bestLapTime();
        volvo.maxSpeed();
        Trucks nissan = new Trucks("Nissan", "UD1452C", 4.2, Weight.N1);
        System.out.println(nissan);
        nissan.startMovement();
        nissan.endMovement();
        nissan.pitStop();
        nissan.bestLapTime();
        nissan.maxSpeed();
        Trucks jac = new Trucks("JAC", "HFC1061K", 6.0, Weight.N3);
        System.out.println(jac);
        jac.startMovement();
        jac.endMovement();
        jac.pitStop();
        jac.bestLapTime();
        jac.maxSpeed();
        Trucks ford = new Trucks("Ford", "Cargo", 3.0, Weight.N2);
        System.out.println(ford);
        ford.startMovement();
        ford.endMovement();
        ford.pitStop();
        ford.bestLapTime();
        ford.maxSpeed();
        System.out.println();

        Bus ikarus = new Bus("ikarus", "66", 2.5, Capacity.AVERAGE);
        System.out.println(ikarus);
        ikarus.startMovement();
        ikarus.endMovement();
        ikarus.pitStop();
        ikarus.bestLapTime();
        ikarus.maxSpeed();
        Bus mercedes = new Bus("Mercedes-Benz", "O321H", 3.0, Capacity.BIG);
        System.out.println(mercedes);
        mercedes.startMovement();
        mercedes.endMovement();
        mercedes.pitStop();
        mercedes.bestLapTime();
        mercedes.maxSpeed();
        Bus zil = new Bus("ЗИЛ", "3250AO", 2.0, Capacity.SMALL);
        System.out.println(zil);
        zil.startMovement();
        zil.endMovement();
        zil.pitStop();
        zil.bestLapTime();
        zil.maxSpeed();
        Bus wolkswagen = new Bus("Wolkswagen", "DSA50", 4.0, Capacity.ESPECIALLY_SMALL);
        System.out.println(wolkswagen);
        wolkswagen.startMovement();
        wolkswagen.endMovement();
        wolkswagen.pitStop();
        wolkswagen.bestLapTime();
        wolkswagen.maxSpeed();
        System.out.println();


        categoryB<passengerCars> auto1 = new categoryB<>("Павел Дуров");
        auto1.categoryB(bmw);

        categoryC<Trucks> auto2 = new categoryC<>("Джордж Вашингтон");
        auto2.categoryC(nissan);

        categoryD<Bus> auto3 = new categoryD<>("Моргенштерн");
        auto3.categoryD(wolkswagen);

        List<Car> cars = List.of(lada, bmw, audi, kia, volvo, nissan, jac, ford,
                ikarus, mercedes, zil, wolkswagen);

        for (Car car : cars) {
            printInfo(car);
        }
        example();
    }

    private static void printInfo(Car car) {
        System.out.println("Информация по автомобилю " + car.getBrand() + " " + car.getModel());
        System.out.println("Водители:");
        for (Driver driver : car.driversList) {
            System.out.println(driver.getFIO());
        }

        System.out.println("Спонсоры:");
        for (Sponsor sponsor : car.sponsorList) {
            System.out.println(sponsor.getName());
            System.out.println();
            System.out.println("Механики:");
            for (Mechanic mechanic : car.mechanicsList) {
                System.out.println(mechanic.getName() + " " + mechanic.getSurname());
            }
        }
    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i + j) % 2 == 1 ? "●" : "◯");
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}