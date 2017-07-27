package my.first.web.service.repository;

import my.first.web.service.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TechnoA on 23.07.2017.
 */
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
