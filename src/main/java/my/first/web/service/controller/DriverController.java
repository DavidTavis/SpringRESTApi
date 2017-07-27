package my.first.web.service.controller;

import my.first.web.service.entity.Driver;
import my.first.web.service.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService service;

    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    @ResponseBody
    public List<Driver> getDrivers() {
        return service.getAll();
    }

    @RequestMapping(value = "/drivers/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Driver getDriver(@PathVariable("id") long driverID) {
        return service.getByID(driverID);
    }

    @RequestMapping(value = "/drivers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    public Driver saveDriver(@RequestBody Driver driver) {
        return service.save(driver);
    }

    @RequestMapping(value = "/drivers/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteDriver(@PathVariable long id) {
        service.remove(id);
    }

    @RequestMapping(value = "/drivers/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    @ResponseBody
    public Driver updateDriver(@RequestBody Driver driver, @PathVariable long id) {
        return service.save(driver);
    }

}
