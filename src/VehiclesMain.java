import vehicles.Car;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VehiclesMain {
    public static void main(String[] args) {
        Car[] arraysOfCars = new Car[5];

        arraysOfCars [0] = new Car("Opel","Corsa");
        arraysOfCars [1] = new Car("BMW", "e46");
        arraysOfCars [2] = new Car("Seat","Ibiza");
        arraysOfCars [3] = new Car("Fiat", "126p");
        arraysOfCars [4] = new Car("Subaru", "Impreza WRX");

        System.out.println(arraysOfCars[0]); // wiec toString jest u nas nie potrzebny bo mamy show
        arraysOfCars[0].show();
        System.out.println(Arrays.toString(arraysOfCars));
        System.out.println();

//        arraysOfCars[2].setModel("A7");

        Car thirdCar = arraysOfCars[2];
        thirdCar.setModel("A7");

        for (Car car : arraysOfCars){
            car.show();
        }
        System.out.println();

        Arrays.stream(arraysOfCars).forEach(System.out::println);  // ale to są strumienie i to bedzie pozniej, ale to jest duzo ładniejsze
        Arrays.stream(arraysOfCars).forEach(Car::show);

    }
}
