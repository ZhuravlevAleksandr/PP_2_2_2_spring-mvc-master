package web.dao;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Volkswagen", "Polo", 1_500_000));
        carList.add(new Car("Toyota", "Camry", 2_500_000));
        carList.add(new Car("BMW", "X5", 6_500_000));
        carList.add(new Car("Lada", "Vesta", 1_200_000));
        carList.add(new Car("Subaru", "Forester", 3_000_000));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
