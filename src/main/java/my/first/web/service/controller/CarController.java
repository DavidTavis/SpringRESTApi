package my.first.web.service.controller;

import my.first.web.service.entity.Car;
import my.first.web.service.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService service;

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    @ResponseBody
    public List<Car> getCars() {
        return service.getAll();
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Car getCar(@PathVariable("id") long carID) {
        return service.getByID(carID);
    }

    @RequestMapping(value = "/cars", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    public Car saveCar(@RequestBody Car car) {
        return service.save(car);
    }

    @RequestMapping(value = "/cars/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCar(@PathVariable long id) {
        service.remove(id);
    }
}
