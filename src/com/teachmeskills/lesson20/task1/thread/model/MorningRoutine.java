package com.teachmeskills.lesson20.task1.thread.model;

public class MorningRoutine extends Thread{

    private String name;
    private int priority;

    public MorningRoutine(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void run() {
        if(this.name.equals("Reading")){
            doReadingNews();
        } else if (this.name.equals("Eating")) {
            doEating();
        }else if (this.name.equals("Drinking")){
            doDrinkingCoffee();
        }
    }

    private void doReadingNews(){
        System.out.println("I am reading news!");
    }

    private void doEating(){
        System.out.println("I am eating!");
    }

    private void doDrinkingCoffee(){
        System.out.println("I am drinking coffee!");
    }

}
