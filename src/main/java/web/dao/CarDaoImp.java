package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 2015));
        cars.add(new Car(1, "Volvo", 2011));
        cars.add(new Car(1, "Lada", 2008));
        cars.add(new Car(1, "WV", 2005));
        cars.add(new Car(1, "Chevrolet", 2018));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getListCars(Integer count) {
        if (count == null || count >= 5) return cars;
        return cars.stream().limit(count).toList();
    }
}
