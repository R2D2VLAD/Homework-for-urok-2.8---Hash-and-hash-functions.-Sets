package Автогонки;

public class categoryC <C extends Trucks> extends Driver {

    public categoryC(String FIO) {
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

    public void categoryC(Trucks cars) {
        System.out.println("Водитель " + getFIO() + ", управляет автомобилем " + cars.getBrand() + " " + cars.getModel() +
                " и будет учавствовать в заезде!");
    }
}
