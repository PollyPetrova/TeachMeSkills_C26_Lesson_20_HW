package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.utils.Const;

public class TakeCar implements Runnable{

    ServiceStation serviceStation;

    public TakeCar(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        takeCar();
    }

    private void takeCar(){
        for (int i = 1; i <= Const.AMOUNT_OF_CARS_TO_SERVICE; i++) {
            serviceStation.take();
        }
    }

}
