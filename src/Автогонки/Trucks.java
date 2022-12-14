package Автогонки;

public class Trucks extends Car implements Competing {

    private Weight weight;
    public Trucks(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Грузоподъёмность авто - " + weight.getFrom());
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен!");
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
        System.out.println("best lap time 18.22");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed 300 km/h");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() +
                " " + getModel() +
                ". Объём двигателя - " + getEngineVolume();
    }
}