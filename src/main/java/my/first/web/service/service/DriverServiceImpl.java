package my.first.web.service.service;

import my.first.web.service.entity.Driver;
import my.first.web.service.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository repository;

    public List<Driver> getAll() {
        return repository.findAll();
    }

    public Driver getByID(long id) {
        return repository.findOne(id);
    }

    public Driver save(Driver driver) {
        return repository.saveAndFlush(driver);
    }

    public void remove(long id) {
        repository.delete(id);
    }

}
