package com.teachmeskills.lesson20.task2;

import com.teachmeskills.lesson20.task2.model.AddCar;
import com.teachmeskills.lesson20.task2.model.ServiceStation;
import com.teachmeskills.lesson20.task2.model.TakeCar;

/**
 * 2. There is a station service. A maximum of a certain number of machines can be serviced at a service station.
 * Create a class that will run in a separate thread and will add machines for maintenance to the service station.
 * Create a class that will run in a separate thread and will pick up fixed machines from the service station.
 * Let the maximum number of machines available for maintenance be set in the interface for storing constants.
 * Use synchronized, wait, notify.
 */

public class Runner {

    public static void main(String[] args) {

        ServiceStation serviceStation=new ServiceStation();

        AddCar addCar=new AddCar(serviceStation);
        Thread threadAdd=new Thread(addCar);
        threadAdd.start();

        TakeCar takeCar=new TakeCar(serviceStation);
        Thread threadTake=new Thread(takeCar);
        threadTake.start();

    }

}
