package web.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Chevrolet", "Malibu", 2018));
        cars.add(new Car("Nissan", "Altima", 2022));
    }

    public List<Car> getCars(int count) {
        if (count <= 0 || count > cars.size()) {
            return cars; // Возвращаем весь список, если count некорректен
        }
        return cars.subList(0, count);
    }
}

