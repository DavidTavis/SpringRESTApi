package my.first.web.service.service;

import my.first.web.service.entity.Driver;

import java.util.List;

/**
 * Created by TechnoA on 23.07.2017.
 */
public interface DriverService {
    List<Driver> getAll();
    Driver getByID(long id);
    Driver save(Driver driver);
    void remove(long id);
}
