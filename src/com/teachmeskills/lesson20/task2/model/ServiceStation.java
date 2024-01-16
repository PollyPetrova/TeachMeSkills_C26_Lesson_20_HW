package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.utils.Const;

public class ServiceStation {

    private int car=0;

    public synchronized void add(){
        while (car>= Const.MAX_AMOUNT_OF_CAR_ON_SERVICE_STATION){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        car++;
        System.out.println("The car was taken to the service station");
        System.out.println("Amount of the cars on the station service "+car);
        notify();
    }

    public synchronized void take(){
        while (car<1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        car--;
        System.out.println("The car finished machine maintenance");
        System.out.println("Amount of the cars on the station service "+car);
        notify();
    }

}
