package Автогонки;

public class categoryB <B extends passengerCars> extends Driver {

    public categoryB(String FIO) {
        super(FIO);
    }

    @Override
    public void startMoving() {
        System.out.println("Старт");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }

    @Override
    public void refuelCar() {
        System.out.println("Топливо");
    }

    public void categoryB(passengerCars cars) {
        System.out.println("Водитель " + getFIO() + ", управляет автомобилем " + cars.getBrand() + " " + cars.getModel() +
                " и будет учавствовать в заезде!");
    }
}