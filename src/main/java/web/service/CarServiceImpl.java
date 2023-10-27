package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private List<Car> carsList;

    public CarServiceImpl () {
        carsList = new ArrayList<>();
        carsList.add(new Car(1.6, "Urus", 1000));
        carsList.add(new Car(1.7, "Urus1", 2000));
        carsList.add(new Car(1.8, "Urus2", 3000));
        carsList.add(new Car(1.9, "Urus3", 4000));
        carsList.add(new Car(2.0, "Urus4", 5000));
    }

    public List<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }

    @Override
    public List<Car> getCarsService(int count, List<Car> defaultCars) {
     return (defaultCars.size() > count) ?
             defaultCars.stream().limit(count).collect(Collectors.toList())
             : defaultCars;
    }
}
