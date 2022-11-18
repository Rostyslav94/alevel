import com.dubyna.model.Car;
import com.dubyna.repository.CarRepository;
import com.dubyna.servise.CarServise;

public class Main {

    public static void main(String[] args) {
        CarServise carServise = new CarServise(new CarRepository());
        Car firstCar = carServise.create();
        Car secondCar = carServise.create();
        Car thirdCar = carServise.create();
        carServise.print(firstCar);
        carServise.check(firstCar);
        carServise.print(secondCar);
        carServise.check(secondCar);
        carServise.print(thirdCar);
        carServise.check(thirdCar);
        carServise.create(3);
        carServise.printAll();
        carServise.insert(1, firstCar);
        carServise.printAll();
    }
}
