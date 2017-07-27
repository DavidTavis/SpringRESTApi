package my.first.web.service.service;

import my.first.web.service.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAll();
    Car getByID(long id);
    Car save(Car car);
    void remove(long id);

}
