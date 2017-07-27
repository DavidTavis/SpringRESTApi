package my.first.web.service.service;

import my.first.web.service.entity.Car;
import my.first.web.service.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository repository;

    public List<Car> getAll() {
        return repository.findAll();
    }

    public Car getByID(long id) {
        return repository.findOne(id);
    }

    public Car save(Car car) {
        return repository.saveAndFlush(car);
    }

    public void remove(long id) {
        repository.delete(id);
    }

}
