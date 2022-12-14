package Автогонки;

public class categoryD <D extends Bus> extends Driver {

    public categoryD(String FIO) {
        super(FIO);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuelCar() {

    }

    public void categoryD(Bus cars) {
        System.out.println("Водитель " + getFIO() + ", управляет автомобилем " + cars.getBrand() + " " + cars.getModel() +
                " и будет учавствовать в заезде!");
    }
}