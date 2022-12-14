package Автогонки;

public class passengerCars extends Car implements Competing { // легковые авто

    private TypeOfBody typeOfBody;

    public passengerCars(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void startMovement() {
        System.out.println("Поехали!");
    }

    public void endMovement() {
        System.out.println("Стоп!");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Тип кузова авто - " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена!");
    }

    @Override
    public void pitStop() {
        System.out.println("I'm going to the pit stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("best lap time 15.1");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed 295 km/h");
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() +
                " " + getModel() +
                ". Объём двигателя - " + getEngineVolume();
    }
}
