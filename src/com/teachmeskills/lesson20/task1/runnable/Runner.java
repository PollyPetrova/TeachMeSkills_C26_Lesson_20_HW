package com.teachmeskills.lesson20.task1.runnable;

import com.teachmeskills.lesson20.task1.runnable.model.MorningRoutine;

/**
 *1. Create a program that simulates the morning: reading the news, breakfast, coffee.
 * Set a name and priority for each thread from the config file.
 * Let there be 3 streams.
 * Create and run 3 threads.
 * Make two options: using the Runnable interface and using the Thread class.
 */

public class Runner {

    public static void main(String[] args) {

        MorningRoutine readingNews=new MorningRoutine("Reading", 10);
        MorningRoutine eatingBreakfast=new MorningRoutine("Eating", 7);
        MorningRoutine drinkingCoffee=new MorningRoutine("Drinking", 5);

        Thread news=new Thread(readingNews);
        Thread breakfast=new Thread(eatingBreakfast);
        Thread coffee=new Thread(drinkingCoffee);

        news.start();
        breakfast.start();
        coffee.start();

    }

}
