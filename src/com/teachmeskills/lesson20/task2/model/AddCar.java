package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.utils.Const;

public class AddCar implements Runnable{

    ServiceStation serviceStation;

    public AddCar(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        addCar();
    }

    private void addCar(){
        for (int i = 1; i <=Const.AMOUNT_OF_CARS_TO_SERVICE; i++) {
            serviceStation.add();
        }
    }

}
