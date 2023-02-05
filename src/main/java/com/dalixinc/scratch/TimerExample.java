package com.dalixinc.scratch;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Scanner;

public class TimerExample {
    private static int count = 0;
    private static AtomicBoolean running = new AtomicBoolean(true);

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (running.get()) {
                    System.out.println("Time passed: " + count + " seconds");
                    count++;
                }
            }
        }, 0, 1000);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("pause")) {
                running.set(false);
            } else if (input.equals("resume")) {
                running.set(true);
            }
        }
    }
}
