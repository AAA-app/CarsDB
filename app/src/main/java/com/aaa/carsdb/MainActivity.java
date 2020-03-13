package com.aaa.carsdb;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        // test 1 added
        /*databaseHandler.addCar(new Car("Toyota", "30 000 $"));
        databaseHandler.addCar(new Car("Opel", "25 000 $"));
        databaseHandler.addCar(new Car("Mercedes", "55 000 $"));
        databaseHandler.addCar(new Car("KIA", "28 000 $"));
        databaseHandler.addCar(new Car("Mazda", "30 000 $"));
        databaseHandler.addCar(new Car("Honda", "25 000 $"));
        databaseHandler.addCar(new Car("B.M.V", "60 000 $"));
        databaseHandler.addCar(new Car("Hyundai", "28 000 $"));*/

        List<Car> carList = databaseHandler.getAllCars();

        //test 4 get count cars
        Log.e("CarsCount ", String.valueOf(databaseHandler.getCarsCout()));


//        // test 3 deleting
//        Car deletingCar = databaseHandler.getCar(1);
//        databaseHandler.deleteCar(deletingCar);

        for (Car car : carList) {
            Log.e("CarInfo:", "ID " + car.getId() + ", name " + car.getName() +
                    ", price " + car.getPrice());
        }


        // test 2 update for id
        /*Car car = databaseHandler.getCar(7);

        car.setName("Tesla");
        car.setPrice("85 000 $");

        int updateCardId = databaseHandler.updateCar(car);

        Log.e("CarInfo:", "ID " + car.getId() + ", name " + car.getName() +
                ", price " + car.getPrice() + " , updateCardId " + updateCardId);*/


    }
}
