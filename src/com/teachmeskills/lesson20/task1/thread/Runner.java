package com.teachmeskills.lesson20.task1.thread;

import com.teachmeskills.lesson20.task1.thread.model.MorningRoutine;

/**
 * 1. Create a program that simulates the morning: reading the news, breakfast, coffee.
 * Set a name and priority for each thread from the config file.
 * Let there be 3 streams.
 * Create and run 3 threads.
 * Make two options: using the Runnable interface and using the Thread class.
 */

public class Runner {

    public static void main(String[] args) {

        MorningRoutine news=new MorningRoutine("Reading", 10);
        news.start();

        MorningRoutine breakfast=new MorningRoutine("Eating", 7);
        breakfast.start();

        MorningRoutine coffee=new MorningRoutine("Drinking", 4);
        coffee.start();

    }

}
