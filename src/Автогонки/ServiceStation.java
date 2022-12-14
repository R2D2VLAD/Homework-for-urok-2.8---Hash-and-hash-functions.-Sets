package Автогонки;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Car> cars = new ArrayDeque<>();

    private void add(Car car) {
        car.offer(car);
    }

    public void addPassengerCars(passengerCars passengerCars) {
        add(passengerCars);
    }

    public void addTruck(Trucks trucks) {
        add(trucks);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();
            boolean result = car.service();
            if (!result) {
                car.repair();
            }
        }
    }
}