package mate.jdbc.service;

import java.util.List;
import java.util.Optional;
import mate.jdbc.model.Car;
import mate.jdbc.model.Driver;

public interface CarService {
    Car create(Car car);

    Optional<Car> get(Long id);

    List<Car> getAll();

    Car update(Car car);

    boolean delete(Car id);

    List<Car> getAllByDriver(Long driverId);

    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);
}
