import com.dubyna.model.Car;
import com.dubyna.service.CarService;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();
        Car firstCar = carService.create();
        Car secondCar = carService.create();
        Car thirdCar = carService.create();
        carService.print(firstCar, secondCar, thirdCar);
    }


}
