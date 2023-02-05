package com.dalixinc.components;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

public class WorkTimer {

    private final Timer timer;

    private static int count = 0;
    private static AtomicBoolean running = new AtomicBoolean(false);

    public WorkTimer() {
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (running.get()) {
                    System.out.println("Time passed: " + count + " seconds");
                    count++;
                }
            }
        }, 0, 1000);
    }
}
