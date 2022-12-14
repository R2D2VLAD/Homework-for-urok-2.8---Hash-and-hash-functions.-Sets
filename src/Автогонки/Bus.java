package Автогонки;

public class Bus extends Car implements Competing {

    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Вместимость автобуса - " + capacity.getFrom());
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобусы проходить диагностику не могут!");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен!");
    }

    public void startMovement() {
        System.out.println("Поехали!");
    }

    public void endMovement() {
        System.out.println("Стоп!");
    }

    @Override
    public void pitStop() {
        System.out.println("I'm going to the pit stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("best lap time 14.12");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed 312 km/h");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() +
                " " + getModel() +
                ". Объём двигателя - " + getEngineVolume();
    }
}
